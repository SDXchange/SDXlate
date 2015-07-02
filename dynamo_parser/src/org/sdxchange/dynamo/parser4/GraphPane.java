package org.sdxchange.dynamo.parser4;

import java.util.ArrayList;
import java.util.List;

import org.sdxchange.dynamo.app2.XmileBuilder;

public class GraphPane implements Pane {

    List<PlotLine> lineSpecs = new ArrayList<PlotLine>();

    public void addLine(PlotLine line) {
        lineSpecs.add(line);
    }

    @Override
    public void accept(XmileBuilder builder, List<Object> vList) {
        builder.marshall(this , vList );
    }


    public List<PlotLine> getLines(){
        return lineSpecs;
    }


}
