package org.sdxchange.xmile.loader.context;

import org.oasis.xmile.v1_0.Model;
import org.sdxchange.xmile.loader.XmileListener;
import org.sdxchange.xmile.loader.XmileWalker;

public class ModelCtx {

    Model docNode;

    public ModelCtx(Model node) {
        docNode = node;
    }

    public void visit(XmileWalker walker, XmileListener listener) {
        listener.enterModel(this);
        walker.visit( docNode.getSimSpecs());
        walker.visit( docNode.getBehavior());
        walker.visit( docNode.getVariables());
        walker.visit( docNode.getViews());
        listener.exitModel(this);
    }

}
