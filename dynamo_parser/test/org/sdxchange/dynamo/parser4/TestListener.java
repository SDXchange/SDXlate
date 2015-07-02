package org.sdxchange.dynamo.parser4;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.sdxchange.dynamo.parser4.DynamoParser.FuncRefContext;

public class TestListener implements ParseTreeListener {

    ParserRuleContext eqn;
    CommonTokenStream tokens;

    @Override
    public void enterEveryRule(ParserRuleContext arg0) {
        if (DynamoParser.ruleNames[arg0.getRuleIndex()].equalsIgnoreCase("eqn")){
            eqn = arg0;
            System.out.println("Enter: "+DynamoParser.ruleNames[arg0.getRuleIndex()]+": "+arg0.getText());
        }
        else if (DynamoParser.ruleNames[arg0.getRuleIndex()].equalsIgnoreCase("funcRef")){
            FuncRefContext ctx = (FuncRefContext) arg0;
            System.out.println(ctx.getText());
            Interval eqnSequence = eqn.getSourceInterval();
            System.out.println("From Interval: "+eqnSequence.toString());
            System.out.println("From token stream: "+(tokens.getTokens(eqn.start.getTokenIndex(), ctx.start.getTokenIndex()-1)).toString());

        }
    }


    public void setTokens(org.antlr.v4.runtime.CommonTokenStream commonTokenStream){
        this.tokens = commonTokenStream;
    }

    @Override
    public void exitEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitTerminal(TerminalNode arg0) {
        System.out.println(arg0.getText());

    }


}
