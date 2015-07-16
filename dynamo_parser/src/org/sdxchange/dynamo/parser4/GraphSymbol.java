package org.sdxchange.dynamo.parser4;

import org.sdxchange.dynamo.app2.XmileBuilder;
import org.sdxchange.xmile.devkit.symbol.SymbolBase;


public class GraphSymbol extends SymbolBase implements Symbol  {


    private String xMin;
    private String xMax;
    private String yPts;

    public GraphSymbol(String varName, String varType, String eqn) {
        super.name = varName;
        super.varType = varType;
        super.eqn = eqn; //used for y-value list.
    }

    public GraphSymbol(String varName, String varType, String eqn, String leftRef) {
        this(varName,varType,eqn);
        super.lRef = leftRef;
    }

    @Override
    public Object dispatch(XmileBuilder xmileBuilder, IXFrame frame) {
        return xmileBuilder.marshall(this, frame);
    }

    public String getXMax() {
        return xMax;
    }

    public String getXMin() {
        return xMin;
    }

    public void setxMin(String xMin) {
        this.xMin = xMin;
    }

    public void setxMax(String xMax) {
        this.xMax = xMax;
    }

    public String getYPts() {
        return yPts;
    }

    public void setYPts(String text) {
        yPts = text;
    }

}
