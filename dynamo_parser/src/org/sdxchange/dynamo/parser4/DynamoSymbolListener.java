package org.sdxchange.dynamo.parser4;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;


public class DynamoSymbolListener
extends DynamoParserBaseListener implements DynamoParserListener, DynamoTreeListener {

    BufferedTokenStream tokens;
    XFrame currentFrame; /* could be current macro or default module */
    XFrame defaultModule;
    int nextSynthIndex = 0;
    SymbolFactory symFactory;
    DynamoParser parser;
    Map<String, TableInfo> tInfoIndex = new HashMap<String, TableInfo>();

    Map<String, DynamoParser.ModelContext> macros = new HashMap<String, DynamoParser.ModelContext>();

    Map<String, XFrame> frameIndex = new HashMap<String, XFrame>();
    private String simulationName = "";

    public DynamoSymbolListener(){
    }


    @Override
    public void setTokens(CommonTokenStream tokens) {
        this.tokens = tokens;
    }

    @Override
    public void setRewriter(TokenStreamRewriter rewriter) {
        //do nothing
    }

    @Override
    public TokenStreamRewriter getRewriter() {
        return null;
    }

    @Override
    public void setParser(DynamoParser parser) {
        this.parser = parser;
        symFactory = new DynamoSymbolFactory(parser);
    }

    @Override
    public void setDefinitions(String space, Set<String> values){
        //do nothing
    }


    @Override
    public void enterModel(org.sdxchange.dynamo.parser4.DynamoParser.ModelContext ctx)
    {
        //set up a frame for this module. In Dynamo there's only one module ... the default.
        XFrame frame = new XFrame("defaultModule");
        frame.setSimulationName(simulationName);
        frameIndex.put(frame.getName(), frame);
        if (defaultModule != null){ // it might be occupied by a macro declaration frame.
            System.err.println("FrameHandling Error, current frame not null at stgart of default module");
        }
        currentFrame = frame;
        defaultModule = frame;
    }

    @Override
    public void exitAUX_EQN(DynamoParser.AUX_EQNContext ctx){
        List<ErrorMsg> errors = symFactory.processAuxDecl(currentFrame, ctx, tInfoIndex);
    }

    @Override
    public void exitLVL_EQN(DynamoParser.LVL_EQNContext ctx){
        List<ErrorMsg> errors = symFactory.processLvlDecl(currentFrame, ctx);

    }

    @Override
    public void exitINIT_EQN(DynamoParser.INIT_EQNContext ctx){
        List<ErrorMsg> errors = symFactory.processInitDecl(currentFrame, ctx);
    }

    @Override
    public void exitRATE_EQN(DynamoParser.RATE_EQNContext ctx){
        List<ErrorMsg> errors = symFactory.processRateDecl(currentFrame, ctx, tInfoIndex);
    }

    @Override
    public void exitCONST_EQN(DynamoParser.CONST_EQNContext ctx){
        List<ErrorMsg> errors = symFactory.processConstDecl(currentFrame, ctx);
    }

    @Override
    public void exitTBL_EQN(DynamoParser.TBL_EQNContext ctx){
        List<ErrorMsg> errors = symFactory.processTblDecl(currentFrame, ctx, tInfoIndex);
    }

    @Override
    public void exitPlotCard(DynamoParser.PlotCardContext ctx)
    {
        symFactory.processPlotCard(currentFrame, ctx);
    }

    @Override
    public void exitPrintCard(DynamoParser.PrintCardContext ctx) {
        symFactory.processPrintCard(currentFrame, ctx);
    }

    @Override
    public void exitSpecCard(DynamoParser.SpecCardContext ctx) {
        symFactory.processSpecCard(currentFrame, ctx);
    };


    @Override
    public void exitModel(DynamoParser.ModelContext ctx){
        processInitializers();
        defaultModule.dump();

    }

    @Override
    public void exitStarCard(DynamoParser.StarCardContext ctx){
        if (ctx.comment() != null) {
            simulationName  = ctx.comment().getText();
        }
    }

    private void processInitializers() {
        Collection<InitSymbol> nSymbols = defaultModule.getInitializers();
        for (InitSymbol sym : nSymbols){
            Symbol var = defaultModule.getDeclaredSymbol(sym.getName());
            if (var != null) {
                switch (var.getVarType()){
                    case "LVL":
                        var.setEqn(sym.getEqn());
                        defaultModule.update(var);
                        break;
                    case "AUX":
                    case "RATE":
                        String synthInit = "(IF(0<TIME)THEN("+var.getEqn()+")ELSE("+sym.getEqn()+"))";
                        var.setEqn(synthInit);
                        defaultModule.update(var);
                }
            }
            else { //this should never execute.
                Symbol initAux = symFactory.forceInitTerms(sym);
                defaultModule.defineVar(initAux.getName(), initAux);
            }
        }
    }

    /* Special Cases
     *
     * Assignment to TIME should set start
     * Initializer reads from stocks.
     *
     */

    private void putSymbol(String symbol, String type, String eqn){
        System.out.println(symbol+ "  "+ type + "  "+ eqn);
    }


    public XFrame getCurrentFrame() {
        return currentFrame;
    }


    public void setTableInfo(Map<String, TableInfo> tableInfo) {
        tInfoIndex = tableInfo;
    }


    @Override
    public CommonTokenStream getTokens() {
        // TODO Auto-generated method stub
        return null;
    }

}
