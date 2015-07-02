package org.sdxchange.dynamo.parser4;

import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;


/**
 * This listener collects special user defined symbols, specifically array and macro names.
 * It puts these into sets that can then be referenced by later passes.
 *
 * @author RWard
 *
 */
public class UserDefListener
extends DynamoParserBaseListener implements DynamoParserListener, DynamoTreeListener {

    Set<String> arrayIndexValues = new HashSet<String>();
    CommonTokenStream tokens = null;
    TokenStreamRewriter rewriter = null;
    DynamoParser parser = null;
    Set<String> macroNames = new HashSet<String>();
    Set<String> arrayNames = new HashSet<String>();

    public UserDefListener(){
        arrayIndexValues.add("*");
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
    public void exitArrayRef(DynamoParser.ArrayRefContext ctx){
        arrayNames.add(DynamoSymbolFactory.stripTimeScript(ctx.ID().getText()));
    }

    @Override
    public void exitModel(DynamoParser.ModelContext ctx){
        System.out.println("ArrayNames: "+arrayNames);
    }


    public Set<String> getArrayNames(){
        return arrayNames;
    }

    @Override
    public void setDefinitions(String nameSpace, Set<String> symbols) {
        // No definitions yet when this runs.
    }

    @Override
    public CommonTokenStream getTokens() {
        // TODO Auto-generated method stub
        return null;
    }
}
