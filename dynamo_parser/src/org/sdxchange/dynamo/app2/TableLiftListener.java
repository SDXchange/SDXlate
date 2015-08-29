package org.sdxchange.dynamo.app2;

import java.util.Set;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.sdxchange.dynamo.parser4.DynamoParser;
import org.sdxchange.dynamo.parser4.DynamoParserBaseListener;
import org.sdxchange.dynamo.parser4.DynamoParserListener;
import org.sdxchange.dynamo.parser4.DynamoTreeListener;
import org.sdxchange.xmile.devkit.symbol.SymbolBase;

public class TableLiftListener
extends DynamoParserBaseListener implements DynamoParserListener, DynamoTreeListener {

    BufferedTokenStream tokens;
    TokenStreamRewriter rewriter;
    DynamoParser parser;

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
    public CommonTokenStream getTokens() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void exitTabRef(DynamoParser.TabRefContext ctx){
        String ruleName = DynamoParser.ruleNames[ctx.getParent().getParent().getRuleIndex()];
        System.err.println("Processing rule under "+ruleName);
        if (! "eqn".contentEquals(ruleName)){
            //getTableName
            String tName = ctx.exprList().expr().get(0).getText();
            //create aux variable (using tablename) with existing text
            String auxName = SymbolBase.createVarName(tName);
            System.err.println("Planning to lift "+ctx.getText());
            ParserRuleContext card = findContainingCard(ctx);
            rewriter.insertAfter(card.stop, "\r\nA\t"+auxName+"="+ctx.getText());
            rewriter.replace(ctx.start,ctx.stop,auxName);
        }
    }

    private ParserRuleContext findContainingCard(ParserRuleContext ctx){
        ParserRuleContext current = ctx.getParent().getParent();
        while(DynamoParser.RULE_eqnCard != current.getRuleIndex()){
            current = current.getParent();
        }
        return current;
    }

    @Override
    public void setDefinitions(String space, Set<String> values) {
        // TODO Auto-generated method stub

    }


}
