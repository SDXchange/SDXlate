package org.sdxchange.dynamo.parser4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.sdxchange.xmile.devkit.symbol.XSymbol;
import org.sdxchange.xmile.devkit.xframe.Dimensions;
import org.sdxchange.xmile.devkit.xframe.SimSpecs;
import org.sdxchange.xmile.devkit.xframe.ViewParams;

public class XFrame implements IXFrame {

    private String name;
    private Map<String, XSymbol> definedVars = new HashMap<String, XSymbol>();
    private Map<String,InitSymbol> initializers = new HashMap<String, InitSymbol>();
    private Set<String> arrayIndexValues = new HashSet<String>();
    private SimSpecs specs = new SimSpecs();
    private List<Pane> graphs = new ArrayList<Pane>();
    private List<Pane> tables = new ArrayList<Pane>();
    private Dimensions paneDim;
    private String simulationName="";
    private ViewParams viewParams = new ViewParams();

    public XFrame(String fname) {
        this.name = fname;
        arrayIndexValues.add("*");
    }
    //defined functions table
    //referenced functions table
    //referenced variables
    //simspecs
    //overlayspecs

    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#getName()
     */
    @Override
    public String getName() {
        return name;
    }


    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#defineVar(java.lang.String, org.oasis.xmile.devkit.xframe.XSymbol)
     */
    @Override
    public void defineVar(String varName, XSymbol sym) {
        System.out.println("Defining Aux "+sym.dump());
        XSymbol existing = definedVars.put(varName, sym);
        if (existing != null){
            System.err.println("Duplicate Symbol definition: "+existing+" :: "+sym);
        }
    }

    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#defineInitializer(java.lang.String, org.sdxchange.dynamo.parser4.InitSymbol)
     */
    @Override
    public void defineInitializer(String varName, InitSymbol sym) {
        System.out.println("Defining Ini "+sym.dump());
        XSymbol existing = initializers.put(varName, sym);
        if (existing != null){
            System.err.println("Duplicate Initializer definition: "+existing+" :: "+sym);
        }

    }

    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#dump()
     */
    @Override
    public void dump() {
        for (XSymbol sym: definedVars.values()){
            System.out.println(sym.dump());
        }
    }

    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#getInitializers()
     */
    @Override
    public Collection<InitSymbol> getInitializers() {
        return initializers.values();
    }

    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#getDeclaredSymbol(java.lang.String)
     */
    @Override
    public XSymbol getDeclaredSymbol(String name) {
        return definedVars.get(name);
    }

    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#update(org.oasis.xmile.devkit.xframe.XSymbol)
     */
    @Override
    public void update(XSymbol sym) {

        XSymbol existing = definedVars.put(sym.getName(), sym);
        if (existing == null){
            System.err.println("Attempt to update undeclared symbol: "+sym.getName());
        }
    }

    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#addOutputPane(org.sdxchange.dynamo.parser4.TablePane)
     */
    @Override
    public void addOutputPane(TablePane pane){
        tables.add(pane);
    }
    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#addOutputPane(org.sdxchange.dynamo.parser4.GraphPane)
     */
    @Override
    public void addOutputPane(GraphPane pane){
        graphs.add(pane);
    }

    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#getSimSpec()
     */
    @Override
    public SimSpecs getSimSpec() {
        return specs;
    }

    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#getDefinedVars()
     */
    @Override
    public Collection<XSymbol> getDefinedVars() {
        return definedVars.values();
    }

    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#getGraphOutputs()
     */
    @Override
    public List<Pane> getGraphOutputs() {
        return graphs;
    }

    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#getTableOutputs()
     */
    @Override
    public List<Pane> getTableOutputs() {
        return tables;
    }

    public void setPaneDimensions(int x, int y, int width, int height) {
        paneDim = new Dimensions(x,y,width,height);
    }

    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#getPaneDimensions()
     */
    @Override
    public Dimensions getPaneDimensions(){
        return paneDim;
    }

    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#setSimulationName(java.lang.String)
     */
    @Override
    public void setSimulationName(String comment) {
        simulationName = comment;

    }
    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#getSimulationName()
     */
    @Override
    public String getSimulationName() {
        return simulationName;

    }

    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#dumpSymbols()
     */
    @Override
    public String dumpSymbols() {
        String rval="";
        for (XSymbol sym : definedVars.values()){
            rval+=(sym.dump()+"\n");
        }
        return rval;
    }

    /* (non-Javadoc)
     * @see org.sdxchange.dynamo.parser4.IXFrame#getViewParams()
     */
    @Override
    public ViewParams getViewParams() {
        return viewParams;
    }





}
