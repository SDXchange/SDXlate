package org.sdxchange.xmile.loader.context;

import org.oasis.xmile.v1_0.Flow;
import org.sdxchange.xmile.loader.XmileListener;
import org.sdxchange.xmile.loader.XmileWalker;

public class FlowContext {

    Flow docNode;

    public FlowContext(Flow var) {
        this.docNode = var;
    }

    public void visit(XmileWalker xmileWalker, XmileListener listener) {
        listener.enterFlow(this);
        listener.process(this);
        listener.exitFlow(this);
    }



}
