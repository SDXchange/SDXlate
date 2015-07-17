package org.sdxchange.xmile.devkit.xframe;

import org.sdxchange.xmile.devkit.symbol.PaneBase;
import org.sdxchange.xmile.devkit.util.XUtil;

public class TableOutPane extends PaneBase implements Pane{


    @Override
    public String dump() {
        String rval = "";
        rval += (super.title == null || title.isEmpty()) ? XUtil.rPad("", 15): XUtil.rPad(title, 15);
        rval += super.getEntityNames();
        return rval;
    }


}
