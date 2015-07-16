package org.sdxchange.xmile.loader.context;

import java.util.List;

import org.oasis.xmile.v1_0.Flow;
import org.sdxchange.xmile.devkit.symbol.DispatchEnabled;
import org.sdxchange.xmile.devkit.symbol.FlowSymbol;
import org.sdxchange.xmile.devkit.symbol.FlowSymbolBase;
import org.sdxchange.xmile.loader.parse.ParseUtil;
import org.sdxchange.xmile.parser4.XmileParser.ExprContext;

public class FlowContext extends FlowSymbolBase
implements FlowSymbol, DispatchEnabled{

    private Flow docNode;
    private VarAttrs wrapped;
    ExprContext eqnParseTree = null;

    private XmileContextFactory ctxFactory = null;

    public FlowContext(Flow var) {
        assert( var != null);
        this.docNode = var;
        this.ctxFactory = XmileContextFactory.getInstance();
        super.name=var.getName();
        List<Object> items = docNode.getEqnOrMathmlOrUnits();
        wrapped = new VarAttrs(items);
        setEqn( wrapped.getEqn());
        hasNestedTable = wrapped.hasNestedTable();
        if (hasNestedTable) {
            nestedTable = ctxFactory.createGfContext(wrapped.getNestedTable());
        }
    }

    @Override
    public void setEqn(String eqn)
    {
        eqnParseTree = ctxFactory.createExprContext(eqn);
        setInputs(XmileContextFactory.getInputVars(eqnParseTree));
        super.setEqn(eqn);
    }

    @Override
    public String dump(){
        if (eqnParseTree != null){
            return super.dump() + "        "+ eqnParseTree.toStringTree(ParseUtil.refParser);
        }
        else {
            return dump();
        }
    }

}
