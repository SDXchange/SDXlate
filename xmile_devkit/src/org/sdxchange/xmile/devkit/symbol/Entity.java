package org.sdxchange.xmile.devkit.symbol;

public class Entity implements EntitySymbol {

    String index = null ;
    String name = null;

    public Entity(String index, String name){
        this.index = index;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getIndex() {
        return index;
    }

}
