package org.sdxchange.insight.app;

public class AuxNode extends BaseImNode {

    String fixedAttrs = "Units=\"Unitless\" MaxConstraintUsed=\"false\" MinConstraintUsed=\"false\" MaxConstraint=\"100\" MinConstraint=\"0\" ShowSlider=\"false\" SliderMax=\"100\" SliderMin=\"0\" SliderStep=\"\" Image=\"None\" FlipHorizontal=\"false\" FlipVertical=\"false\" LabelPosition=\"Middle\" ";

    public AuxNode(String name, Integer parent, Integer id) {
        style="variable";
        this.name = name;
        vertex=true;
        visible=true;
        this.parent = parent;
        this.id = id;

        width = 100;
        height = 50;

    }

    public void setEqn(String eqn){
        this.eqn = eqn;
    }

    @Override
    public String marshall(){
        String rval = "<Variable "
                + attr("name", name)
                + ((! eqn.isEmpty()) ? attr("Equation", eqn) : "")
                + attr("id", id)
                + fixedAttrs
                + ">\n";

        rval +=  super.marshallCell();
        rval += "</Variable>\n";
        return rval;

    }

}
