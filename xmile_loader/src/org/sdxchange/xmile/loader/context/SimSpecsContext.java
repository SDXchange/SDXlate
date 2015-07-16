package org.sdxchange.xmile.loader.context;

import org.oasis.xmile.v1_0.SimSpecs;
import org.sdxchange.xmile.loader.XmileListener;
import org.sdxchange.xmile.loader.XmileWalker;

public class SimSpecsContext {


    private Double startTime = 0.0;
    private Double stopTime = 100.0;
    private String timeUnit = "minutes";
    private Double dt = 1.0;
    private String method = "Euler";

    public SimSpecsContext(SimSpecs node) {
        this.dt = node.getDt().getValue();
        this.startTime = node.getStart();
        this.stopTime = node.getStop();
        this.method = node.getMethod();
    }

    public void visit(XmileWalker walker, XmileListener listener) {

    }

    public String getMethod() {
        return method;
    }

    public Double getStartTime() {
        return startTime;
    }

    public Double getStopTime() {
        return stopTime;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public Double getDt() {
        return dt;
    }


}
