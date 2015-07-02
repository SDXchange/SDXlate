package org.sdxchange.dynamo.parser4;

import java.util.Set;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class CaptureListener implements DynamoTreeListener {

    private DynamoParser parser;
    private CommonTokenStream tokens;

    @Override
    public void enterEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub

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
        // TODO Auto-generated method stub

    }

    @Override
    public void setTokens(CommonTokenStream tokens) {
        this.tokens = tokens;

    }

    @Override
    public void setRewriter(TokenStreamRewriter rewriter) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setParser(DynamoParser parser) {
        this.parser = parser;

    }

    public DynamoParser getParser(){
        return parser;
    }

    @Override
    public void setDefinitions(String space, Set<String> values) {
        // TODO Auto-generated method stub

    }

    @Override
    public TokenStreamRewriter getRewriter() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CommonTokenStream getTokens() {
        return tokens;
    }

}
