package org.sdxchange.xmile.devkit.xframe;


public interface Visitable {
    public Object accept(XmileVisitor visitor, IXFrame frame);
}
