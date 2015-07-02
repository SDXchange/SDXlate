package org.sdxchange.dynamo.parser4;

import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.NotNull;


public class NormalizeListener
extends DynamoParserBaseListener implements DynamoParserListener, DynamoTreeListener {

    Set<String> arrayIndexValues = new HashSet<String>();
    BufferedTokenStream tokens;
    TokenStreamRewriter rewriter;
    DynamoParser parser;
    Set<String> arrayNames ;

    public NormalizeListener(){
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
    public void exitFuncRef(@NotNull DynamoParser.FuncRefContext ctx){
        String funcName = ctx.start.getText();
        System.out.println("Processing funcRef to "+funcName);
        if (arrayNames.contains(funcName) ){
            //it isn't really a function ref, so change the parameter
            //delimeters so it'll be parsed correctly in the next pass.
            rewriter.replace(ctx.LPAREN().getSymbol(), "[");
            rewriter.replace(ctx.RPAREN().getSymbol(), "]");
            return;
        }
        switch (funcName){
            case "LOGN":
                rewriter.replace(ctx.start, "LN");
                break;
            case "SMOOTH":
                rewriter.replace(ctx.start, "SMTH1");
                break;
            default:
        }
    }

    @Override
    public void exitMacroRef(@NotNull DynamoParser.MacroRefContext ctx){
        String funcName = ctx.start.getText();
        System.out.println("Processing macroRef to "+funcName);
        if (arrayNames.contains(funcName) ){
            //it isn't really a function ref, so change the parameter
            //delimeters so it'll be parsed correctly in the next pass.
            rewriter.replace(ctx.LPAREN().getSymbol(), "[");
            rewriter.replace(ctx.RPAREN().getSymbol(), "]");
        }
    }

    public static String stripTimeScript(String strExpr) {
        return strExpr.replaceAll("\\.[JKL]+", "");
    }

    @Override
    public void exitArrayDecl(DynamoParser.ArrayDeclContext ctx){
        ctx.ID().getText();

    }

    @Override
    public void exitArrayRef(DynamoParser.ArrayRefContext ctx){
        rewriter.replace(ctx.LPAREN().getSymbol(), "[");
        rewriter.replace(ctx.RPAREN().getSymbol(), "]");
    }

    @Override
    public void exitSeparator(DynamoParser.SeparatorContext ctx){
        rewriter.replace(ctx.start,",");
    }

    @Override
    public void exitPowerOp(DynamoParser.PowerOpContext ctx){
        rewriter.delete(ctx.stop);
        rewriter.replace(ctx.start, "^");
    }

    @Override
    public void exitNumLit(DynamoParser.NumLitContext ctx){
        if (ctx.FNUM() != null){
            String normal = ctx.FNUM().getText().replace('E', 'e');
            rewriter.replace(ctx.stop, normal);
        }
    }

    @Override
    public void exitTimeScript(DynamoParser.TimeScriptContext ctx){
        rewriter.delete(ctx.start);
        rewriter.delete(ctx.stop);
    }

    public Parser getParser() {
        return parser;
    }

    @Override
    public CommonTokenStream getTokens() {
        // TODO Auto-generated method stub
        return null;
    }

}
