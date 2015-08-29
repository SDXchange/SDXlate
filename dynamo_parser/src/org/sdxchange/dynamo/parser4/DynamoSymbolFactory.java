package org.sdxchange.dynamo.parser4;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.xpath.XPath;
import org.sdxchange.dynamo.parser4.DynamoParser.AUX_EQNContext;
import org.sdxchange.dynamo.parser4.DynamoParser.CONST_EQNContext;
import org.sdxchange.dynamo.parser4.DynamoParser.ColumnNumContext;
import org.sdxchange.dynamo.parser4.DynamoParser.EqnContext;
import org.sdxchange.dynamo.parser4.DynamoParser.ExprContext;
import org.sdxchange.dynamo.parser4.DynamoParser.INIT_EQNContext;
import org.sdxchange.dynamo.parser4.DynamoParser.LVL_EQNContext;
import org.sdxchange.dynamo.parser4.DynamoParser.PlotCardContext;
import org.sdxchange.dynamo.parser4.DynamoParser.PlotSpecContext;
import org.sdxchange.dynamo.parser4.DynamoParser.PrintCardContext;
import org.sdxchange.dynamo.parser4.DynamoParser.RATE_EQNContext;
import org.sdxchange.dynamo.parser4.DynamoParser.RptSpecContext;
import org.sdxchange.dynamo.parser4.DynamoParser.SpecCardContext;
import org.sdxchange.dynamo.parser4.DynamoParser.TBL_EQNContext;
import org.sdxchange.dynamo.parser4.DynamoParser.YValuesContext;
import org.sdxchange.xmile.devkit.util.XUtil;
import org.sdxchange.xmile.devkit.xframe.SimSpecs;

public class DynamoSymbolFactory implements SymbolFactory {

    DynamoParser parser;
//    static int nextSynthSerial = 0;

    public DynamoSymbolFactory(DynamoParser parser){
        this.parser = parser;
    }

    @Override
    public List<ErrorMsg> processAuxDecl(IXFrame frame, AUX_EQNContext ctx, Map<String, TableInfo> tInfoIndex) {
        EqnContext eqn = ctx.auxDef().eqn();
        if (eqn.expr().tabRef() != null){
            return processTableAuxDecl(frame, ctx, tInfoIndex);
        }
        String varName = eqn.varRef().start.getText();
        String leftRef = eqn.getRuleContext().getChild(0).getText();

        Symbol decl = new AuxSymbol(varName, "AUX", extractExpr(eqn), leftRef);
        Set<String> inputs = getInputVars(eqn.expr());
        decl.setInputs(inputs);
        if ( ctx.auxDef().comment()!=null ){
            decl.setComment(ctx.auxDef().comment().getText() );
        }
        frame.defineVar(decl.getName(), decl);
        return null; //TODO: bubble up errors?
    }

    private String extractExpr(EqnContext eqn) {
        String rval = eqn.expr().getText();
        //TODO: same with switch
        if (rval.toUpperCase().contains("CLIP(")){
            ClipVisitor visitor = new ClipVisitor();
            visitor.setParser(parser);
            return visitor.visit(eqn.expr());
        }
        else {
            return rval;
        }

    }

    private List<ErrorMsg> processTableAuxDecl(IXFrame frame, AUX_EQNContext ctx, Map<String, TableInfo> tInfoIndex) {
        EqnContext eqn = ctx.auxDef().eqn();
        String varName = eqn.varRef().start.getText();
        String leftRef = eqn.getRuleContext().getChild(0).getText();
        String tabInput = eqn.expr().tabRef().exprList().expr().get(1).getText();
        String tabName = eqn.expr().tabRef().exprList().expr().get(0).getText();
        AuxTabSymbol decl = new AuxTabSymbol(varName, "AUX", tabInput, leftRef);
        if ( ctx.auxDef().comment()!=null ){
            decl.setComment(ctx.auxDef().comment().getText() );
        }
        TableInfo tInfo = tInfoIndex.get(tabName);
        if (tInfo == null){
            System.out.println("WARNING: no table info entry from prior pass for table "+tabName);
        }
        decl.setyValues(tInfo.getYValues());
        decl.setxMax(tInfo.getXMax());
        decl.setxMin(tInfo.getXMin());

        decl.setGf(eqn.expr().tabRef().exprList().expr().get(0).getText());
        Set<String> inputs = getInputVars(eqn.expr().tabRef().exprList().expr().get(1));
        decl.setInputs(inputs);
        frame.defineVar(decl.getName(), decl);
        return null; //TODO: bubble up errors?
    }

    private Set<String> getInputVars(ParseTree eqn) {
        System.out.println("Collecting inputs from: "+eqn.toStringTree(parser));
        Set<String> rval = new HashSet<String>();
        Collection<ParseTree> vars = XPath.findAll(eqn, "//expr/ID", parser);
        vars.addAll(XPath.findAll(eqn,"//predefinedVar",parser));
        vars.addAll(XPath.findAll(eqn,"//arrayRef",parser));
        for(ParseTree var: vars){
            rval.add(stripTimeScript(var.getText()));
        }
        return rval;
    }

    @Override
    public List<ErrorMsg> processInitDecl(IXFrame frame, INIT_EQNContext ctx) {
        EqnContext eqn = ctx.initDef().eqn();
        String varName = eqn.varRef().start.getText();
        String leftRef = eqn.getRuleContext().getChild(0).getText();
        InitSymbol decl = new InitSymbol(varName, "INIT", extractExpr(eqn), leftRef);
        if ( ctx.initDef().comment()!=null ){
            decl.setComment(ctx.initDef().comment().getText() );
        }
        //stash the pointer so we can analyze later if necessary.
        decl.setContext(ctx);
        frame.defineInitializer(decl.getName(), decl);
        return null; //TODO
    }

    @Override
    public List<ErrorMsg> processLvlDecl(IXFrame frame, LVL_EQNContext ctx) {
        EqnContext eqn = ctx.stockDef().eqn();
        String varName = eqn.varRef().start.getText();
        String leftRef = eqn.getRuleContext().getChild(0).getText();
        Symbol lvlSym = new StockSymbol(varName, "LVL", leftRef);
        if ( ctx.stockDef().comment()!=null ){
            lvlSym.setComment(ctx.stockDef().comment().getText() );
        }

        upDateFlows(lvlSym, eqn);
        frame.defineVar(lvlSym.getName(), lvlSym);
        return null; //TODO
    }

    private void upDateFlows(Symbol lvlSym, EqnContext eqn) {
//        System.out.println("Collecting flows from: "+eqn.getText());
//        System.out.println("Collecting flows from: "+eqn.toStringTree(parser));
        String skip = stripTimeScript( eqn.varRef().getText());
        Set<String> rval = new HashSet<String>();
        ParseTree eqnRight = eqn.expr();
        Collection<ParseTree> vars = XPath.findAll(eqnRight, "//expr/ID", parser);
        vars.addAll(XPath.findAll(eqnRight,"//predefinedVar",parser));
        vars.addAll(XPath.findAll(eqnRight,"//arrayRef",parser));
        for(ParseTree var: vars){
            String varText=stripTimeScript(var.getText());
            if (skip.contentEquals(varText)) continue;
            if ( XUtil.hasAncestorNode(var, eqn , DynamoParser.RULE_funcRef)){
                continue;
            }
            if ( XUtil.hasAncestorNode(var, eqn , DynamoParser.RULE_indexList)){
                continue;
            }
            boolean flowDir = analyzeFlowDir(var, eqn, parser);
            if ( flowDir ){
                lvlSym.addInFlow(varText);
            }
            else {
                lvlSym.addOutFlow(varText);
            }


            rval.add(((flowDir)?"+":"-")+varText);
        }
        System.out.println("\n\nFor stock "+eqn.getText());
        System.out.println("Flows finds: "+rval);
        System.out.println();
    }

    static boolean currentDir = true;

    private boolean analyzeFlowDir(ParseTree var, EqnContext stockCtx, DynamoParser parser) {
        ParseTree term = var;
        ParserRuleContext node = (ParserRuleContext) var.getParent();
        boolean currentSign = true;
        while (node != stockCtx){
            int count = node.getChildCount();
            //           System.out.println("Node "+node.toStringTree(parser));
            //           System.out.println("   Term  "+term.toStringTree(parser));
//            System.out.println("   Node child count: "+count+" currentSign="+currentSign);
            if (node instanceof ExprContext && term instanceof ExprContext){
                ExprContext nodeExpr = (ExprContext) node;
                ExprContext termExpr = (ExprContext) term;
                List<ExprContext> exprs = nodeExpr.expr();
//                for (ExprContext expr : exprs){
                //                   System.out.println("   Expr "+expr.toStringTree(parser));
                //               }
                if ( isNegationOp(nodeExpr) && isRightChild(exprs, termExpr) ){
                    currentSign = !currentSign; // invert the sign.
                }

            }
            term = node;
            node = node.getParent();
        }
        //one more time to get top level sign input.
        if (node instanceof ExprContext && term instanceof ExprContext){
            ExprContext nodeExpr = (ExprContext) node;
            ExprContext termExpr = (ExprContext) term;
            List<ExprContext> exprs = nodeExpr.expr();
//            for (ExprContext expr : exprs){
//                System.out.println("   Expr "+expr.toStringTree(parser));
//            }
            if (isRightChild(exprs, termExpr) && isNegationOp(nodeExpr)){
                currentSign = !currentSign; // invert the sign.
            }

        }

//        System.out.println("CurrentSign is "+currentSign);

        return currentSign;
    }


    private boolean isRightChild(List<ExprContext> exprs, ExprContext term) {
        boolean rval = true;
        int rightIndex = exprs.size()-1;
        if (exprs.size() < 1) {
            rval = false;
        }
        else {
            rval = (exprs.get(rightIndex) == term );
//            System.out.print("   isRightChild compares "+node.expr(nodes-1).getText()+" <======> "+term.getText() );
        }
        System.out.println(" ::= "+rval);

        return rval;
    }

    private boolean isNegationOp(ExprContext node) {
        boolean rval =  node.MINUS() != null;
        System.out.println("   is NegationOp returns "+rval);
        return rval;
    }

    private void printFlowParts(ParseTree node) {
        int count = node.getChildCount();
        for(int i = 0; i < count; i ++){
            System.out.println("   "+node.getChild(i).getText());

        }

    }

    @Override
    public List<ErrorMsg> processRateDecl(IXFrame frame, RATE_EQNContext ctx, Map<String,TableInfo> tInfoIndex) {
        EqnContext eqn = ctx.rateDef().eqn();
        if (eqn.expr().tabRef()!=null){
            return processTableRateDecl(frame, ctx, tInfoIndex);
        }
        String varName = eqn.varRef().start.getText();
        String leftRef = eqn.getRuleContext().getChild(0).getText();
        Symbol decl = new RateSymbol(varName, "RATE", extractExpr(eqn), leftRef);
        if ( ctx.rateDef().comment()!=null ){
            decl.setComment(ctx.rateDef().comment().getText() );
        }
        Set<String> inputs = getInputVars(eqn.expr());
        decl.setInputs(inputs);
        frame.defineVar(decl.getName(), decl);
        return null; //TODO
    }

    private List<ErrorMsg> processTableRateDecl(IXFrame frame, RATE_EQNContext ctx, Map<String, TableInfo> tInfoIndex) {
        EqnContext eqn = ctx.rateDef().eqn();
        String varName = eqn.varRef().start.getText();
        String leftRef = eqn.getRuleContext().getChild(0).getText();
        String tabInput = eqn.expr().tabRef().exprList().expr().get(1).getText();
        String tabName = eqn.expr().tabRef().exprList().expr().get(0).getText();
        RateTabSymbol decl = new RateTabSymbol(varName, "LVL", tabInput, leftRef);
        if ( ctx.rateDef().comment()!=null ){
            decl.setComment(ctx.rateDef().comment().getText() );
        }
        TableInfo tInfo = tInfoIndex.get(tabName);
        if (tInfo == null){
            System.out.println("WARNING: no table info entry from prior pass for table "+tabName);
        }
        decl.setyValues(tInfo.getYValues());
        decl.setxMax(tInfo.getXMax());
        decl.setxMin(tInfo.getXMin());

        decl.setGf(eqn.expr().tabRef().exprList().expr().get(0).getText());
        Set<String> inputs = getInputVars(eqn.expr().tabRef().exprList().expr().get(1));
        decl.setInputs(inputs);
        frame.defineVar(decl.getName(), decl);
        return null; //TODO: bubble up errors?
    }

    @Override
    public List<ErrorMsg> processTblDecl(IXFrame frame, TBL_EQNContext ctx, Map<String, TableInfo> tInfoIndex) {
        YValuesContext eqn = ctx.tableDef().yValues();
        String varName = (ctx.tableDef().ID() == null) ? ctx.tableDef().arrayRef().getText() : ctx.tableDef().ID().getText();
        GraphSymbol decl = new GraphSymbol(varName, "GF", eqn.getText(), varName);
        if ( ctx.tableDef().comment()!=null ){
            decl.setComment(ctx.tableDef().comment().getText() );
        }
        decl.setYPts(eqn.getText());
        TableInfo tInfo = tInfoIndex.get(varName);
        if (tInfo == null){
            System.out.println("WARNING: no scale entry from prior pass for table "+varName);
        }
        decl.setxMax(tInfo.getXMax());
        decl.setxMin(tInfo.getXMin());
        frame.defineVar(decl.getName(), decl);
        return null; //TODO
    }

    @Override
    public List<ErrorMsg> processConstDecl(IXFrame frame, CONST_EQNContext ctx) {
        EqnContext eqn = ctx.constDef().eqn();
        String varName = eqn.varRef().start.getText();
        String leftRef = eqn.getRuleContext().getChild(0).getText();
        Symbol decl = new AuxSymbol(varName, "AUX", extractExpr(eqn), leftRef);
        if ( ctx.constDef().comment()!=null ){
            decl.setComment(ctx.constDef().comment().getText() );
        }
        frame.defineVar(decl.getName(), decl);
        return null; //TODO
    }


    @Override
    public void processPlotCard(IXFrame frame, PlotCardContext ctx) {
        GraphPane output = new GraphPane();
        List<PlotSpecContext> plots = ctx.plotList().plotSpec();
        int i = 0;
        for (PlotSpecContext plot : plots){
            String plotName = (plot.ID() == null) ? plot.arrayRef().getText() : plot.ID().getText();
            output.addLine(new PlotLine(plotName, i++));
        }
        frame.addOutputPane(output);
    }

    @Override
    public void processPrintCard(IXFrame frame, PrintCardContext ctx) {
        //TODO: handle array references
        TablePane output = new TablePane();
        List<RptSpecContext> columnSpecs = ctx.rptList().rptSpec();
        int i = 0;
        for (RptSpecContext rptSpec : columnSpecs){
            String varName = rptSpec.ID().getText();
            ColumnNumContext numCtx = rptSpec.columnNum();
            int colPosition = (numCtx == null)? i++ : Integer.valueOf(numCtx.getText());
            output.addColumn(new Column(varName, colPosition));
        }
        frame.addOutputPane(output);
    }

    @Override
    public void processSpecCard(IXFrame currentFrame, SpecCardContext ctx) {
        List<DynamoParser.SpecAssignContext> specs = ctx.specAssign();
        SimSpecs frameSpecs = currentFrame.getSimSpec();
        for (DynamoParser.SpecAssignContext spec : specs){
            switch(spec.specId().getText()) {
                case "DT":
                    frameSpecs.setDt(spec.numLit().getText());
                    break;
                case "LENGTH":
                    frameSpecs.setStop(spec.numLit().getText());
                    break;
                case "MAXLEN":
                    frameSpecs.setStop(spec.numLit().getText());
                    currentFrame.defineVar("MAXLEN", new AuxSymbol("MAXLEN", "AUX", frameSpecs.getStop(),"MAXLEN"));
                    break;
                case "PLTPER":
                    break;
                case "PRTPER":
                    currentFrame.getViewParams().setPrintInterval(spec.numLit().getText());
                    break;
            }
        }
    }

    public static String stripTimeScript(String strExpr) {
        return strExpr.replaceAll("\\.[JKL]+", "");
    }
    /* This is called for initialization nodes that do not correspond to a declared stock. These cards are
     * expressions which should be evaluated only once, using initial values from variables referenced in the
     * equation. Once an initializer has been determined to belong to this class, it is called so that an
     * appropriate aux symbol can be constructed.
     *
     * (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.SymbolFactory#forceInitTerms(org.sdxchange.dynamo.parser4.InitSymbol)
     */

    @Override
    public Symbol forceInitTerms(InitSymbol sym) {
        INIT_EQNContext ctx = sym.getContext();
        DynamoParser.ExprContext exprCtx = ctx.initDef().eqn().expr();
        String eqn = exprCtx.getText();
        Set<String> inputs = getInputVars(exprCtx);
        for (String var : inputs){
            eqn = eqn.replace(var, "INIT("+var+")");
        }
        AuxSymbol auxInit = new AuxSymbol(sym.getName(),"AUX", eqn, sym.lRef);
        auxInit.setInputs(inputs);
        return auxInit;
    }



}
