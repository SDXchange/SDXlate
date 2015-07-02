package org.sdxchange.dynamo.parser4;

public class TableInfo {

    String interval = null;
    String xMax = null;
    String xMin = null;
    String name = null;
    String yValues = "";


    public TableInfo(String name, String min, String max, String interval) {
        this.name = name;
        xMin = min;
        xMax = max;
        this.interval = interval;
    }

    public String getXMax() {
        return xMax;
    }


    public String getXMin() {
        return xMin;
    }


    public String getName() {
        return name;
    }

    public void setYValues(String text) {
        yValues = text;
    }

    public String getYValues() {
        return yValues;
    }


}
