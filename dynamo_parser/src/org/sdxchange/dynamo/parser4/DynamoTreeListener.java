package org.sdxchange.dynamo.parser4;

import java.util.Set;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeListener;

public interface DynamoTreeListener extends ParseTreeListener {

    void setTokens(CommonTokenStream tokens);

    CommonTokenStream getTokens();

    void setRewriter(TokenStreamRewriter rewriter);

    void setParser(DynamoParser parser);

    void setDefinitions(String space, Set<String> values);

    public TokenStreamRewriter getRewriter();

}
