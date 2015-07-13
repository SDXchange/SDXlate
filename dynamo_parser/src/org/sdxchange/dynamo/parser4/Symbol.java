package org.sdxchange.dynamo.parser4;

import java.util.List;
import java.util.Set;

import org.sdxchange.dynamo.app2.XmileBuilder;
import org.sdxchange.dynamo.parser4.XY;

public interface Symbol {

    public String getName();

    public String dump();

    public String getEqn();

    public void setInputs(Set<String> inputs);

    public void setEqn(String eqn);

    public void addInFlow(String varText);

    public void addOutFlow(String varText);

    public Object dispatch(XmileBuilder xmileBuilder, XFrame frame);

    public String getVarType();

    public void setPosition(XY xy);

    public XY getPosition();

    public List<String> getDependencies();

    public void setComment(String text);

}
