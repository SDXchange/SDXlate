package org.sdxchange.core.symbol;



public class FlowSymbolBase extends SymbolBase
implements AuxSymbol, DispatchEnabled {

    public FlowSymbolBase(){
        super();
        super.varType = XSymbol.Type.flow;
    }

    @Override
    public Object dispatch(DispatchDelegate visitor) {
        // TODO Auto-generated method stub
        // need some generics magic.
        return null;
    }

}