package org.sdxchange.xmile.devkit.xframe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.sdxchange.xmile.devkit.policy.TargetPolicy;
import org.sdxchange.xmile.devkit.symbol.ConnectorSymbol;
import org.sdxchange.xmile.devkit.symbol.GraphOutPane;
import org.sdxchange.xmile.devkit.symbol.XSymbol;



public class BaseXframe implements IXFrame {

    private String name;
    private Map<String, XSymbol> definedVars = new HashMap<String, XSymbol>();
    private Map<String,InitContext> initializers = new HashMap<String, InitContext>();
    private Set<String> arrayIndexValues = new HashSet<String>();
    private SimSpecs specs = new SimSpecs();
    private List<Pane> graphs = new ArrayList<Pane>();
    private List<Pane> tables = new ArrayList<Pane>();
    private Dimensions paneDim;
    private String simulationName="";
    private ViewParams viewParams = new ViewParams();
    private TargetPolicy targetPolicy = null;
    private List<ConnectorSymbol> connectors = new ArrayList<ConnectorSymbol>();

    public BaseXframe(String frameName) {
        this.name = frameName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void defineVar(String varName, XSymbol sym) {
        XSymbol existing = definedVars.put(varName, sym);
        if (existing != null){
            System.err.println("Duplicate Symbol definition: "+existing+" :: "+sym);
        }
    }

    @Override
    public void dump() {
        for (XSymbol sym: definedVars.values()){
            System.out.println(sym.dump());
        }
    }

    @Override
    public XSymbol getDeclaredSymbol(String name) {
        return definedVars.get(name);
    }

    @Override
    public void update(XSymbol sym) {
        XSymbol existing = definedVars.put(sym.getName(), sym);
        if (existing == null){
            System.err.println("Attempt to update undeclared symbol: "+sym.getName());
        }
    }

    @Override
    public Collection<XSymbol> getDefinedVars() {
        return definedVars.values();
    }

    @Override
    public void setSimulationName(String comment) {
        simulationName = comment;
    }

    @Override
    public String getSimulationName() {
        return simulationName;
    }

    @Override
    public String dumpSymbols() {
        String rval="";
        for (XSymbol sym : definedVars.values()){
            rval+=(sym.dump()+"\n");
        }
        return rval;
    }

    @Override
    public SimSpecs getSimSpec() {
        return this.specs;
    }

    @Override
    public Dimensions getPaneDimensions() {
        return paneDim;
    }

    @Override
    public void setPaneDimensions(int x, int y, int width, int height) {
        paneDim = new Dimensions(x,y,width,height);
    }

    @Override
    public void defineInitializer(String varName, InitContext sym) {
        InitContext existing = initializers.put(varName, sym);
        if (existing != null){
            System.err.println("Duplicate Initializer definition: "+existing+" :: "+sym);
        }
    }

    @Override
    public Collection<InitContext> getInitializers() {
        return initializers.values();
    }

    @Override
    public void addOutputPane(TableOutPane pane) {
        tables.add(pane);
    }

    @Override
    public void addOutputPane(GraphOutPane pane) {
        graphs.add(pane);
    }

    @Override
    public List<Pane> getGraphOutputs() {
        return this.graphs;
    }

    @Override
    public List<Pane> getTableOutputs() {
        return this.tables;
    }

    @Override
    public void setTargetPolicy(TargetPolicy policy){
        this.targetPolicy = policy;
    }

    @Override
    public void addConnector(ConnectorSymbol conn) {
        //TODO error checking.
        connectors.add(conn);
    }

    @Override
    public List<ConnectorSymbol> getConnectors() {
        return connectors;
    }

    @Override
    public void updateConnector(ConnectorSymbol conn) {
        connectors.add(conn);
    }

    public String dumpConnectors() {
        String rval = "";
        for (ConnectorSymbol conn: connectors){
            rval += conn.dump()+"\n";
        }
        return rval;
    }

    public String dumpTables() {
        String rval = "";
        for (Pane table: tables){
            rval += table.dump()+"\n";
        }
        return rval;
    }

    public String dumpGraphs() {
        String rval = "";
        for (Pane graph: graphs){
            rval += graph.dump()+"\n";
        }
        return rval;
    }


}
