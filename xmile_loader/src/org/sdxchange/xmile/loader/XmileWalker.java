package org.sdxchange.xmile.loader;

import java.util.List;

import org.oasis.xmile.v1_0.Auxvar;
import org.oasis.xmile.v1_0.Behavior;
import org.oasis.xmile.v1_0.Data;
import org.oasis.xmile.v1_0.Flow;
import org.oasis.xmile.v1_0.Gf;
import org.oasis.xmile.v1_0.Group;
import org.oasis.xmile.v1_0.Macro;
import org.oasis.xmile.v1_0.Model;
import org.oasis.xmile.v1_0.ModelUnits;
import org.oasis.xmile.v1_0.Module;
import org.oasis.xmile.v1_0.SimSpecs;
import org.oasis.xmile.v1_0.StackedContainer;
import org.oasis.xmile.v1_0.Stock;
import org.oasis.xmile.v1_0.Style;
import org.oasis.xmile.v1_0.Variables;
import org.oasis.xmile.v1_0.ViewContentType;
import org.oasis.xmile.v1_0.ViewContentType.Aux;
import org.oasis.xmile.v1_0.ViewContentType.Connector;
import org.oasis.xmile.v1_0.ViewContentType.Graph;
import org.oasis.xmile.v1_0.ViewContentType.Table;
import org.oasis.xmile.v1_0.Views;
import org.oasis.xmile.v1_0.Views.View;
import org.oasis.xmile.v1_0.Xmile;
import org.oasis.xmile.v1_0.Xmile.Dimensions;
import org.sdxchange.xmile.devkit.xframe.IXFrame;
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
import org.sdxchange.xmile.loader.context.XmileContextFactory;


/**
 * This class is responsible for directing a walk of the Xmile document that results in
 * a fully loaded Xframe Hierarchy. This class walks the XMILE document tree, wrapping
 * select nodes in context objects and  making
 * calls to appropriate listener functions, which perform the actual update of the
 * XFrame.
 *
 * This version only handles models consisting of a single top-level, default (i.e., nameless)
 * module.
 *
 * @author Rward
 *
 */
public class XmileWalker {
    XmileFrame frame = null;
    XmileFrame currentFrame = null;
    XmileListener listener;
    Xmile doc;
    private XmileContextFactory ctxFactory;

    public XmileWalker(Xmile doc, XmileContextFactory ctxFactory, XmileListener listener){
        this.ctxFactory = ctxFactory;
        this.listener = listener;
        this.doc = doc;
        this.frame = this.currentFrame = (XmileFrame) ctxFactory.getFrame();
    }

    public IXFrame visit(){
        List<Object> topNodes = doc.getSimSpecsOrModelUnitsOrBehavior();
        for (Object node : topNodes){
            if (node instanceof SimSpecs) visit((SimSpecs) node);
            else if (node instanceof ModelUnits) visitChildren((ModelUnits) node);
            else if (node instanceof Behavior) visit((Behavior) node);
            else if (node instanceof Data) visit((Data) node);
            else if (node instanceof Style) visit((Style) node);
            else if (node instanceof Macro) visit((Macro) node);
            else if (node instanceof Model) visit((Model) node);
            else if (node instanceof Dimensions) visit((Dimensions) node);
            else {
                System.err.println("unknown top-level node "+node.toString());
            }
        }
        return currentFrame;
    }

    private void visit(Dimensions node) {
        // TODO Auto-generated method stub

    }

    private void visit(Model root) {
        //TODO: following should be an operation on frame.
        pushModel();
        ModelCtx ctx = ctxFactory.createModelContext(root);
        ctx.visit( this, listener);
    }

    public void visit(Views node) {
        for (Object viewItem : node.getStyleOrView()){
            if (viewItem instanceof Views.View){
                visit ((Views.View) viewItem);
            } else if (viewItem instanceof Style){
                System.out.println("Detected as style");
            } else {
                System.out.println("it's something else!!");
            }
        }

        if (listener.targetSupportsMultipleViewsPerModel()){
            // TODO Auto-generated method stub
        }
    }

    private void visit(View view) {
        // get view presentation details directly from view accessors

        for (Object viewObj : view.getStyleOrStockOrFlow())
            if  (viewObj instanceof ViewContentType.Stock){
                visit( (ViewContentType.Stock) viewObj);
            } else if (viewObj instanceof ViewContentType.Flow){
                visit( (ViewContentType.Flow) viewObj);
            } else if (viewObj instanceof ViewContentType.Aux) {
                visit( (ViewContentType.Aux) viewObj);
            }
            else if ((viewObj instanceof ViewContentType.Connector)){
                visit ((ViewContentType.Connector) viewObj);
            }
            else if ((viewObj instanceof StackedContainer)) {
                visit ((StackedContainer) viewObj);
            }
            else {
                System.err.println("Object type not supported "+viewObj);
            }
    }

    private void visit(Aux viewObj) {
        VarViewContext ctx = ctxFactory.createVarViewContext(viewObj);
        listener.enterStockView(ctx);
        listener.process(ctx);
        listener.exitStockView(ctx);
    }

    private void visit(org.oasis.xmile.v1_0.ViewContentType.Flow viewObj) {
        VarViewContext ctx = ctxFactory.createVarViewContext(viewObj);
        listener.enterFlowView(ctx);
        listener.process(ctx);
        listener.exitFlowView(ctx);
    }

    private void visit(org.oasis.xmile.v1_0.ViewContentType.Stock viewObj) {
        VarViewContext ctx = ctxFactory.createVarViewContext(viewObj);
        listener.enterStockView(ctx);
        listener.process(ctx);
        listener.exitStockView(ctx);


    }

    private void visit(StackedContainer viewObject) {
        System.out.println("Found Stacked Container");
        List<Object> items = viewObject.getStyleOrStockOrFlow();
        for (Object item: items){
            if (item instanceof Graph){
                visit ((Graph) item);
            } else if (item instanceof Table){
                visit ((Table) item);
            }
        }
    }

    private void visit(Table table) {
        TableOutContext ctx = ctxFactory.createTableOutContext(table);
        listener.enterTable(ctx);
        listener.process(ctx);
        listener.exitTable(ctx);

    }

    private void visit(Graph graph) {
        GraphOutContext ctx = ctxFactory.createGraphOutContext(graph);
        listener.enterGraph(ctx);
        listener.process(ctx);
        listener.exitGraph(ctx);

    }

    private void visit(Connector viewObj) {
        ConnectorContext ctx = ctxFactory.createConnectorContext(viewObj);
        listener.enterConnector(ctx);
        listener.process(ctx);
        listener.exitConnector(ctx);
    }


    public void visit(Variables node) {
        VarsContext varsCtx = ctxFactory.createVarsContext(node); //new VarsContext(node);
        listener.enterVariables(varsCtx);
        List<Object> vars = node.getStockOrFlowOrAuxvar();

        for (Object var : vars){
            if (var instanceof Stock) visit((Stock) var);
            else if (var instanceof Flow) visit((Flow) var);
            else if (var instanceof Auxvar) visit((Auxvar) var);
            else if (var instanceof Gf) visit((Gf) var);
            else if (var instanceof Group) visit((Group) var);
            else if (var instanceof Module) visit((Module) var);
            else {
                System.err.println("unknown Model element "+node.toString());
            }
        }
        listener.exitVariables(varsCtx);

    }

    private void visit(Stock var) {
        StockContext ctx = ctxFactory.createStockContext(var); //new StockContext(var);
        listener.enterStock(ctx);
        ctx.visit(this, listener);
        listener.exitStock(ctx);
    }

    private void visit(Module var) {
        // TODO Auto-generated method stub

    }

    private void visit(Group var) {
        // TODO Auto-generated method stub

    }

    private void visit(Gf var) {
        // TODO Auto-generated method stub

    }

    private void visit(Auxvar var) {
        AuxvarContext ctx = ctxFactory.createAuxvarContext(var); //new AuxvarContext(var);
        listener.enterAuxvar(ctx);
        listener.process(ctx);
        listener.exitAuxvar(ctx);

    }

    private void visit(Flow var) {
        FlowContext ctx = ctxFactory.createFlowContext(var); //new FlowContext(var);
        listener.enterFlow(ctx);
        listener.process(ctx);
        listener.exitFlow(ctx);
    }

    private void pushModel() {
        // TODO Auto-generated method stub
        inheritDefaults();

    }

    private void inheritDefaults() {
        // TODO Auto-generated method stub

    }

    public void visit(Style node) {
        // TODO Auto-generated method stub

    }

    public void visit(Macro node) {
        // TODO Auto-generated method stub

    }

    public void visit(Data node) {
        // TODO Auto-generated method stub

    }

    public void visit(Behavior node) {
        // TODO Auto-generated method stub

    }

    public void visitChildren(ModelUnits node) {
        // TODO Auto-generated method stub

    }

    public void visit(SimSpecs node) {
        if (node != null){
            SimSpecsContext ctx = ctxFactory.createSimSpectContext(node); //new SimSpecsCtx(node);
            listener.enterSimSpecs(ctx);
            listener.process(ctx);
            listener.exitSimSpecs(ctx);
        }
    }


}
