package org.sdxchange.core.symbol;



public class AuxSymbolBase extends SymbolBase
implements AuxSymbol, DispatchEnabled {

    public AuxSymbolBase(){
        super();
        super.varType = XSymbol.Type.aux;
    }


    @Override
    public Object dispatch(DispatchDelegate visitor) {
        // TODO Auto-generated method stub
        // need some generics magic.
        return null;
    }

}