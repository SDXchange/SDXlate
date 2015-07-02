package org.sdxchange.dynamo.app;

public class FuncRef extends Symbol {
    static int nextInstance = 1;
    private int instance = 0; /* zero is invalid value */

    public FuncRef(String name, Type type) {
        super(name, type);
        this.instance = nextInstance ++;
    }

    @Override
    public String getName(){
        return super.getName()+"_"+Symbol.lPad(""+instance, '0', 4);
    }
}
