package org.sdxchange.xmile.devkit.symbol;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.oasis.xmile.devkit.view.DrawingAttributes;
import org.sdxchange.xmile.devkit.policy.TargetPolicy;
import org.sdxchange.xmile.devkit.util.XUtil;

public class SymbolBase {

    protected String name;
    protected String varType;
    protected String eqn;
    protected List<String> dependencies = new ArrayList<String>();
    //TODO: push lREf into the Symbol interface. it's pretty Dynamo specific
    public String lRef = "";
    protected XY position = new XY(0,0);
    protected String comment = null;
    protected boolean hasNestedTable = false;
    protected GfSymbol nestedTable = null;
    private DrawingAttributes drawingAttributes;
    private TargetPolicy policy;



    public String getName() {
        return name;
    }

    public String dump() {
        return XUtil.rPad(varType, 7)
                + XUtil.rPad(name, 15)
                + XUtil.rPad(lRef, 15)
                + XUtil.rPad(""+position.getX(), 5)
                + XUtil.rPad(""+position.getY(), 5)
                + XUtil.rPad(eqn, 60)
                + ((hasNestedTable)?"Y ":"N ")
                + dependencies;
    }

    public void addInFlow(String varText){
        //not implemented in base
    }

    public void addOutFlow(String varText)
    {
        //not implemented in base
    }

    public void addInFlows(List<String> flows){
        //not implemented in base
    }

    public void addOutFlows(List<String> flows)
    {
        //not implemented in base
    }

    public Set<String> getInFlows(){
        return new HashSet<String>(); //not implemented in base
    }

    public Set<String> getOutFlows(){
        return new HashSet<String>(); //not implemented in base
    }

    public String getEqn(){
        return eqn;
    }

    public void setEqn(String val) {
        eqn = val;
    }

    public void setInputs(Set<String> inputs) {
        dependencies.addAll(inputs);
    }

    public String getVarType(){
        return varType;
    };

    public void setPosition(XY pos){
        this.position = pos;
    };

    public XY getPosition() {
        return position;
    };

    public List<String> getDependencies(){
        return dependencies;
    }

    public void setComment(String text){
        this.comment = text;
    }

    public String getComment(){
        return comment;
    }

    public boolean hasNestedTable() {
        return hasNestedTable;
    }


    public void setHasNestedTable(boolean hasNestedTable) {
        this.hasNestedTable = hasNestedTable;
    }

    public GfSymbol getNestedTable() {
        return nestedTable;
    }


    public void setNestedTable(GfSymbol nestedTable) {
        this.nestedTable = nestedTable;
    }

    public void setDrawingAttrs(DrawingAttributes dAttr) {
        drawingAttributes = dAttr ;
    }

    public DrawingAttributes getDrawingAttrs(){
        return drawingAttributes;
    }

    public void setTargetPolicy(TargetPolicy policy){
        this.policy = policy;
    }

    public TargetPolicy getTargetPolicy(){
        return policy;
    }


}
