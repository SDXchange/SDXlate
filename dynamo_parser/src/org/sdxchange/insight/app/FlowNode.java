package org.sdxchange.insight.app;

public class FlowNode extends BaseImNode{

    String eqn = "";
    String fixedAttrs = "OnlyPositive=\"false\" TimeIndependent=\"false\" Units=\"Unitless\" MaxConstraintUsed=\"false\" MinConstraintUsed=\"false\" MaxConstraint=\"100\" MinConstraint=\"0\" ShowSlider=\"false\" SliderMax=\"100\" SliderMin=\"0\" SliderStep=\"\" ";
    int sourceX = 0;
    int sourceY = 0;

    int targetX = 0;
    int targetY = 0;

    public FlowNode(String name, int parent, int id){
        this.name = name;
        vertex = false;
        visible = true;
        edge = true;
        style = "flow;startArrow=block;startFill=0;" ;
        this.id = id;
        this.parent = id;
        relative = false;
    }

    public void setEqn(String eqn) {
        this.eqn = eqn;
    }

    @Override
    public String marshall(){
        String rval = "<Flow "
                + attr("name", name)
                + attr("id", id)
                + attr("FlowRate",eqn)
                + fixedAttrs
                + ">\n";

        rval +=  marshallCell();
        rval += "</Flow>\n";
        return rval;
    }

    @Override
    public String marshallGeometry(){
        String
        rval = "<mxGeometry "
                + attr("width", 100) + attr("height", 100)
                + attr("as","geometry") +">\n";

        rval += "<mxPoint "
                + attr("y", y)
                + attr("as","sourcePoint")
                +"/>\n";

        rval += "<mxPoint "
                + attr("x",sourceX)
                + attr("y",targetY+125)
                + attr("as","targetPoint")
                +"/>\n";

        rval += "</mxGeometry>\n";

        return rval;

    }

    public int getSourceX() {
        return sourceX;
    }

    public void setSourceX(int sourceX) {
        this.sourceX = sourceX;
    }

    public int getTargetX() {
        return targetX;
    }

    public void setTargetX(int targetX) {
        this.targetX = targetX;
    }

    public int getTargetY() {
        return targetY;
    }

    public void setTargetY(int targetY) {
        this.targetY = targetY;
    }

    public int getSourceY() {
        return sourceY;
    }

    public void setSourceY(int sourceY) {
        this.sourceY = sourceY;
    }


}
