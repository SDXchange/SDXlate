package org.sdxchange.xmile.loader.context;

import org.oasis.xmile.v1_0.ViewContentType.Table;
import org.oasis.xmile.v1_0.ViewContentType.Table.Item;
import org.sdxchange.xmile.devkit.symbol.Entity;
import org.sdxchange.xmile.devkit.xframe.Pane;
import org.sdxchange.xmile.devkit.xframe.TableOutPane;

public class TableOutContext extends TableOutPane implements Pane {

    XmileContextFactory ctxFactory = null;


    public TableOutContext(Table table) {
        super.title = table.getTitle();
        for (Item item: table.getItem()){
            org.oasis.xmile.v1_0.ViewContentType.Table.Item.Entity docE = item.getEntity();
            Entity e = new Entity(""+item.getIndex(), docE.getName());
            super.items.add(e);
        }
    }


}
