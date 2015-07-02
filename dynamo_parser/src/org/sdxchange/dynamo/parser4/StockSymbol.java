package org.sdxchange.dynamo.parser4;

import java.util.HashSet;
import java.util.Set;

import org.sdxchange.dynamo.app2.XmileBuilder;

public class StockSymbol extends SymbolBase implements Symbol {

    private Set<String> outFlows = new HashSet<String>();
    private Set<String> inFlows = new HashSet<String>();

    public StockSymbol(String varName, String varType) {
        super.name=varName;
        super.varType = varType;
        super.eqn = "";
    }

    public StockSymbol(String varName, String varType, String leftRef) {
        this(varName,varType);
        super.lRef = leftRef;
    }

    @Override
    public void addInFlow(String varText){
        inFlows.add(varText);
    }

    @Override
    public void addOutFlow(String varText)
    {
        outFlows.add(varText);
    }

    @Override
    public Object dispatch(XmileBuilder xmileBuilder, XFrame frame) {
        return xmileBuilder.marshall(this, frame);
    }


    @Override
    public String dump() {
        return XUtil.rPad(varType, 7)
                + XUtil.rPad(name, 15)
                + XUtil.rPad(lRef, 15)
                + XUtil.rPad(""+position.getX(), 5)
                + XUtil.rPad(""+position.getY(), 5)
                + XUtil.rPad(eqn, 60)
                + "IN "+inFlows +"\n"
                + XUtil.rPad("          ", 107)+ "OUT"+ outFlows;
    }

    public Set<String> getInFlows() {
        return inFlows;
    }

    public Set<String> getOutFlows() {
        return outFlows;
    }



}
