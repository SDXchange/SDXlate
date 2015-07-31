package org.sdxchange.insight.app;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.sdxchange.xmile.parser4.XmileParser;
import org.sdxchange.xmile.parser4.XmileParser.FuncRefContext;

public class TimeRefVisitor implements ParseTreeVisitor<String> {

    private XmileParser parser = new XmileParser(null);
    private ImFrame frame;
    private boolean equationChanged = false;

    public TimeRefVisitor(ImFrame frame){
        this.frame = frame;
    }

    @Override
    public String visit(ParseTree arg0) {
        String rval = arg0.accept(this);
        return rval;
    }

    @Override
    public String visitChildren(RuleNode arg0) {
        if (arg0.getRuleContext().getRuleIndex() == XmileParser.RULE_funcRef){
            XmileParser.FuncRefContext ctx = (FuncRefContext) arg0;

            if (ctx.TIMEFUNC() != null && (ctx.TIMEFUNC().getText().contentEquals("TIME"))){
                equationChanged=true;
                return "SDX_TIME()";
            }
        }
        int children = arg0.getChildCount();
        String rval = "";
        for (int i =0; i < children ; i ++){
            String result =  arg0.getChild(i).accept(this);
            rval += result;
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

    public void setParser(XmileParser parser){
        this.parser = parser;
    }

    public boolean isEquationChanged(){
        return equationChanged;
    }

}
