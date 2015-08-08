package org.sdxchange.core.symbol;

import java.util.List;
import java.util.Set;

import org.oasis.xmile.devkit.view.DrawingAttributes;

public interface XSymbol {

    public String getName();

    public String dump();

    public String getEqn();

    public void setInputs(Set<String> inputs);

    public void setEqn(String eqn);

    public void addInFlow(String varText);

    public void addOutFlow(String varText);

    public void addInFlows(List<String> flows);

    public void addOutFlows(List<String> flows);

    public Set<String> getInFlows();

    public Set<String> getOutFlows();

    public String getVarType();

    public void setPosition(XY xy);

    public XY getPosition();

    public List<String> getDependencies();

    public void setComment(String text);

    //for nexted table detection and manipulation

    public boolean hasNestedTable();
    public void setHasNestedTable(boolean hasNestedTable);
    public GfSymbol getNestedTable() ;
    public void setNestedTable(GfSymbol nestedTable);

    public interface Type {
        public static final String stock = "LVL";
        public static final String flow  = "RATE";
        public static final String aux   = "AUX";
    }

    public void setDrawingAttrs(DrawingAttributes dAttr);

    public DrawingAttributes getDrawingAttrs();


}
