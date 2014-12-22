package examples;

import java.util.LinkedList;
import java.util.List;

public class Symbol {
    enum Type {
        stock,
        flow,
        aux,
        gf,
        init,
        fRef
    }
    private static final int kColWid = 15;
    private Type symType;

    private String name;
    private List<String> from = new LinkedList<String>();

    public Symbol (String name, Type type){
        symType = type;
        this.name = name;
    }

    public void addFrom(String name){
        if (! from.contains(name)){
            from.add(name);
        }
    }

    public void setType(Type type){
        if (symType != null && symType != Type.fRef){
            System.err.println("Error: attempted symbol type redefinition from "+symType +" to "+type);
        }
        else {
            symType = type;
        }
    }

    public Type getType() {
        return symType;
    }

    public final List<String> getFrom(){
        return from;
    }

    @Override
    public String toString(){
        String rval = "";
        if (from == null || from.size() == 0){
            rval += rpad(name, kColWid) + symType.name()+"\n";
        }
        for (String ante: from){
            rval += rpad(name, kColWid) + rpad(symType.name(), kColWid) + ante +"\n";
        }
        return rval;
    }

    public static final String pad = "                                                         ";
    public static String rpad(String str, int wid) {
        return str + pad.substring(0, wid-str.length());
    }

    public void addFrom(List<String> ids) {
        from.addAll(ids);
    }

}
