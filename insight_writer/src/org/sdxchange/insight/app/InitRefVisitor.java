package org.sdxchange.insight.app;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.sdxchange.xmile.devkit.symbol.XSymbol;
import org.sdxchange.xmile.parser4.XmileParser;

public class InitRefVisitor implements ParseTreeVisitor<String> {

    private XmileParser parser = new XmileParser(null);
    private ImFrame frame;
    private boolean equationChanged = false;

    public InitRefVisitor(ImFrame frame){
        this.frame = frame;
    }

    @Override
    public String visit(ParseTree arg0) {
        System.out.println("Called visit "+ XmileParser.ruleNames[((RuleNode)arg0).getRuleContext().getRuleIndex()]);
        String rval = arg0.accept(this);
        System.out.println("visit result is: "+rval);
        return rval;
    }

    @Override
    public String visitChildren(RuleNode arg0) {

        if (arg0.getRuleContext().getRuleIndex() == XmileParser.RULE_funcRef){
            String fName = arg0.getChild(0).getText();
            switch (fName){
                case "INIT":
                    return visitInit((XmileParser.FuncRefContext) arg0);
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

    public String visitInit(XmileParser.FuncRefContext ctx){
        equationChanged  = true;
        String var = ctx.exprList().getChild(0).getText();
        System.out.println("VarName is :"+var);
        System.out.println("in visitInit: "+ctx.toStringTree(parser));
        XSymbol symbol = frame.getDeclaredSymbol(var);
        if (symbol.getVarType().contentEquals(XSymbol.Type.stock)){
            return "("+symbol.getEqn()+")";
        }
        return ctx.getText();
    }

    public void setParser(XmileParser parser){
        this.parser = parser;
    }

    public boolean isEquationChanged(){
        return equationChanged;
    }

}
