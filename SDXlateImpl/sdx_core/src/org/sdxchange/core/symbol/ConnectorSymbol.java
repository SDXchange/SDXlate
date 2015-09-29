package org.sdxchange.core.symbol;

public class ConnectorSymbol {
    String from;
    String to;
    String uid;

    public ConnectorSymbol(String uid, String from, String to){
        this.from = from;
        this.to = to;
        this.uid = uid;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getUid() {
        return uid;
    }

    public String dump() {
        return getUid()+", " + getFrom() +"->"+getTo();
    }



}
