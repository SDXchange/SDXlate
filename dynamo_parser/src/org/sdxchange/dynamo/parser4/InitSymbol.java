package org.sdxchange.dynamo.parser4;

import org.sdxchange.dynamo.app2.XmileBuilder;
import org.sdxchange.dynamo.parser4.DynamoParser;
import org.sdxchange.dynamo.parser4.DynamoParser.INIT_EQNContext;

public class InitSymbol extends SymbolBase implements Symbol  {

    private INIT_EQNContext ctx = null;

    public InitSymbol(String varName, String varType, String eqn) {
        super.name = varName;
        super.varType = varType;
        super.eqn = eqn;
    }

    public InitSymbol(String varName, String varType, String eqn, String leftRef) {
        this(varName,varType,eqn);
        super.lRef = leftRef;
    }

    @Override
    public Object dispatch(XmileBuilder xmileBuilder, XFrame frame) {
        return xmileBuilder.marshall(this, frame);
    }

    public void setContext(INIT_EQNContext ctx) {
        this.ctx = ctx;
    }

    public INIT_EQNContext getContext(){
        return ctx;
    }

}
