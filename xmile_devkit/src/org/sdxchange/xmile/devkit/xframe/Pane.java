package org.sdxchange.xmile.devkit.xframe;

import java.util.List;

import org.sdxchange.xmile.devkit.symbol.EntitySymbol;

public interface Pane {
    public void addEntity(EntitySymbol e);
    public List<EntitySymbol> getEntities();
    public String getTitle();
    public String dump();
    void setTitle(String title);

}
