package org.sdxchange.xmile.loader;

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

/**
 *
 * @author rward
 *
 */

public interface XmileListener {

    void enterModel(ModelCtx ctx);

    void exitModel(ModelCtx ctx);

    void enterSimSpecs(SimSpecsContext ctx);

    void process(SimSpecsContext ctx);

    void exitSimSpecs(SimSpecsContext ctx);

    boolean targetSupportsMultipleViewsPerModel();

    void enterVariables(VarsContext varsCtx);

    void exitVariables(VarsContext varsCtx);

    void enterAuxvar(AuxvarContext ctx);

    void exitAuxvar(AuxvarContext ctx);

    void enterFlow(FlowContext ctx);

    void process(FlowContext ctx);

    void exitFlow(FlowContext ctx);

    void enterStock(StockContext ctx);

    void exitStock(StockContext ctx);

    void process(AuxvarContext ctx);

    void process(StockContext ctx);

    void enterStockView(VarViewContext ctx);

    void exitStockView(VarViewContext ctx);

    void enterFlowView(VarViewContext ctx);

    void exitFlowView(VarViewContext ctx);

    void enterAuxView(VarViewContext ctx);

    void exitAuxView(VarViewContext ctx);

    void process(VarViewContext ctx);

    void enterConnector(ConnectorContext ctx);

    void process(ConnectorContext ctx);

    void exitConnector(ConnectorContext ctx);

    void enterTable(TableOutContext ctx);

    void process(TableOutContext ctx);

    void exitTable(TableOutContext ctx);

    void process(GraphOutContext ctx);

    void exitGraph(GraphOutContext ctx);

    void enterGraph(GraphOutContext ctx);


}
