package org.sdxchange.xmile.devkit.symbol;

import org.sdxchange.xmile.devkit.util.Range;


public class GfSymbolBase extends SymbolBase implements GfSymbol {
    protected String tableType = "";
    protected String yPts = null;
    //TODO: add support for scale interval in underlying symbol.
    //in fact, most of this should get pushed to the symbol base.
    protected String xPts = null;
    protected Range  yScale= null;
    protected Range  xScale= null;
    protected String xyPairs = null;

    protected void initXyPairs() {
        if (xPts == null && xScale != null && yPts != null){
            String[] bareYpts = yPts.split(",");
            String[] bareXpts = new String[bareYpts.length];
            Double interval = (xScale.getMax() - xScale.getMin())/ (bareYpts.length-1);
            bareXpts[0] = ""+xScale.getMin();
            Double currentX = xScale.getMin();
            xPts = ""+xScale.getMin();
            for (int i =1; i < bareYpts.length; i++){
                currentX += interval;
                bareXpts[i] = ""+currentX;
                xPts += ","+currentX;
            }

            xyPairs = bareXpts[0] +","+bareYpts[0];
            for (int i = 1; i< bareYpts.length; i++){
                xyPairs += "; "+ bareXpts[i] +","+bareYpts[i];
            }
            System.out.println("XyPairs initialized: "+xyPairs);
        }

    }

    @Override
    public String getTableAsXyPairs() {
        return xyPairs;
    }

    @Override
    public String getTableType() {
        return tableType;
    }

}
