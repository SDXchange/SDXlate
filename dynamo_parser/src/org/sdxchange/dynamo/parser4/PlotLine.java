package org.sdxchange.dynamo.parser4;

public class PlotLine {

    public String varName;
    public int index;

    public PlotLine( String name, int index ){
        varName = name;
        this.index = index;
    }

    public String getName() {
        return varName;
    }

    public Integer getIndex() {
        return index;
    }

}
