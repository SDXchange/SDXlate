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
import org.oasis.xmile.v1_0.Stock;
import org.oasis.xmile.v1_0.Style;
import org.oasis.xmile.v1_0.Variables;
import org.oasis.xmile.v1_0.Views;
import org.oasis.xmile.v1_0.Xmile;
import org.oasis.xmile.v1_0.Xmile.Dimensions;
import org.sdxchange.xmile.loader.context.AuxvarContext;
import org.sdxchange.xmile.loader.context.FlowContext;
import org.sdxchange.xmile.loader.context.ModelCtx;
import org.sdxchange.xmile.loader.context.SimSpecsCtx;
import org.sdxchange.xmile.loader.context.VarsContext;


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

    public XmileWalker(Xmile doc, XmileListener listener){
        this.listener = listener;
        this.doc = doc;
        this.frame = this.currentFrame = new XmileFrame("");
    }

    private void visit(){
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
    }

    private void visit(Dimensions node) {
        // TODO Auto-generated method stub

    }

    private void visit(Model root) {
        pushModel();
        ModelCtx ctx = new ModelCtx(root);
        ctx.visit( this, listener);
    }

    public void visit(Views node) {
        if (listener.targetSupportsMultipleViewsPerModel()){
            // TODO Auto-generated method stub
        }
    }

    public void visit(Variables node) {
        VarsContext varsCtx = new VarsContext(node);
        listener.enterVariables(varsCtx);
        List<Object> vars = node.getStockOrFlowOrAuxvar();

        for (Object var : vars){
            if (var instanceof Stock) visit((SimSpecs) var);
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
        AuxvarContext ctx = new AuxvarContext(var);
        listener.enterAuxvar(ctx);
        ctx.visit(this);
        listener.exitAuxvar(ctx);

    }

    private void visit(Flow var) {
        FlowContext ctx = new FlowContext(var);
        ctx.visit(this, listener);

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
        SimSpecsCtx ctx = new SimSpecsCtx(node);
        ctx.visit(this, listener);
    }


}
