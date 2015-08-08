package org.sdxchange.core.xframe;

import org.sdxchange.core.policy.TargetPolicy;
import org.sdxchange.core.symbol.ConnectorSymbol;
import org.sdxchange.core.symbol.GraphOutPane;
import org.sdxchange.core.symbol.XSymbol;

import java.util.Collection;
import java.util.List;


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