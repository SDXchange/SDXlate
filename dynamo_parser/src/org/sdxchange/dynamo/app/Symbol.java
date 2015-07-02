package org.sdxchange.dynamo.app;

import java.util.LinkedList;
import java.util.List;

public class Symbol {
    enum Type {
        kStock,
        kFlow,
        kAux,
        kGfunc,
        kInit,
        kFuncRef,
        kPendingDef
    }
    private static final int kColWid = 15;
    protected Type symType;
    protected NsType nsType;
    protected String ns; /* namespace id */

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<String> from = new LinkedList<String>();
    protected String eqn;
    protected String lineCmnt;

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
        if (symType != null && symType != Type.kPendingDef){
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
            rval += rPad(name, kColWid) + symType.name()+"\n";
        }
        for (String ante: from){
            rval += rPad(name, kColWid) + rPad(symType.name(), kColWid) + ante +"\n";
        }
        return rval;
    }

    public static final String pad = "                                                         ";
    public static String rPad(String str, int wid) {
        return str + pad.substring(0, wid-str.length());
    }

    public static String lPad(String str, char c, int wid){
        StringBuffer buf = new StringBuffer(wid);
        int padchars = (wid - str.length());
        while ( padchars-- > 0){
            buf.append( c);
        }
        buf.append(str);
        return buf.toString();
    }

    public void addFrom(List<String> ids) {
        from.addAll(ids);
    }

}
