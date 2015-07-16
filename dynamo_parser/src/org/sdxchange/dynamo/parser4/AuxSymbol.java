package org.sdxchange.dynamo.parser4;

import org.sdxchange.dynamo.app2.XmileBuilder;
import org.sdxchange.xmile.devkit.symbol.SymbolBase;


public class AuxSymbol extends SymbolBase implements Symbol  {

    public AuxSymbol(String varName, String varType, String eqn) {
        super.name = varName;
        super.varType = varType;
        super.eqn = eqn;
    }

    public AuxSymbol(String varName, String varType, String eqn, String leftRef) {
        this(varName,varType,eqn);
        super.lRef = leftRef;
    }

    @Override
    public Object dispatch(XmileBuilder builder, IXFrame frame) {
        return builder.marshal(this, frame);
    }


}
