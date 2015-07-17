package org.sdxchange.insight.app;


public class DisplayNode extends BaseImNode {
    private String fixedAttrs = "xAxis=\"Time (%u)\" yAxis=\"%o\" ThreeDimensional=\"false\" AutoAddPrimitives=\"false\""
            + " ScatterplotOrder=\"X Primitive, Y Primitive\" Image=\"Display\" yAxis2=\"\" Primitives2=\"\""
            + " showMarkers=\"false\" showLines=\"true\" showArea=\"false\" legendPosition=\"None\" ";
    private String name = "Default Display";
    private String type="Time Series";
    private String entities = null;
    private String style = "roundImage;image=/builder/images/DisplayFull.png;" ;


    /*  Primitives=\"60,61,63,76\"
     *  id="3"
     *
     *
     */
    public DisplayNode(String name, String type, int parent, int id){
        this.name = name;
        vertex=true;
        visible=false;
        this.type = type;
        this.id = id;
        this.parent = parent;
        this.setStyle(style);
        width = 64;
        height = 64;
        x=50;
        y=20;
    }

    public void setEntities(String idList){
        entities = idList;
    }

    @Override
    public String marshall(){
        String rval = "<Display "
                + attr("name", name)
                + attr("Type", type)
                + attr("Primitives", entities)
                + attr("id", id)
                + fixedAttrs
                + ">\n";
        rval +=  super.marshallCell();
        rval += "</Display>\n";
        return rval;

    }

}
