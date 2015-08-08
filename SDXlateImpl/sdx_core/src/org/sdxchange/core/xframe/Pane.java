package org.sdxchange.core.xframe;

import org.sdxchange.core.symbol.EntitySymbol;

import java.util.List;


public interface Pane {
    public void addEntity(EntitySymbol e);
    public List<EntitySymbol> getEntities();
    public String getTitle();
    public String dump();
    void setTitle(String title);

}
