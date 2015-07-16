package org.sdxchange.xmile.devkit.symbol;

import org.sdxchange.xmile.devkit.util.XUtil;
import org.sdxchange.xmile.devkit.xframe.Pane;


public class GraphOutPane extends PaneBase implements Pane {

    @Override
    public String dump() {
        String rval = "";
        rval += (super.title == null || title.isEmpty()) ? XUtil.rPad("", 15): XUtil.rPad(title, 15);
        rval += super.getEntityNmes();
        return rval;
    }

}
