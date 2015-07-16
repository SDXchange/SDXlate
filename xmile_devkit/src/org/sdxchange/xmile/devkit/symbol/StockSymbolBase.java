package org.sdxchange.xmile.devkit.symbol;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.sdxchange.xmile.devkit.util.XUtil;

public class StockSymbolBase extends SymbolBase
implements StockSymbol, DispatchEnabled {

    protected Set<String> outFlows = new HashSet<String>();
    protected Set<String> inFlows = new HashSet<String>();

    public StockSymbolBase(){
        super();
        super.varType = XSymbol.Type.stock;
    }

    @Override
    public String dump() {
        return XUtil.rPad(varType, 7)
                + XUtil.rPad(name, 15)
                + XUtil.rPad(lRef, 15)
                + XUtil.rPad(""+position.getX(), 5)
                + XUtil.rPad(""+position.getY(), 5)
                + XUtil.rPad(eqn, 60)
                + "  IN "+inFlows +"\n"
                + XUtil.rPad("          ", 107)+ "  OUT"+ outFlows;
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
    public void addInFlows(List<String> flows){
        inFlows.addAll(flows);
    }

    @Override
    public void addOutFlows(List<String> flows)
    {
        outFlows.addAll(flows);
    }

    @Override
    public Set<String> getInFlows(){
        return inFlows; //not implemented in base
    }

    @Override
    public Set<String> getOutFlows(){
        return outFlows; //not implemented in base
    }


    @Override
    public Object dispatch(DispatchDelegate visitor) {
        // TODO Auto-generated method stub
        // need some generics magic.
        return null;
    }

}
