package org.sdxchange.core.symbol;

import org.sdxchange.core.util.XUtil;
import org.sdxchange.core.xframe.Pane;


public class GraphOutPane extends PaneBase implements Pane {



    @Override
    public String dump() {
        String rval = "";
        rval += (super.title == null || title.isEmpty()) ? XUtil.rPad("", 15): XUtil.rPad(title, 15);
        rval += super.getEntityNames();
        return rval;
    }

}
