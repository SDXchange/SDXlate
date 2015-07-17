package org.sdxchange.xmile.devkit.symbol;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.sdxchange.xmile.devkit.xframe.Pane;

public abstract class PaneBase implements Pane {

    protected List<EntitySymbol> items = new ArrayList<EntitySymbol>();
    protected String title;
    protected String index;

    @Override
    public void addEntity(EntitySymbol e) {
        items.add(e);
    }

    @Override
    public List<EntitySymbol> getEntities() {
        return items;
    }

    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public void setTitle(String ttl ){
        this.title = ttl;
    }

    public Set<String> getEntityNames() {
        Set<String> rval = new HashSet<String>();
        for (EntitySymbol item: items){
            rval.add(item.getName());
        }
        return rval;
    }

    @Override
    public abstract String dump();
}
