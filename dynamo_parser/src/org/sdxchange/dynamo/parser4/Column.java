package org.sdxchange.dynamo.parser4;

public class Column {

    private int index = 0;
    private String name = "";
    public Column(String name, int i) {
        index = i;
        if (name != null){
            this.name = name;
        }
    }

    public Integer getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

}
