package org.sdxchange.dynamo.parser4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.xpath.XPath;
import org.junit.Test;
import org.sdxchange.xmile.devkit.util.XUtil;

public class TestXpathAccess {

    @Test
    public void test() throws IOException {
        InputStream inStream = TestV4Parser.getFileInput("/toNormalize.dyn");
        ANTLRInputStream input = new ANTLRInputStream(inStream);
        DynamoLexer lexer = new DynamoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DynamoParser parser = new DynamoParser(tokens);
        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
        ParserRuleContext tree = parser.t();
        String xpath = "//stockDef/eqn/expr/expr"; // get children of blockStatement
        for (ParseTree t : XPath.findAll(tree, xpath, parser) ) {
            if ( t instanceof RuleContext) {
                if (t.getText().startsWith("DT*")){
                    RuleContext r = (RuleContext)t;
                    System.out.println(parser.getRuleNames()[r.getRuleIndex()]
                            +": "+t.getText());
                    System.out.println("Flows: "+t.getChild(2).getText());
                    for (ParseTree f : XPath.findAll(t.getChild(2), "/expr/funcRef", parser)){
                        System.out.println("   to Change: "+f.getText());
                    }
                }

            }
            else {
                TerminalNode token = (TerminalNode)t;
                System.out.println(token.getText());
            }
        }
    }

    @Test
    public void test2() throws IOException {
        InputStream inStream = TestV4Parser.getFileInput("/toNormalize.dyn");
        ANTLRInputStream input = new ANTLRInputStream(inStream);
        DynamoLexer lexer = new DynamoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DynamoParser parser = new DynamoParser(tokens);
        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
        ParserRuleContext tree = parser.t();
        String xpath = "//stockDef/eqn/expr/expr"; // get children of blockStatement
        for (ParseTree t : XPath.findAll(tree, xpath, parser) ) {
            System.out.println(t.getText());
            if (t.getText().startsWith("DT*")){
//                System.out.println("child2: "+t.getChild(2).getText());
//                System.out.println(t.getChild(2).toStringTree(parser));
                for (ParseTree f : XPath.findAll(t.getChild(2),  "//funcRef", parser)){
                    if (f.getText().contentEquals("DT")){ continue; }
                    System.out.println("to push:  "+f.getText());
                    if (f instanceof ParserRuleContext && t instanceof ParserRuleContext ){
                        System.out.println("It's a parser rule !!!");
                        ParserRuleContext src = (ParserRuleContext) t;
                        ParserRuleContext target = (ParserRuleContext) f;
                        String baseName = src.getParent().getParent().start.getText();
                        baseName = target.start.getText();
                        String liftName = DynamoSymbolFactory.createVarName(baseName);
                        rewriter.insertBefore(src.getParent().getParent().getParent().start, "A\t"+liftName+"="+f.getText()+"\r\n");
                        rewriter.replace(target.start, target.stop, liftName);

                    }
                }
            }

        }
        System.out.println(rewriter.getText());
    }


    @Test
    public void test3() throws IOException {
        InputStream inStream = TestV4Parser.getFileInput("/toNormalize.dyn");
        ANTLRInputStream input = new ANTLRInputStream(inStream);
        DynamoLexer lexer = new DynamoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DynamoParser parser = new DynamoParser(tokens);
        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
        ParserRuleContext tree = parser.t();
        FunctionLiftListener listener = new FunctionLiftListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        listener.setTokens(tokens);
        listener.setRewriter(rewriter);
        listener.setParser(parser);
        walker.walk(listener, tree);
        System.out.println(rewriter.getText());

    }

    @Test
    public void testFlowAnalysis() throws IOException {
        InputStream inStream = TestV4Parser.getFileInput("/testFlowData.dyn");
        ANTLRInputStream input = new ANTLRInputStream(inStream);
        DynamoLexer lexer = new DynamoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DynamoParser parser = new DynamoParser(tokens);
        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
        ParserRuleContext tree = parser.t();
        //
        //Now find stock nodes
        Collection<ParseTree> stocks = XPath.findAll(tree, "//stockDef/eqn/expr", parser);
        for (ParseTree stock: stocks){
            ParserRuleContext stockCtx = (ParserRuleContext) stock;
            System.out.println(stockCtx.getText());
            System.out.println(stockCtx.toStringTree(parser));
            analyzeFlow( stockCtx, parser);
        }

    }

    private void analyzeFlow( ParserRuleContext stockCtx, DynamoParser parser) {
        ParserRuleContext leftPart = (ParserRuleContext) stockCtx.getParent().getChild(0);
        String screenTerm = DynamoSymbolFactory.stripTimeScript( leftPart.getText());
        Collection<ParseTree> vars = XPath.findAll(stockCtx, "//expr/ID", parser);
        vars.addAll(XPath.findAll(stockCtx,"//predefinedVar",parser));
        vars.addAll(XPath.findAll(stockCtx,"//arrayRef",parser));
        System.out.println("Flow -->"+ vars);
        for (ParseTree var: vars){
            String varText = DynamoSymbolFactory.stripTimeScript(var.getText());
//            System.out.println("Processing "+varText);
            if (screenTerm.contentEquals(varText)){
                continue;
            }
            if ( XUtil.hasAncestorNode(var, stockCtx , DynamoParser.RULE_funcRef)){
                continue;
            }
            if ( XUtil.hasAncestorNode(var, stockCtx , DynamoParser.RULE_indexList)){
                continue;
            }
            System.out.println(XUtil.rPad(varText, 15) + flowDir(stockCtx,var)   );
        }
    }


    private boolean flowDir(ParserRuleContext stockCtx, ParseTree var) {
        ParseTree term = var;
        ParserRuleContext node = (ParserRuleContext) var.getParent();
        boolean currentSign = true;
        while (node != stockCtx){
            System.out.println("Node child count: "+node.getChildCount()+" currentSign="+currentSign);
            if (isRightChild(node, term) && isNegationOp(node)){
                currentSign = !currentSign; // invert the sign.
            }
            term = node;
            node = node.getParent();
        }
        //one more time to get top level sign input.
        if (isRightChild(node, term) && isNegationOp(node)){
            currentSign = !currentSign; // invert the sign.
        }
        return currentSign;
    }

    private boolean isRightChild(ParserRuleContext node, ParseTree term) {
        int childCount = node.getChildCount();
        boolean rval = term.equals(node.getChild(childCount));
        System.out.println("isRightChild compares "+node.getChild(childCount-1).getText()+" : "+term.getText()+" returns "+rval);
        return true;
    }

    private boolean isNegationOp(ParserRuleContext node) {
        int childCount = node.getChildCount();
        if (childCount == 1) {
            return false;
        }
        else {
            ParseTree leftOp = node.getChild(childCount-2);
            System.out.println("Op to Left is "+ leftOp.getText());
            return leftOp.getText().contentEquals("-");
        }
    }

    private ParserRuleContext selectFlowExpr(ParserRuleContext stockCtx) {
        ParserRuleContext leftPart = (ParserRuleContext) stockCtx.getParent().getChild(0);
        String screenTerm = DynamoSymbolFactory.stripTimeScript( leftPart.getText());
        for (int i = 0; i < stockCtx.getChildCount(); i++){
            ParseTree node = stockCtx.getChild(i);
            if (DynamoSymbolFactory.stripTimeScript(node.getText()).contentEquals(screenTerm)){
                continue;
            }
            if ( node instanceof TerminalNode) {
                System.out.println("part "+i+": "+node.getText());

            }
            else {
                ParserRuleContext expr = (ParserRuleContext) stockCtx.getChild(i);
                System.out.println("part "+i+": "+expr.getText());
            }
        }
        return null;
    }
}
