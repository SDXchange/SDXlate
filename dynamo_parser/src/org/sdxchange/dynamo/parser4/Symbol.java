package org.sdxchange.dynamo.parser4;

import org.sdxchange.dynamo.app2.XmileBuilder;
import org.sdxchange.xmile.devkit.symbol.XSymbol;

public interface Symbol extends XSymbol {

    public Object dispatch(XmileBuilder xmileBuilder, IXFrame frame);

}
