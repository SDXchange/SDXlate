package org.sdxchange.xmile.loader.context;

import org.oasis.xmile.v1_0.Plot;
import org.oasis.xmile.v1_0.ViewContentType.Graph;
import org.sdxchange.xmile.devkit.symbol.Entity;
import org.sdxchange.xmile.devkit.symbol.GraphOutPane;
import org.sdxchange.xmile.devkit.xframe.Pane;

public class GraphOutContext extends GraphOutPane implements Pane {

    public GraphOutContext(Graph graph) {
        super.title = graph.getTitle();

//        super.ctxFactory =  XmileContextFactory.getInstance();
        for (Plot item: graph.getPlot()){
            org.oasis.xmile.v1_0.Plot.Entity docE = item.getEntity();
            Entity e = new Entity(""+item.getIndex(), docE.getName());
            super.items.add(e);
        }
    }

}
