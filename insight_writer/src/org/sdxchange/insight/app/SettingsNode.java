package org.sdxchange.insight.app;

public class SettingsNode extends BaseImNode {

    String stop = "100";
    String start = "0";
    String timeUnits = "Minutes";
    String dt = "1";
    String fixedAttrs = "Version=\"36\" StrictUnits=\"false\" StrictLinks=\"false\" StrictAgentResolution=\"false\" Units=\"\" HiddenUIGroups=\"Validation,User Interface\" SolutionAlgorithm=\"RK1\" BackgroundColor=\"white\" Throttle=\"1\"  SensitivityPrimitives=\"\" SensitivityRuns=\"50\" SensitivityBounds=\"50, 80, 95, 100\" SensitivityShowRuns=\"false\" StyleSheet=\"{}\" ";
    String defaultMacros = "SDX_TIME() &lt;- (TIME()/{1 %%timeunit%%})"
            + "&#xa;&#xa;int(x) &lt;- floor(x)"
            + "&#xa;&#xa;SMTH1(a,b) &lt;- SMOOTH(a,b)"
            + "&#xa;&#xa;IF_THEN_ELSE(a,b,c) &lt;- IfThenElse(a,b,c)";
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
        String macroStr = defaultMacros.replace("%%timeunit%%", timeUnits);
        String rval = "<Setting "
                + "TimeLength=\""+stop+"\" "
                + "TimeStart=\""+start+"\" "
                + "TimeStep=\""+dt+"\" "
                + attr("TimeUnits", timeUnits)
                + "Macros=\""+ macroStr+"\" " //avoid escaping twice.
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
