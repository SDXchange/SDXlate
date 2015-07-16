package org.sdxchange.xmile.loader.context;

import java.util.List;
import java.util.Set;

import org.oasis.xmile.v1_0.Stock;
import org.sdxchange.xmile.devkit.symbol.StockSymbol;
import org.sdxchange.xmile.devkit.symbol.StockSymbolBase;
import org.sdxchange.xmile.loader.XmileListener;
import org.sdxchange.xmile.loader.XmileWalker;
import org.sdxchange.xmile.loader.parse.ParseUtil;
import org.sdxchange.xmile.parser4.XmileParser.ExprContext;

public class StockContext extends StockSymbolBase
implements StockSymbol {

    Stock docNode ;
    ExprContext eqnParseTree = null;

    private XmileContextFactory ctxFactory = null;

    public Stock getDocNode() {
        return docNode;
    }

    public StockContext(Stock var) {
        this.docNode = var;
        this.name=var.getName();
        this.ctxFactory = XmileContextFactory.getInstance();
        List<Object> items = docNode.getEqnOrMathmlOrUnits();
        VarAttrs wrapped = new VarAttrs(items);
        super.addInFlows(wrapped.getInflows());
        super.addOutFlows(wrapped.getOutflows());
        setEqn( wrapped.getEqn() );
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

    @Override
    public String getName()
    {
        return docNode.getName();
    }

    public void visit(XmileWalker xmileWalker, XmileListener listener) {
    }

    @Override
    public String getEqn() {
        return eqn;
    }

    public Set<String> getInflows() {
        return super.getInFlows();
    }

    public Set<String> getOutflows() {
        return super.getOutFlows();
    }


}
