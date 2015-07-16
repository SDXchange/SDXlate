package org.sdxchange.xmile.loader;

import org.sdxchange.xmile.devkit.symbol.XSymbol;
import org.sdxchange.xmile.devkit.symbol.XY;
import org.sdxchange.xmile.devkit.xframe.SimSpecs;
import org.sdxchange.xmile.loader.context.AuxvarContext;
import org.sdxchange.xmile.loader.context.ConnectorContext;
import org.sdxchange.xmile.loader.context.FlowContext;
import org.sdxchange.xmile.loader.context.GraphOutContext;
import org.sdxchange.xmile.loader.context.ModelCtx;
import org.sdxchange.xmile.loader.context.SimSpecsContext;
import org.sdxchange.xmile.loader.context.StockContext;
import org.sdxchange.xmile.loader.context.TableOutContext;
import org.sdxchange.xmile.loader.context.VarViewContext;
import org.sdxchange.xmile.loader.context.VarsContext;


public class BaseListener implements XmileListener {

    XmileFrame baseFrame ;

    public BaseListener(XmileFrame frame){
        this.baseFrame = frame;
    }

    @Override
    public void enterModel(ModelCtx ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitModel(ModelCtx ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterSimSpecs(SimSpecsContext ctx) {
        System.out.println("SimSpecs: "+ctx.getMethod());
    }

    @Override
    public void process(SimSpecsContext ctx) {
        SimSpecs active = baseFrame.getSimSpec();
        if (active != null){
            active.setDt(""+ctx.getDt());
            active.setStop(""+ctx.getStopTime());
            active.setStart(""+ctx.getStartTime());
            active.setDefaultMethod(""+ctx.getMethod());
        }

    }

    @Override
    public void exitSimSpecs(SimSpecsContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean targetSupportsMultipleViewsPerModel() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void enterVariables(VarsContext varsCtx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitVariables(VarsContext varsCtx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterAuxvar(AuxvarContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitAuxvar(AuxvarContext ctx) {
        System.out.println("Aux   "+ctx.getName()+" "+ctx.getEqn());

    }

    @Override
    public void enterFlow(FlowContext ctx) {
        System.out.println("Flow  "+ctx.getName()+" "+ctx.getEqn());

    }

    @Override
    public void process(FlowContext ctx){
        baseFrame.defineVar(ctx.getName(), ctx);
    }

    @Override
    public void exitFlow(FlowContext ctx) {
        // TODO Auto-generated method stub
    }

    @Override
    public void process(StockContext ctx){
        baseFrame.defineVar(ctx.getName(), ctx);
    }

    @Override
    public void enterStock(StockContext ctx) {
        System.out.println("Stock "+ctx.getName()+" "+ctx.getEqn());
        System.out.println("      in:"+ctx.getInflows()+"  out:"+ctx.getOutflows());
        baseFrame.defineVar(ctx.getName(), ctx);
    }

    @Override
    public void exitStock(StockContext ctx) {
        // TODO Auto-generated method stub

    }


    @Override
    public void process(AuxvarContext ctx) {
        baseFrame.defineVar(ctx.getName(), ctx);
    }


    @Override
    public void enterStockView(VarViewContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitStockView(VarViewContext ctx) {
        // TODO Auto-generated method stub
    }

    @Override
    public void process(VarViewContext ctx) {
        assert ctx != null;
        String varName = null;
        if ( (varName = ctx.getName()) != null && !varName.isEmpty()){
            XSymbol sym = baseFrame.getDeclaredSymbol(ctx.getName());
            if (sym == null){
                System.err.println("Failed to find Symbol with name "+ctx.getName());
                System.out.println("CurrentFrame is "+baseFrame);
            }
            else {
                sym.setPosition(new XY(ctx.getX(),ctx.getY()));
                sym.setDrawingAttrs(ctx);
                if (sym.getVarType().contentEquals(XSymbol.Type.flow)){
                    //extract points here?
                }
            }

        }

    }

    @Override
    public void enterFlowView(VarViewContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitFlowView(VarViewContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterAuxView(VarViewContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitAuxView(VarViewContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterConnector(ConnectorContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void process(ConnectorContext ctx) {
        baseFrame.addConnector(ctx);
    }

    @Override
    public void exitConnector(ConnectorContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterTable(TableOutContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void process(TableOutContext ctx) {
        baseFrame.addOutputPane(ctx);
        System.out.println(ctx.dump());
    }

    @Override
    public void exitTable(TableOutContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void process(GraphOutContext ctx) {
        baseFrame.addOutputPane(ctx);
        System.out.println(ctx.dump());
    }

    @Override
    public void exitGraph(GraphOutContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterGraph(GraphOutContext ctx) {
        // TODO Auto-generated method stub

    }

}
