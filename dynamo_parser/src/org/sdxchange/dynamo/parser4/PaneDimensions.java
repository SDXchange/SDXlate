package org.sdxchange.dynamo.parser4;

public class PaneDimensions {
    int x, y, width, height;

    public PaneDimensions( int x, int y, int width, int height ){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        //TODO: replace this hack with separated dimensions for graph and table.
        int rval = y;
        y+=25;
        return rval;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
