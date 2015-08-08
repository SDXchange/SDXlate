package org.sdxchange.core.xframe;


public interface Visitable {
    public Object accept(XmileVisitor visitor, IXFrame frame);
}
