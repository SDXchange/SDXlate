package org.sdxchange.insight.app;

import org.sdxchange.xmile.devkit.symbol.GfSymbol;

public class ConvNode extends BaseImNode {

    String fixedAttrs = "Units=\"Unitless\" MaxConstraintUsed=\"false\" MinConstraintUsed=\"false\" MaxConstraint=\"100\" MinConstraint=\"0\" ShowSlider=\"false\" SliderMax=\"100\" SliderMin=\"0\" SliderStep=\"\" Image=\"None\" FlipHorizontal=\"false\" FlipVertical=\"false\" LabelPosition=\"Middle\" ";
    GfSymbol table = null;
    String tableType = null;

    public ConvNode(String name, Integer parent, Integer id) {
        style="converter";
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
        String rval = "<Converter "
                + attr("name", name)
                + attr("Source", source)
                + attr("Data", table.getTableAsXyPairs())
                + attr("Interpolation", mapType(tableType) )
                + ((! eqn.isEmpty()) ? attr("Equation", eqn) : "")
                + attr("id", id)
                + fixedAttrs
                + ">\n";

        rval +=  super.marshallCell();
        rval += "</Converter>\n";
        return rval;

    }

    public void setTableInfo(GfSymbol table) {
        this.table = table;
    }

    public void setTableType(String type){
        tableType = type;
    }

    private String mapType(String inType){
        String rval = inType;
        switch (inType) {
            case "continuous" :
                rval = "Linear";
                break;
            default:

        }
        return rval;
    }

}
