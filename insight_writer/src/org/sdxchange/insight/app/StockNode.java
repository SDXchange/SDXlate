package org.sdxchange.insight.app;

public class StockNode extends BaseImNode{

    String eqn = "";
    String fixedAttrs = "StockMode=\"Store\" Delay=\"10\" Volume=\"100\" NonNegative=\"false\" Units=\"Unitless\" MaxConstraintUsed=\"false\" MinConstraintUsed=\"false\" MaxConstraint=\"100\" MinConstraint=\"0\" ShowSlider=\"false\" SliderMax=\"100\" SliderMin=\"0\" SliderStep=\"\" Image=\"None\" FlipHorizontal=\"false\" FlipVertical=\"false\" LabelPosition=\"Middle\" " ;

    public StockNode(String name, int parent, int id){
        this.name = name;
        vertex = true;
        edge = false;
        style = "stock";
        width = 100;
        height = 40;
        this.id = id;
        this.parent = id;
        visible=true;
    }

    public void setEqn(String eqn) {
        this.eqn = eqn;
    }

    @Override
    public String marshall(){
        String rval = "<Stock "
                + attr("name", name)
                + attr("id", id)
                + attr("InitialValue",eqn)
                + fixedAttrs
                + ">\n";

        rval +=  super.marshallCell();
        rval += "</Stock>\n";
        return rval;

    }
}
