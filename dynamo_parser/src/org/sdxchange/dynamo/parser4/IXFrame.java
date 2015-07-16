package org.sdxchange.dynamo.parser4;

import java.util.Collection;
import java.util.List;

import org.sdxchange.xmile.devkit.symbol.XSymbol;
import org.sdxchange.xmile.devkit.xframe.Dimensions;
import org.sdxchange.xmile.devkit.xframe.SimSpecs;
import org.sdxchange.xmile.devkit.xframe.ViewParams;

public interface IXFrame {

    public abstract String getName();

    public abstract void defineVar(String varName, XSymbol sym);

    public abstract void defineInitializer(String varName, InitSymbol sym);

    public abstract void dump();

    public abstract Collection<InitSymbol> getInitializers();

    public abstract XSymbol getDeclaredSymbol(String name);

    public abstract void update(XSymbol sym);

    public abstract void addOutputPane(TablePane pane);

    public abstract void addOutputPane(GraphPane pane);

    public abstract SimSpecs getSimSpec();

    public abstract Collection<XSymbol> getDefinedVars();

    public abstract List<Pane> getGraphOutputs();

    public abstract List<Pane> getTableOutputs();

    public abstract Dimensions getPaneDimensions();

    public abstract void setSimulationName(String comment);

    public abstract String getSimulationName();

    public abstract String dumpSymbols();

    public abstract ViewParams getViewParams();

}