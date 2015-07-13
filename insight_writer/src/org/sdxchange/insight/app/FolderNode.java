package org.sdxchange.insight.app;



public class FolderNode extends BaseImNode {

    private String fixedAttrs = "Type=\"None\" Solver=\"{&quot;enabled&quot;: false, &quot;algorithm&quot;: &quot;RK1&quot;, &quot;timeStep&quot;: 1}\" Image=\"None\" FlipHorizontal=\"false\" FlipVertical=\"false\" LabelPosition=\"Middle\" AgentBase=\"\" ";


    public FolderNode(String simulationName, int id) {
        name = simulationName;
        style="folder";
        vertex=true;
        visible=true;
        parent=1;
        x=y=5;
        width=height=300; //temporary. should be overwritten when model is complete.
        this.id = id;
    }

    @Override
    public String marshall(){
        String rval = "<Folder "
                + attr("name", name)
                + attr("id", id)
                + fixedAttrs
                + ">\n";

        rval +=  super.marshallCell();
        rval += "</Folder>\n";
        return rval;
    }

}
