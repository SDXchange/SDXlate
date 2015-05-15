package org.sdxchange.dynamo.app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DynVars {
    private static final String[] xNames = {
        "DT",
        "MAXLEN"

    };

    public static Set<String> builtIns = new HashSet<String>();

    public DynVars(){
        builtIns.addAll( Arrays.asList(xNames));
    }

    public boolean isBuiltIn(String name){
        return builtIns.contains(name);
    }

    public Set<String> getAll() {
        return builtIns;
    }

}
