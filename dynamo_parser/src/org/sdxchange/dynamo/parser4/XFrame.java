package org.sdxchange.dynamo.parser4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.sdxchange.dynamo.parser4.DynamoParser.ModelContext;

public class XFrame {

    private String name;
    private ModelContext moduleCtx;
    private Map<String,Symbol> definedVars = new HashMap<String, Symbol>();
    private Map<String,InitSymbol> initializers = new HashMap<String, InitSymbol>();
    private Set<String> arrayIndexValues = new HashSet<String>();
    private SimSpecs specs = new SimSpecs();
    private List<Pane> graphs = new ArrayList<Pane>();
    private List<Pane> tables = new ArrayList<Pane>();
    private PaneDimensions paneDim;
    private String simulationName="";
    private ViewParams viewParams = new ViewParams();

    public XFrame(String fname, ModelContext ctx) {
        this.name = fname;
        this.moduleCtx = ctx;
        arrayIndexValues.add("*");
    }
    //defined functions table
    //referenced functions table
    //referenced variables
    //simspecs
    //overlayspecs

    public String getName() {
        return name;
    }


    public void defineVar(String varName, Symbol sym) {
        System.out.println("Defining Aux "+sym.dump());
        Symbol existing = definedVars.put(varName, sym);
        if (existing != null){
            System.err.println("Duplicate Symbol definition: "+existing+" :: "+sym);
        }
    }

    public void defineInitializer(String varName, InitSymbol sym) {
        System.out.println("Defining Ini "+sym.dump());
        Symbol existing = initializers.put(varName, sym);
        if (existing != null){
            System.err.println("Duplicate Initializer definition: "+existing+" :: "+sym);
        }

    }

    public void dump() {
        for (Symbol sym: definedVars.values()){
            System.out.println(sym.dump());
        }
    }

    public Collection<InitSymbol> getInitializers() {
        return initializers.values();
    }

    public Symbol getDeclaredSymbol(String name) {
        return definedVars.get(name);
    }

    public void update(Symbol sym) {

        Symbol existing = definedVars.put(sym.getName(), sym);
        if (existing == null){
            System.err.println("Attempt to update undeclared symbol: "+sym.getName());
        }
    }

    public void addOutputPane(TablePane pane){
        tables.add(pane);
    }
    public void addOutputPane(GraphPane pane){
        graphs.add(pane);
    }

    public SimSpecs getSimSpec() {
        return specs;
    }

    public Collection<Symbol> getDefinedVars() {
        return definedVars.values();
    }

    public List<Pane> getGraphOutputs() {
        return graphs;
    }

    public List<Pane> getTableOutputs() {
        return tables;
    }

    public void setPaneDimensions(int x, int y, int width, int height) {
        paneDim = new PaneDimensions(x,y,width,height);
    }

    public PaneDimensions getPaneDimensions(){
        return paneDim;
    }

    public void setSimulationName(String comment) {
        simulationName = comment;

    }
    public String getSimulationName() {
        return simulationName;

    }

    public String dumpSymbols() {
        String rval="";
        for (Symbol sym : definedVars.values()){
            rval+=(sym.dump()+"\n");
        }
        return rval;
    }

    public ViewParams getViewParams() {
        return viewParams;
    }





}
