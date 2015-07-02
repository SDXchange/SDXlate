package org.sdxchange.dynamo.parser4;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.xpath.XPath;
import org.sdxchange.dynamo.parser4.DynamoParser.ExprContext;


public class FunctionLiftListener
extends DynamoParserBaseListener implements DynamoParserListener, DynamoTreeListener {

    Set<String> arrayIndexValues = new HashSet<String>();
    BufferedTokenStream tokens;
    TokenStreamRewriter rewriter;
    DynamoParser parser;
    Set<String> arrayNames ;
    Map<String, TableInfo> tInfoIndex = new HashMap<String, TableInfo>();

    public FunctionLiftListener(){
    }

    @Override
    public void setTokens(CommonTokenStream tokens) {
        this.tokens = tokens;
    }

    @Override
    public void setRewriter(TokenStreamRewriter rewriter) {
        this.rewriter = rewriter;
    }

    @Override
    public TokenStreamRewriter getRewriter() {
        return this.rewriter;
    }

    @Override
    public void setParser(DynamoParser parser) {
        this.parser = parser;
    }

    @Override
    public void setDefinitions(String space, Set<String> values){
        if (space.contentEquals("ArrayNames")){
            arrayNames = values;
        }
    }

    @Override
    public void exitLVL_EQN(DynamoParser.LVL_EQNContext ctx){
        System.out.println("=====>"+ctx.getText());
//        System.out.println(ctx.toStringTree(parser));
        for (ParseTree t : XPath.findAll(ctx, "//stockDef/eqn/expr/*", parser)){
            System.out.println(t.toStringTree(parser));
//            System.out.println("=====>"+t.getText());
            if (t.getText().startsWith("DT*")) {
                Collection<ParseTree> matches = XPath.findAll(t.getChild(2), "//funcRef", parser);
                for (ParseTree f : matches) {
                    if (f.getText().contentEquals("DT")) {
                        continue;
                    }
                    if (hasFunctionAncestor(f,ctx)){
                        continue;
                    }
                    System.out.println("to push:  " + f.getText());
                    if (f instanceof ParserRuleContext && t instanceof ParserRuleContext) {

                        ParserRuleContext src = (ParserRuleContext) t;
                        ParserRuleContext target = (ParserRuleContext) f;
                        String baseName = src.getParent().getParent().start.getText();
                        baseName = target.start.getText();
                        String liftName = DynamoSymbolFactory.createVarName(baseName);
                        //create new aux
                        rewriter.insertBefore(src.getParent().getParent().getParent().start,
                                NormalizeListener.stripTimeScript("A\t" + liftName + "=" + f.getText() + "\r\n"));
                        //substitute new aux for existing term.
                        rewriter.replace(target.start, target.stop, NormalizeListener.stripTimeScript(liftName));

                    }
                }

            }
        }

    }

    @Override
    public void exitTabRef(@NotNull DynamoParser.TabRefContext ctx){
        System.out.println("TableRef is "+ctx.getText());
        List<ExprContext> args = ctx.exprList().expr();
        for (ExprContext arg: args){
            System.out.println("... arg "+arg.getText());
        }
        String key;
        TableInfo info = new TableInfo(
                args.get(0).getText(),
                args.get(2).getText(),
                args.get(3).getText(),
                args.get(4).getText()
                );
        System.out.println("... key is "+info.getName());
        tInfoIndex.put(info.getName(), info);
    }

    @Override
    public void exitTableDef(DynamoParser.TableDefContext ctx){
        System.out.println("TABLEDEFEXIT "+ctx.getText());
        System.out.println("..."+ctx.toStringTree(parser));
        String name = (ctx.arrayRef() == null)? ctx.ID().getText() : ctx.arrayRef().getText();
        System.out.println("Fetch Key is "+name);
        TableInfo tInfo = tInfoIndex.get(name);
        System.out.println("...tInfo is "+tInfo);
        if (tInfo == null){
            System.out.println(tInfoIndex);
        }
        tInfo.setYValues(ctx.yValues().getText());
    }

    //TODO: Add lift for TABLE functions that appear in multi-term expressions.
    //TODO: move to XUtil.
    public static boolean hasFunctionAncestor(ParseTree f, ParserRuleContext ctx) {
        ParserRuleContext ctxBase = ctx;
        ParserRuleContext node = (ParserRuleContext) f;
        while ((node=node.getParent()) != ctxBase){
            if (node.getRuleContext().getRuleIndex() == DynamoParser.RULE_funcRef){
                return true;
            }
        }
        return false;
    }

    public Parser getParser() {
        return parser;
    }

    public Map<String, TableInfo> getTableInfo(){
        return tInfoIndex;
    }

    @Override
    public CommonTokenStream getTokens() {
        // TODO Auto-generated method stub
        return null;
    }

}
