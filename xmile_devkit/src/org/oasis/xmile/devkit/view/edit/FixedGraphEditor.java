package org.oasis.xmile.devkit.view.edit;

import org.sdxchange.xmile.devkit.symbol.XSymbol;
import org.sdxchange.xmile.devkit.symbol.XY;
import org.sdxchange.xmile.devkit.xframe.IXFrame;


public class FixedGraphEditor implements GraphEditor {

    public int defaultXSpace = 50;
    public int defaultYSpace = 50;
    public int defaultAuxCol = 50;
    public int defaultFlowCol = 150;
    public int defaultStockCol = 200;
    public int defaultPaneWidth = 350;
    public int defaultPaneHeight = 280;

    private int lastAuxY = 0;
    private int lastFlowY = 0;
    private int lastStockY = 0;

    @Override
    public void assignPositions(IXFrame frame) {
        for (XSymbol var : frame.getDefinedVars()){
            switch (var.getVarType()) {
                case "AUX" :
                    var.setPosition(new XY(defaultAuxCol, lastAuxY+=defaultYSpace));
                    break;
                case "INIT" :
                    //var.setPosition(new XY(defaultAuxCol, lastAuxY+=defaultYSpace));
                    break;
                case "RATE" :
                    var.setPosition(new XY(defaultFlowCol, lastFlowY+=defaultYSpace));
                    break;
                case "LVL" :
                    var.setPosition(new XY(defaultStockCol, lastStockY+=defaultYSpace));
                    break;
                case "GF" :
                    var.setPosition(new XY(defaultStockCol, lastStockY+=defaultYSpace));
                    break;
            }
        };

        frame.setPaneDimensions( defaultAuxCol+50, Math.max(lastFlowY, lastStockY)+defaultYSpace, defaultPaneWidth, defaultPaneHeight);
    }

    public int getMaxY() {
        return Math.max(Math.max(lastAuxY, lastStockY), lastFlowY);
    }
}
