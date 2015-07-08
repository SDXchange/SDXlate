package org.sdxchange.dynamo.parser4;

import java.util.ArrayList;
import java.util.List;

import org.sdxchange.dynamo.app2.XmileBuilder;

public class TablePane implements Pane {

    List<Column> columns = new ArrayList<Column>();

    public void addColumn(Column line) {
        columns.add(line);
    }


    public List<Column> getColumns(){
        return columns;
    }


    @Override
    public void accept(XmileBuilder builder, List<Object> vList) {
        builder.marshall(this, vList );
    }

}
