package org.sdxchange.xmile.devkit.xframe;

import java.util.Collection;
import java.util.List;

import org.sdxchange.xmile.devkit.policy.TargetPolicy;
import org.sdxchange.xmile.devkit.symbol.ConnectorSymbol;
import org.sdxchange.xmile.devkit.symbol.GraphOutPane;
import org.sdxchange.xmile.devkit.symbol.XSymbol;



public interface IXFrame {

    public abstract String getName();

    public abstract void defineVar(String varName, XSymbol sym);

    public abstract void defineInitializer(String varName, InitContext sym);

    public abstract void dump();

    public abstract Collection<InitContext> getInitializers();

    public abstract XSymbol getDeclaredSymbol(String name);

    public abstract void update(XSymbol sym);

    public abstract void addOutputPane(GraphOutPane pane);

    public abstract SimSpecs getSimSpec();

    public abstract Collection<XSymbol> getDefinedVars();

    public abstract List<Pane> getGraphOutputs();

    public abstract List<Pane> getTableOutputs();

    public abstract Dimensions getPaneDimensions();

    public abstract void setSimulationName(String comment);

    public abstract String getSimulationName();

    public abstract String dumpSymbols();

    public abstract void setPaneDimensions(int x, int y, int defaultPaneWidth, int defaultPaneHeight);

    void setTargetPolicy(TargetPolicy policy);

    void addConnector(ConnectorSymbol conn);

    List<ConnectorSymbol> getConnectors();

    void updateConnector(ConnectorSymbol conn);

    void addOutputPane(TableOutPane pane);

//    public abstract ViewParams getViewParams();

}