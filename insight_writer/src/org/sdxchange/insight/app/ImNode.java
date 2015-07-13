package org.sdxchange.insight.app;

public interface ImNode {

    public abstract boolean isEdge();

    public abstract void setEdge(boolean edge);

    public abstract boolean isVertex();

    public abstract void setVertex(boolean vertex);

    public abstract int getParent();

    public abstract void setParent(int parent);

    public abstract int getSource();

    public abstract void setSource(int source);

    public abstract int getTarget();

    public abstract void setTarget(int target);

    public abstract int getId();

    public abstract void setId(int id);

    public abstract String getStyle();

    public abstract void setStyle(String style);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getX();

    public abstract void setX(int x);

    public abstract int getY();

    public abstract void setY(int y);

    public abstract int getWidth();

    public abstract void setWidth(int width);

    public abstract int getHeight();

    public abstract void setHeight(int height);

    public abstract boolean isRelative();

    public abstract void setRelative(boolean relative);

    public abstract void setPosition(int x, int y);

    public abstract String marshall();

}