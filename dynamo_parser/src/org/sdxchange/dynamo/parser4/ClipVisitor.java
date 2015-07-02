package org.sdxchange.dynamo.parser4;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ClipVisitor implements ParseTreeVisitor<String> {

    private DynamoParser parser;

    @Override
    public String visit(ParseTree arg0) {
        System.out.println("Called visit "+ DynamoParser.ruleNames[((RuleNode)arg0).getRuleContext().getRuleIndex()]);
        return arg0.accept(this);
    }

    @Override
    public String visitChildren(RuleNode arg0) {

        if (arg0.getRuleContext().getRuleIndex() == DynamoParser.RULE_funcRef){
            String fName = arg0.getChild(0).getText();
            switch (fName){
                case "CLIP":
                    return visitClip((DynamoParser.FuncRefContext) arg0);
                default:

            }
        }
        int children = arg0.getChildCount();
        String rval = "";
        for (int i =0; i < children ; i ++){
            rval += arg0.getChild(i).accept(this);
        }
        return rval;
    }

    @Override
    public String visitErrorNode(ErrorNode arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String visitTerminal(TerminalNode arg0) {
        return arg0.getText();
    }

    public String visitClip(DynamoParser.FuncRefContext ctx){
        String fName = ctx.getChild(0).getText();
        System.out.println(ctx.toStringTree(parser));
        String[] results = new String[7];
        RuleNode argList = ctx.exprList();
        for(int i = 0; i < 7; i++){
            System.out.println("fRef loop:"+i+" "+argList.getChild(i).getText());
            results[i]= argList.getChild(i).accept(this);
        }

        return "(IF("+results[4]+"<"+results[6]+")THEN("+results[2]+")ELSE("+results[0]+"))";

    }

    public void setParser(DynamoParser parser){
        this.parser = parser;
    }

}
