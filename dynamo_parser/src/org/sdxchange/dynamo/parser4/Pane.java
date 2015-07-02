package org.sdxchange.dynamo.parser4;

import java.util.List;

import org.sdxchange.dynamo.app2.XmileBuilder;

public interface Pane {

    public void accept(XmileBuilder builder, List<Object> vList);

}
