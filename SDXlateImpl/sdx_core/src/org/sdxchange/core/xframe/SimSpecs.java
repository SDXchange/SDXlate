package org.sdxchange.core.xframe;

public class SimSpecs {
    private String stop;
    private String start = "0";
    private String dt;
    private String simMethod = "Euler";

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
    public void setStart(String time) {
        start = time;
    }
    public void setDefaultMethod(String method) {
        simMethod = method;
    }
}
