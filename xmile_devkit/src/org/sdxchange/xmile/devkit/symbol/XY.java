package org.sdxchange.xmile.devkit.symbol;

public class XY {
    int x;
    int y;

    public XY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public XY(Double x2, Double y2) {
        this(x2.intValue(), y2.intValue());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
