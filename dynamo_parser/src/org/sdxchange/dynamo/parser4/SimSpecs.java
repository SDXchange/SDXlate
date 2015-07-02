package org.sdxchange.dynamo.parser4;

public class SimSpecs {
    private String stop;
    private String start = "0";
    private String dt;

    public void setDt(String text) {
        dt = text;

    }
    public void setStop(String text) {
        stop = text;

    }
    public String getDt() {
        return dt;
    }

    public String getStop() {
        return stop;
    }
    public String getStart() {
        return start;
    }
}
