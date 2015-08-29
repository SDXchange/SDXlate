package org.sdxchange.insight.app;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.sdxchange.xmile.parser4.XmileParser;
import org.sdxchange.xmile.parser4.XmileParser.IfExprContext;

//TODO: derive listeners from base class.
/**
 * This visitor identifies IF .. THEN...ELSE "statements" and replaces them
 * with IF_THEN_ELSE() function calls in the returned expression.
 *
 * @author Owner
 *
 */
public class IfThenVisitor implements ParseTreeVisitor<String> {

    private XmileParser parser = new XmileParser(null);
    private ImFrame frame;
    private boolean equationChanged = false;

    public IfThenVisitor(ImFrame frame){
        this.frame = frame;
    }

    @Override
    public String visit(ParseTree arg0) {
        String rval = arg0.accept(this);
        return rval;
    }

    @Override
    public String visitChildren(RuleNode arg0) {
        if (arg0.getRuleContext().getRuleIndex() == XmileParser.RULE_ifExpr){
            XmileParser.IfExprContext ctx = (IfExprContext) arg0;
            equationChanged=true;
            return "IF_THEN_ELSE("+ctx.expr(0).getText()+","+ctx.expr(1).getText()+","+ctx.expr(2).getText()+")";
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
