package org.sdxchange.xmile.loader.context;

import java.util.List;

import org.oasis.xmile.v1_0.Auxvar;
import org.sdxchange.xmile.devkit.symbol.AuxSymbol;
import org.sdxchange.xmile.devkit.symbol.AuxSymbolBase;
import org.sdxchange.xmile.devkit.symbol.DispatchDelegate;
import org.sdxchange.xmile.devkit.symbol.DispatchEnabled;
import org.sdxchange.xmile.devkit.symbol.XSymbol;
import org.sdxchange.xmile.loader.parse.ParseUtil;
import org.sdxchange.xmile.parser4.XmileParser.ExprContext;

public class AuxvarContext extends AuxSymbolBase
implements AuxSymbol, DispatchEnabled, XSymbol
{

    private XmileContextFactory ctxFactory = null;

    Auxvar docNode;
    VarAttrs wrapped;
    ExprContext eqnParseTree = null;

    public AuxvarContext(Auxvar var) {
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
    public Object dispatch(DispatchDelegate visitor) {
        // visitor.visit(this);
        return null;
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
