package org.sdxchange.dynamo.app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DynFunctions {
    private static final String[] xNames = {
        "CLIP",
        "DELAY3",
        "EXP",
        "LOGN",
        "MIN",
        "MAX",
        "SMOOTH",
        "SWITCH",
        "TIME"
    };

    public static Set<String> builtIns = new HashSet<String>();

    public DynFunctions(){
        builtIns.addAll( Arrays.asList(xNames));
    }

    public boolean isBuiltIn(String name){
        return builtIns.contains(name);
    }

    public Set<String> getAll() {
        return builtIns;
    }
}


