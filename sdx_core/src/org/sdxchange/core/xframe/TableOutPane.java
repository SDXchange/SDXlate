package org.sdxchange.core.xframe;


import org.sdxchange.core.symbol.PaneBase;
import org.sdxchange.core.util.XUtil;

public class TableOutPane extends PaneBase implements Pane{


    @Override
    public String dump() {
        String rval = "";
        rval += (super.title == null || title.isEmpty()) ? XUtil.rPad("", 15): XUtil.rPad(title, 15);
        rval += super.getEntityNames();
        return rval;
    }


}
