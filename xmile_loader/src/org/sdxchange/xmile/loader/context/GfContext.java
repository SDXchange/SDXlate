package org.sdxchange.xmile.loader.context;

import org.oasis.xmile.v1_0.Gf;
import org.oasis.xmile.v1_0.MinMaxType;
import org.oasis.xmile.v1_0.PointsType;
import org.sdxchange.xmile.devkit.symbol.DispatchDelegate;
import org.sdxchange.xmile.devkit.symbol.DispatchEnabled;
import org.sdxchange.xmile.devkit.symbol.GfSymbol;
import org.sdxchange.xmile.devkit.symbol.GfSymbolBase;
import org.sdxchange.xmile.devkit.util.Range;

public class GfContext extends GfSymbolBase
implements GfSymbol, DispatchEnabled {


    public GfContext(Gf table) {
        PointsType temp = null;
        MinMaxType mmTmp = null;
        super.name = table.getName();
        this.tableType = table.getType();
        if ( (temp = table.getXpts())!= null){
            xPts = temp.getValue();
        }
        if ( (temp = table.getYpts())!= null){
            yPts = temp.getValue();
        }
        if ( (mmTmp = table.getXscale()) != null){
            xScale = new Range(mmTmp.getMin(), mmTmp.getMax());
        }
        if ( (mmTmp = table.getYscale()) != null){
            yScale = new Range(mmTmp.getMin(), mmTmp.getMax());
        }
        initXyPairs();
    }



    @Override
    public Object dispatch(DispatchDelegate visitor) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public String getTableType() {
        return this.tableType;
    }


}
