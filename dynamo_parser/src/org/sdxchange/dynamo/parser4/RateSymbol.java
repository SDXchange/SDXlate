package org.sdxchange.dynamo.parser4;

import org.sdxchange.dynamo.app2.XmileBuilder;

public class RateSymbol extends SymbolBase implements Symbol {

    public RateSymbol(String varName, String varType, String eqn) {
        super.name = varName;
        super.varType = varType;
        super.eqn = eqn;
    }

    public RateSymbol(String varName, String varType, String eqn, String leftRef) {
        this(varName,varType,eqn);
        super.lRef = leftRef;

    }

    @Override
    public Object dispatch(XmileBuilder xmileBuilder, XFrame frame) {
        return xmileBuilder.marshall(this, frame);
    }

}
