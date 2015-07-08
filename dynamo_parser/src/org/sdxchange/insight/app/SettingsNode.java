package org.sdxchange.insight.app;

public class SettingsNode extends BaseImNode {

    String stop = "100";
    String start = "0";
    String timeUnits = "Minutes";
    String dt = "1";
    String fixedAttrs = "Version=\"36\" StrictUnits=\"false\" StrictLinks=\"false\" StrictAgentResolution=\"false\" Units=\"\" HiddenUIGroups=\"Validation,User Interface\" SolutionAlgorithm=\"RK1\" BackgroundColor=\"white\" Throttle=\"1\" Macros=\"&#xa;&#xa;int(x) &lt;- floor(x)\" SensitivityPrimitives=\"\" SensitivityRuns=\"50\" SensitivityBounds=\"50, 80, 95, 100\" SensitivityShowRuns=\"false\" article=\"{&quot;comments&quot;:true, &quot;facebookUID&quot;: &quot;&quot;}\" StyleSheet=\"{}\" ";

    public SettingsNode (){
        id = 2;
        parent = 1;
        visible=false;
        vertex=true;
        x=y=20;
        width=80;
        height=40;

    }

    @Override
    public String marshall(){
        String rval = "<Setting "
                + "TimeLength=\""+stop+"\" "
                + "TimeStart=\""+start+"\" "
                + "TimeStep=\""+dt+"\" "
                + attr("TimeUnits", timeUnits)
                + fixedAttrs
                + ">\n";

        rval +=  super.marshallCell();
        rval += "</Setting>\n";
        return rval;
    }


    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

}
