package org.sdxchange.dynamo.parser4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SymbolBase {

    protected String name;
    protected String varType;
    protected String eqn;
    protected List<String> dependencies = new ArrayList<String>();
    protected String lRef = "";
    protected XY position = new XY(0,0);
    protected String comment = null;


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
                + dependencies;
    }

    public void addInFlow(String varText){
        //not implemented in base
    }

    public void addOutFlow(String varText)
    {
        //not implemented in base
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

}
