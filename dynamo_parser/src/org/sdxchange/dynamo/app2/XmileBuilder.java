package org.sdxchange.dynamo.app2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.oasis.xmile.v1_0.Auxvar;
import org.oasis.xmile.v1_0.Flow;
import org.oasis.xmile.v1_0.Gf;
import org.oasis.xmile.v1_0.Header;
import org.oasis.xmile.v1_0.MinMaxType;
import org.oasis.xmile.v1_0.Model;
import org.oasis.xmile.v1_0.ObjectFactory;
import org.oasis.xmile.v1_0.Options;
import org.oasis.xmile.v1_0.Plot;
import org.oasis.xmile.v1_0.PointsType;
import org.oasis.xmile.v1_0.Product;
import org.oasis.xmile.v1_0.SimSpecs;
import org.oasis.xmile.v1_0.SimSpecs.Dt;
import org.oasis.xmile.v1_0.StackedContainer;
import org.oasis.xmile.v1_0.Stock;
import org.oasis.xmile.v1_0.Variables;
import org.oasis.xmile.v1_0.ViewContentType;
import org.oasis.xmile.v1_0.ViewContentType.Connector.From;
import org.oasis.xmile.v1_0.ViewContentType.Flow.Pts;
import org.oasis.xmile.v1_0.ViewContentType.Flow.Pts.Pt;
import org.oasis.xmile.v1_0.ViewContentType.Graph;
import org.oasis.xmile.v1_0.ViewContentType.Table;
import org.oasis.xmile.v1_0.ViewContentType.Table.Item.Entity;
import org.oasis.xmile.v1_0.Views;
import org.oasis.xmile.v1_0.Views.View;
import org.oasis.xmile.v1_0.Xmile;
import org.sdxchange.dynamo.parser4.AuxSymbol;
import org.sdxchange.dynamo.parser4.AuxTabSymbol;
import org.sdxchange.dynamo.parser4.Column;
import org.sdxchange.dynamo.parser4.GraphPane;
import org.sdxchange.dynamo.parser4.GraphSymbol;
import org.sdxchange.dynamo.parser4.InitSymbol;
import org.sdxchange.dynamo.parser4.Pane;
import org.sdxchange.dynamo.parser4.PaneDimensions;
import org.sdxchange.dynamo.parser4.PlotLine;
import org.sdxchange.dynamo.parser4.RateSymbol;
import org.sdxchange.dynamo.parser4.StockSymbol;
import org.sdxchange.dynamo.parser4.Symbol;
import org.sdxchange.dynamo.parser4.TablePane;
import org.sdxchange.dynamo.parser4.XFrame;

import edu.iastate.xmile.util.XmlHelper;

/**
 * Responsible for constructing an Xmile Document from various input tables and objects.
 * @author RWARD
 *
 */
public class XmileBuilder {

    Xmile document;
    ObjectFactory factory = new ObjectFactory();
    XmlHelper<Xmile> helper = new XmlHelper<Xmile>();
    SimSpecs globalSpecs;
    XFrame lastFrame = null;

    public XmileBuilder(){
        document = factory.createXmile();
        document.setVersion(BigDecimal.valueOf(1.0));
        //UsesOutputs out = factory.createOptionsUsesOutputs();
        //options.setUsesOutputs(out);
        populateSkeleton();

    }

    private void populateSkeleton() {
        setDefaultSimSpecs();
        addHeader();
    }

    private void addHeader() {
        Header header = factory.createHeader();
        document.setHeader(header);
        header.setVendor("SDXchange");
        Product product = factory.createProduct();
        product.setValue("SDXchange Dynamo to XMILE");
        product.setVersion("1.0");
        header.setProduct(product);
        Options options = factory.createOptions();
        options.setUsesOutputs(factory.createOptionsUsesOutputs());
        options.setHasModelView(factory.createEmptyType());
        header.setOptions(options);
    }

    private void setDefaultSimSpecs(){
        globalSpecs = factory.createSimSpecs();
        List<Object> topElements = document.getSimSpecsOrModelUnitsOrBehavior();
        topElements.add(0, globalSpecs );
        setSimDT(".25");
        setSimStart("0");
        setSimStop("600");
    }
    private void setSimStart(String value) {
        globalSpecs.setStart(Double.valueOf(value));

    }

    private void setSimStop(String value) {
//      System.out.println("Setting stop to "+value);
        globalSpecs.setStop(Double.valueOf(value));
    }

    private void setSimDT(String value) {
//      System.out.println("Setting dt to "+value);
        Dt dt = globalSpecs.getDt();
        if (dt == null){
            dt = factory.createSimSpecsDt();
            globalSpecs.setDt(dt);
        }
        dt.setValue(Double.valueOf(value));
    }


    public void applySimSpecs(XFrame frame){
        if (frame.getSimSpec().getDt() != null){
            globalSpecs.getDt().setValue(new Double(frame.getSimSpec().getDt()));
        }
        if (frame.getSimSpec().getStop() != null){
            globalSpecs.setStop(new Double(frame.getSimSpec().getStop()));
        }
        if (frame.getSimSpec().getStart() != null){
            globalSpecs.setStart(new Double(frame.getSimSpec().getStart()));
        }

    }

    public void applyDefaultFrame(XFrame frame){
        updateHeader(frame);
        Variables vars = factory.createVariables();
        List<Object>modules = document.getSimSpecsOrModelUnitsOrBehavior();
        Model model = factory.createModel();
//        model.setName("default");
        modules.add(model);
        marshallVariables(vars, frame);
        model.setVariables(vars);
        marshallView(model, frame);
    }


    private void updateHeader(XFrame frame) {
        document.getHeader().setName(frame.getSimulationName());

    }

    private void marshallView(Model model, XFrame frame) {
        lastFrame = frame;
        Views views = factory.createViews();
        model.setViews(views);
        View view = marshallViewVars( frame);
        marshallConnectors( view, frame);
        views.getStyleOrView().add(view);
        marshallOutputPanes(frame, view);
    }

    static int index = 1;

    private void marshallOutputPanes(XFrame frame, View view) {
        List<Object> vList = view.getStyleOrStockOrFlow();
        marshallPanes(frame.getGraphOutputs(), frame, vList);
        marshallPanes(frame.getTableOutputs(), frame, vList);
    }

    private void marshallPanes(List<Pane> outputs, XFrame frame, List<Object> vList) {
        if (outputs.size() > 0){
            StackedContainer container = factory.createStackedContainer();
            setContainerDefaults(frame, container);
            List<Object> outputList = container.getStyleOrStockOrFlow();
            for (Pane pane: outputs){
                pane.accept(this, outputList); // handler adds result (plot or print) to container.
            }
            vList.add(container);
        }
    }

    private void setContainerDefaults(XFrame frame, StackedContainer container) {
        container.setUid( nextUid ++);
        PaneDimensions dims = frame.getPaneDimensions();
        container.setX(new Double(dims.getX()));
        container.setY(new Double(dims.getY()));
        container.setWidth(new Double(dims.getWidth()));
        container.setHeight(new Double(dims.getHeight()));
    }

    public void marshall(GraphPane graphPane, List<Object> graphList) {
        Graph g = factory.createViewContentTypeGraph();
        setGraphDefaults(g);
        graphList.add(g);
        List<Plot> plotSet = g.getPlot();
        for (PlotLine line : graphPane.getLines()){
            Plot plot = factory.createPlot();
            plot.setIndex(line.getIndex());
            plot.setShowYAxis(true);
            Plot.Entity pEntity = new Plot.Entity();
            pEntity.setName(line.getName());
            plot.setEntity(pEntity );
            plotSet.add(plot);
        }
    }

    private void setGraphDefaults(Graph graph) {
        graph.setBackground("yellow");
        graph.setShowGrid(true);
        graph.setPlotNumbers(true);
        graph.setLeftAxisMultiScale(false);

    }

    public void marshall(TablePane tablePane, List<Object> tableList) {
        Table t = factory.createViewContentTypeTable();
        String interval = lastFrame.getViewParams().getPrintInterval();
        setTableDefaults(t, interval);
        tableList.add(t);
        List<Table.Item> columnSet = t.getItem();

        for (Column spec: tablePane.getColumns()){
            Table.Item item = factory.createViewContentTypeTableItem();
            item.setIndex(spec.getIndex());
            Entity e = factory.createViewContentTypeTableItemEntity();
            e.setName(spec.getName());
            item.setEntity(e);
            columnSet.add(item);
        }
    }

    private void setTableDefaults(Table t, String interval) {
        //TODO: parameterize column width
        t.setColumnWidth(50);
        t.setReportInterval(interval);

    }

    private void marshallConnectors(View view, XFrame frame) {
        List<Object> rval = new ArrayList<Object>();
        for (Symbol symbol: frame.getDefinedVars()){
            List<Object> elements = marshallConnectors(symbol);
            rval.addAll(elements);
        }
        view.getStyleOrStockOrFlow().addAll(rval);
    }

    static int nextUid = 1;

    private List<Object> marshallConnectors(Symbol symbol) {
        List<Object> conns = new ArrayList<Object>();
        for (String input: symbol.getDependencies()){
            ViewContentType.Connector conn = factory.createViewContentTypeConnector();
            conn.setUid(nextUid++);
            conn.setTo(symbol.getName());
            From from = factory.createViewContentTypeConnectorFrom();
            from.getContent().add(input);
            conn.setFrom(from);
            conns.add(conn);
        }
        return conns;
    }

    private View marshallViewVars(XFrame frame) {
        View view = factory.createViewsView();
        List<Object> elements = view.getStyleOrStockOrFlow();
        for (Symbol symbol: frame.getDefinedVars()){
            Object element = marshallViewVar(symbol);
            if (element != null) {
                elements.add(element);
            }
        }
        return view;
    }

    private Object marshallViewVar(Symbol symbol) {
        Object rval = null;
        switch (symbol.getVarType()) {
            case "AUX" :
                ViewContentType.Aux aux = factory.createViewContentTypeAux();
                aux.setName(symbol.getName());
                aux.setX(new Double(symbol.getPosition().getX()));
                aux.setY(new Double(symbol.getPosition().getY()));
                rval = aux;
                break;
            case "INIT" :
                // factory.createViewContentTypeAux();
                break;
            case "RATE" :
                ViewContentType.Flow flow = factory.createViewContentTypeFlow();
                flow.setName(symbol.getName());
                int x = symbol.getPosition().getX();
                int y = symbol.getPosition().getY();
                flow.setX(new Double(x));
                flow.setY(new Double(y));
                Pts list = factory.createViewContentTypeFlowPts();
                list.getPt().add(createPt(x-25,y));
                list.getPt().add(createPt(x+25,y));
                flow.setPts(list);
                rval = flow;
                break;
            case "LVL" :
                ViewContentType.Stock stock = factory.createViewContentTypeStock();
                stock.setName(symbol.getName());
                stock.setX(new Double(symbol.getPosition().getX()));
                stock.setY(new Double(symbol.getPosition().getY()));
                rval = stock;
                break;
            case "GF" :
                //factory.createViewContentTypeAux();
                break;
        }


        return rval;
    }

    private Pt createPt(int x, int y) {
        Pt rval = factory.createViewContentTypeFlowPtsPt();
        rval.setX(new Double(x));
        rval.setY(new Double(y));
        return rval;
    }

    private void marshallVariables(Variables vars, XFrame frame) {
        Collection<Symbol> symbols = frame.getDefinedVars();
        List<Object> varList = vars.getStockOrFlowOrAuxvar();
        //
        for (Symbol symbol: symbols){

            /* the following delegates (via visitor style pattern)
             * to the appropriate marshall method below.
             */
            Object varElement = symbol.dispatch(this, frame);
            if (varElement != null ){
                varList.add(varElement);
            }
        }
    }

    public Auxvar marshal(AuxSymbol auxSymbol, XFrame frame) {
        Auxvar aux = factory.createAuxvar();
        aux.setName(auxSymbol.getName());
        List<Object> eqn = aux.getEqnOrMathmlOrUnits();
        if (auxSymbol.getComment() != null){
            eqn.add(factory.createAuxvarDoc(auxSymbol.getComment()));
        }
        eqn.add(factory.createAuxvarElementEqn(auxSymbol.getEqn()));
        return aux;
    }

    public Auxvar marshal(AuxTabSymbol auxSymbol, XFrame frame) {
        Auxvar aux = marshal((AuxSymbol) auxSymbol, frame);
        //now add gf info

        List<Object> eqn = aux.getEqnOrMathmlOrUnits();
        Gf gfDef = factory.createGf();
        gfDef.setName(auxSymbol.getGf());
        gfDef.setType("continuous");

        PointsType yPts = factory.createPointsType();
        yPts.setValue(auxSymbol.getyValues());
        gfDef.setYpts(yPts);
        MinMaxType xscale = factory.createMinMaxType();
        gfDef.setXscale(xscale);
        if (auxSymbol.getxMin() != null)
            xscale.setMin(Double.valueOf(auxSymbol.getxMin()));
        if (auxSymbol.getxMax() != null)
            xscale.setMax(Double.valueOf(auxSymbol.getxMax()));
        eqn.add(gfDef);
        return aux;
    }


    public Gf marshall(GraphSymbol sym, XFrame frame) {
        Gf gfunc = factory.createGf();
        gfunc.setName(sym.getName());
        MinMaxType xscale = factory.createMinMaxType();
        gfunc.setXscale(xscale);
        if (sym.getXMin() != null)
            xscale.setMin(Double.valueOf(sym.getXMin()));
        if (sym.getXMax() != null)
            xscale.setMax(Double.valueOf(sym.getXMax()));
        if (sym.getYPts() != null) {
            PointsType yPts = factory.createPointsType();
            yPts.setValue(sym.getYPts());
            gfunc.setYpts(yPts);
        }
        return gfunc;
    }

    public Stock marshall(StockSymbol sym, XFrame frame) {
        Stock stock = factory.createStock();
        stock.setName(sym.getName());
        List<Object> elList = stock.getEqnOrMathmlOrUnits();
        if (sym.getComment() != null){
            elList.add(factory.createStockDoc(sym.getComment()));
        }

        for (String flow: sym.getInFlows()){
            elList.add(factory.createStockInflow(flow));
        }
        for (String flow: sym.getOutFlows()){
            elList.add(factory.createStockOutflow(flow));
        }
        elList.add(factory.createStockElementEqn(sym.getEqn()));
        return stock;
    }

    public Object marshall(InitSymbol initSymbol, XFrame frame) {
        // TODO Auto-generated method stub
        return null;
    }

    public Object marshall(RateSymbol rate, XFrame frame) {
        Flow flow = factory.createFlow();
        flow.setName(rate.getName());
        List<Object> eqn = flow.getEqnOrMathmlOrUnits();
        if (rate.getComment() != null){
            eqn.add(factory.createFlowDoc(rate.getComment()));
        }
        eqn.add(factory.createAuxvarElementEqn(rate.getEqn()));
        return flow;
    };

    public String marshallDocument(){
        return helper.marshal(document);
    }

    public Xmile getDocument() {
        return document;
    }

    public Object getCurrentFrame() {
        // TODO Auto-generated method stub
        return null;
    }



}
