package org.sdxchange.dynamo.parser4;

import org.sdxchange.dynamo.app2.XmileBuilder;


public class AuxTabSymbol extends AuxSymbol implements Symbol {


    private String xMax;
    private String xMin;
    private String yValues;

    private String gf = "";

    public AuxTabSymbol(String varName, String varType, String eqn, String leftRef) {
        super(varName, varType, eqn, leftRef);
    }

    public String getGf() {
        return gf;
    }

    public void setGf(String gf) {
        this.gf = gf;
    }

    public String getxMax() {
        return xMax;
    }

    public void setxMax(String xMax) {
        this.xMax = xMax;
    }

    public String getxMin() {
        return xMin;
    }

    public void setxMin(String xMin) {
        this.xMin = xMin;
    }

    public String getyValues() {
        return yValues;
    }

    public void setyValues(String yValues) {
        this.yValues = yValues;
    }

    @Override
    public Object dispatch(XmileBuilder builder, IXFrame frame) {
        return builder.marshal(this, frame);
    }




}
