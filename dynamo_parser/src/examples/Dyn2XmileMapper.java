package examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.oasis.xmile.v1_0.Auxvar;
import org.oasis.xmile.v1_0.Flow;
import org.oasis.xmile.v1_0.Gf;
import org.oasis.xmile.v1_0.Macro;
import org.oasis.xmile.v1_0.MinMaxType;
import org.oasis.xmile.v1_0.Model;
import org.oasis.xmile.v1_0.ObjectFactory;
import org.oasis.xmile.v1_0.Plot;
import org.oasis.xmile.v1_0.Plot.Entity;
import org.oasis.xmile.v1_0.PointsType;
import org.oasis.xmile.v1_0.SimSpecs;
import org.oasis.xmile.v1_0.SimSpecs.Dt;
import org.oasis.xmile.v1_0.StackedContainer;
import org.oasis.xmile.v1_0.Stock;
import org.oasis.xmile.v1_0.Variables;
import org.oasis.xmile.v1_0.ViewContentType;
import org.oasis.xmile.v1_0.ViewContentType.Graph;
import org.oasis.xmile.v1_0.Views;
import org.oasis.xmile.v1_0.Views.View;
import org.oasis.xmile.v1_0.Xmile;

import edu.iastate.xmile.XmlHelper;
import examples.Symbol.Type;

public class Dyn2XmileMapper {

    CommonTree root;
    Xmile document;
    Map<String, Symbol> symtab = null;
    //key is module.var, value is equation as string.
    Map<String, String> initialValues = new HashMap<String, String>();
    Map<String, Gf> ycoords = new HashMap<String, Gf>();
    Map<String, CommonTree> xcoords = new HashMap<String, CommonTree>();
    SimSpecs globalSimSpecs = null;
    XmlHelper<Xmile> helper = new XmlHelper<Xmile>();
    ObjectFactory factory = new ObjectFactory();
    int indent = 0;
    int uid = 0;
    Queue<Model> modelContext = new LinkedList<Model>();
    Macro currentMacro = null;
    Variables currentVarContext = null;
    private Model mostRecentModel;
    private View mostRecentView = null;

    public Dyn2XmileMapper(CommonTree t) {
        root = t;
        document = factory.createXmile();
    }

    public Dyn2XmileMapper(CommonTree t, Map<String, Symbol> symtab) {
        this(t);
        this.symtab = symtab;
    }

    public String map() {
        visit(root);// TODO Auto-generated method stub
//		System.out.println("Ivalue Table:\n"+initialValues.toString());
        return helper.marshal(document);
    }


    private void visit(CommonTree node) {
//		printNodeName(node);
        switch (node.token.getType())
        {
            case DynbareParser.DOCUMENT :
                visitChildren(node);
                break;
            case DynbareParser.CONTROL :
                extractSimParams(node);
                break;
            case DynbareParser.MODEL :
                visitChildren(node);
                break;
            case DynbareParser.MODULE :
            {
                Model model = factory.createModel();
                modelContext.add(model);
                mostRecentModel = model;
                model.setName(node.getChild(0).getText());
                visitChildren(node);
                model = modelContext.remove();
                mostRecentModel = (modelContext.peek() == null)? mostRecentModel: modelContext.peek();
                List<Object> modules = document.getSimSpecsOrModelUnitsOrBehavior();
                modules.add(model);
                insertStockIvalueEqns();
                //TODO: if default and TIME in initialvalues, use it to set simulation start.
                updateSimStart();
                initialValues.clear();
                fixupTables();
                xcoords.clear();
                ycoords.clear();
            }
            break;
            case DynbareParser.MACRO :
                currentMacro=factory.createMacro();
                document.getSimSpecsOrModelUnitsOrBehavior().add(currentMacro);
                populateMacro(node);
                insertStockIvalueEqns();
                //TODO: if default and TIME in initialvalues, use it to set simulation start.
                initialValues.clear();
                currentMacro=null;
                xcoords.clear();
                ycoords.clear();
                break;
            case DynbareParser.VIEW:
            {
                Views views = mostRecentModel.getViews();
                if (views == null){
                    views = factory.createViews();
                    mostRecentModel.setViews(views);
                }
                View view = mostRecentView;
                if (view == null){
                    view = factory.createViewsView();
                    mostRecentView = view;
                    views.getStyleOrView().add(view);
                }
                mapOutputs(  view, node) ;
            }
            break;
            case DynbareParser.VARIABLES :
            {
                if (node.parent.token.getType() == DynbareParser.MACRO){
                    currentVarContext = factory.createVariables();
                    currentMacro.getParmOrEqnOrFormat().add(currentVarContext);
                    visitChildren(node);
                    //TODO: deal with module namespace in symtab.
                }
                if (node.parent.token.getType() == DynbareParser.MODULE){
                    Model model = modelContext.peek();
                    Variables vars = factory.createVariables();
                    currentVarContext = vars;
                    model.setVariables(vars);
                    visitChildren(node);
                    //TODO: factor out this view stuff
                    Views views = model.getViews();
                    if (views == null){
                        views = factory.createViews();
                        model.setViews(views);
                    }
                    View view = mostRecentView;
                    if (view == null){
                        view = factory.createViewsView();
                        mostRecentView = view;
                        views.getStyleOrView().add(view);
                    }
                    mapConnectors( symtab, view) ;
                }
            }
            break;
            case DynbareParser.TAUX :
            {
                currentVarContext.getStockOrFlowOrAuxvar().add(createTableAux(node));
            }
            break;
            case DynbareParser.YCOORDS :
            {
                currentVarContext.getStockOrFlowOrAuxvar().add(createPartialGF(node));
            }
            break;
            case DynbareParser.AUX :
            {
                currentVarContext.getStockOrFlowOrAuxvar().add(createAux(node));
            }
            break;
            case DynbareParser.RATE :
            {
                currentVarContext.getStockOrFlowOrAuxvar().add(createFlow(node));
            }
            break;
            case DynbareParser.LEVEL :
            {
                currentVarContext.getStockOrFlowOrAuxvar().add(createStock(node));
            }
            break;
            case DynbareParser.IVALUE :
            {
                Model model = modelContext.peek();
                String varName = node.getChild(0).getText();
                Symbol symEntry = null;
                if (symtab != null){
                    symEntry = symtab.get(varName);
                }
                String symType = (symEntry == null) ? "null symEntry": symEntry.getType().name();
                System.err.println("Ivalue "+varName+" is of type "+symType);
                if (symEntry != null && symEntry.getType() == Type.stock){
                    captureIValueEqn(model.getName(), node);
                }
                else {
                    currentVarContext.getStockOrFlowOrAuxvar().add(createInitAux(node));
                }
            }
            break;

            case DynbareParser.FORMAL_PARAMS :
            {
                addMacroParams(node);
            }
            break;
            case DynbareParser.ID :
//			System.out.println(leftPad("ID: "+node.token.getText()));
                break;
            default:
        }
    }

    private void mapOutputs(  View view, CommonTree node)  {
        //node is root of AST VIEW
        List<Object> vList = view.getStyleOrStockOrFlow();
        StackedContainer container = factory.createStackedContainer();
        setContainerDefaults(container);
        List<Object> graphList = container.getStyleOrStockOrFlow();
        vList.add(container);
        for (Object objNode: node.getChildren()){
            //each child is root of a graph description (AST PLOT)
            CommonTree plotNode = (CommonTree) objNode;
            Graph graph = factory.createViewContentTypeGraph();
            setGraphDefaults(graph);
            graphList.add(graph);
            List<Plot> plotList = graph.getPlot();
            int index = 1;
            for (Object obj2Node: plotNode.getChildren()){
                CommonTree vListNode = (CommonTree) obj2Node;
                //process plotted vars with shared scale (AST PLOTVLIST);
                List<Plot> plotSet = nodes2PlotList(vListNode, index);
                plotList.addAll(plotSet);
                index += plotSet.size();
            }
        }
    }
    private void setGraphDefaults(Graph graph) {
        graph.setBackground("yellow");
        graph.setShowGrid(true);
        graph.setPlotNumbers(true);
    }

    private List<Plot> nodes2PlotList(CommonTree vListRoot, int index) {
        List<Plot> rval = new ArrayList<Plot>();
        for (Object nodeObj: vListRoot.getChildren()){
            CommonTree plotVar = (CommonTree) nodeObj;
            Plot plot = factory.createPlot();
            plot.setIndex(index++);
            Entity pEntity = new Entity();
            pEntity.setName(plotVar.getChild(0).getText());
            plot.setEntity(pEntity );
            rval.add(plot);
        }
        return rval;
    }

    private void setContainerDefaults(StackedContainer container) {
        container.setUid(uid++);
    }

    private void setViewDefaults() {
        // TODO Auto-generated method stub

    }

    private void updateSimStart() {
        String start = initialValues.get("TIME");
        if (start != null){
            setSimStart(start);
        }
    }

    private void fixupTables() {
        Set<String> gfNames = ycoords.keySet();
        for (String gf : gfNames){
            Gf table = ycoords.get(gf);
            MinMaxType scale = table.getXscale();
            if (scale == null){
                scale = factory.createMinMaxType();
                table.setXscale(scale);
            }
            CommonTree xItem = xcoords.get(gf);
            populateMinMax(scale, xItem);
            table.setType(getExtrapolateName(xItem));
        }

    }

    private void mapConnectors( Map<String, Symbol> symtab, View view){

        List<Object> vList = view.getStyleOrStockOrFlow();
        for (String name: symtab.keySet()){
            Symbol sym = symtab.get(name);
            Type type = sym.getType();
            if (type != null && type != Type.fRef && type != Type.stock){
                for (String from: sym.getFrom()){
                    View.Connector conn = factory.createViewContentTypeConnector();
                    conn.setTo(name);
                    conn.setUid(uid++);
                    ViewContentType.Connector.From frm = factory.createViewContentTypeConnectorFrom();
                    frm.getContent().add(from);
                    conn.setFrom(frm);
                    if (type == Type.init ){
                        conn.setColor("#E8E8E8");
                    }
                    vList.add(conn);
                }
            }
        }
    }

    private String getExtrapolateName(CommonTree xItem) {
        String tableType = xItem.getChild(1).getText();
        if ("TABLE".contentEquals(tableType)){
            return "continuous";
        }
        if ("TABXT".contentEquals(tableType)){
            return "extrapolate";
        }
        if ("TABPL".contentEquals(tableType)) {
            return "continuous";
        }
        else {
            return "discrete";
        }
    }

    private void populateMinMax(MinMaxType scale, CommonTree xcoords) {
        scale.setMin(Double.valueOf(xcoords.getChild(2).getText()));
        scale.setMax(Double.valueOf(xcoords.getChild(3).getText()));
    }

    /**
     * create a standalone GF element with the y-coord information
     * from a dynamo T record. index it under the table name so that it can later be correlated
     * with the X-coord information from a related aux (or other?) record.
     *
     * @param node
     * @return
     */
    private Gf createPartialGF(CommonTree node) {
        Gf lookup = factory.createGf();
        String tableName = node.getChild(0).getText();
        lookup.setName(tableName);
        populateYpts(lookup, node);
        ycoords.put(tableName, lookup);
        return lookup;
    }

    private void populateYpts(Gf lookup, CommonTree node) {
        PointsType ypts = lookup.getYpts();
        if (ypts == null){
            ypts = factory.createPointsType();
            lookup.setYpts(ypts);
        }
        ypts.setValue(siblingText((CommonTree) node.getChild(1), 0));
    }

    private void addMacroParams(CommonTree node) {

        List<Object> elements = currentMacro.getParmOrEqnOrFormat();
        List<CommonTree>children = (List<CommonTree>) node.getChildren();
        for (CommonTree child: children){
            elements.add(factory.createMacroParm(child.getText()));
        }
    }

    private void populateMacro(CommonTree node) {
        currentMacro.setName(node.getChild(0).getText());
        visitChildren(node);
    }

    private void extractSimParams(CommonTree node) {
        //Add simspecs element -- lazy initialization
        if (globalSimSpecs == null) {
            globalSimSpecs = factory.createSimSpecs();
            //anchor it in the document model
            List<Object> topElements = document.getSimSpecsOrModelUnitsOrBehavior();
            topElements.add(0, globalSimSpecs);
        }
        //first child is params ... childrenof that are useful parameters.
        Tree params = node.getChild(0);
        if (params.getType() == DynbareParser.PARAMS){
            int count = params.getChildCount();
            for (int i =0; i < count; i++){
                String name = params.getChild(i).getChild(0).getText();
                String value = params.getChild(i).getChild(1).getText();
                if ("DT".contentEquals(name)){
                    setSimDT(value);
                }
                else if ("MAXLEN".contentEquals(name)
                        || "LENGTH".contentEquals(name)){
                    setSimStop(value);
                }
            }
        }
    }

    private void setSimStart(String value) {
        globalSimSpecs.setStart(Double.valueOf(value));

    }

    private void setSimStop(String value) {
//		System.out.println("Setting stop to "+value);
        globalSimSpecs.setStop(Double.valueOf(value));
    }

    private void setSimDT(String value) {
//		System.out.println("Setting dt to "+value);
        Dt dt = globalSimSpecs.getDt();
        if (dt == null){
            dt = factory.createSimSpecsDt();
            globalSimSpecs.setDt(dt);
        }
        dt.setValue(Double.valueOf(value));
    }

    private Stock createStock(CommonTree node) {
        Stock stock = factory.createStock();
        stock.setName(node.getChild(0).getText());
        //fix up initial value equation later.
//		System.out.println("In createStock: "+node.getChild(1).toStringTree());
        populateStockFlows((CommonTree) node.getChild(1), stock);
        return stock;
    }

    private void populateStockFlows(CommonTree node, Stock stock) {
        int count = node.getChildCount();
        String stkName = stock.getName();
        List<Object> elList = stock.getEqnOrMathmlOrUnits();
        while (--count > 0 ){ // work right to left through children
            CommonTree focus = (CommonTree) node.getChild(count);
            FlowType flow = getNodeFlowType(focus, stkName);
            switch(flow){
                case inFlow :
                    elList.add(factory.createStockInflow(focus.getText()));
                    break;
                case outFlow:
                    elList.add(factory.createStockOutflow(focus.getText()));
                    break;
            }
        }

    }

    private FlowType getNodeFlowType(CommonTree focus, String stkName) {
        if (focus.token.getType() != DynbareParser.ID){
            return FlowType.neither;
        }
        if ("DT".contentEquals(focus.token.getText())){
            return FlowType.neither;
        }
        if (stkName.contentEquals(focus.token.getText())){
            return FlowType.neither;
        }
        int index = focus.getChildIndex();
        Tree left = focus.parent.getChild(index - 1);
//		System.out.println ("for focus "+focus.getText()+", left is "+left.getText());
        if ("-".contentEquals(left.getText())){
            return FlowType.outFlow;
        }
        return FlowType.inFlow;
    }

    private void insertStockIvalueEqns() {
        //find variables
        List<Object> vars = currentVarContext.getStockOrFlowOrAuxvar();
        for (Object obj : vars){
            //loop through looking for stocks
            if (obj instanceof Stock){
                //use stock name to find equation and insert element.
                Stock var = (Stock) obj;
                String key = var.getName();
                String eqnText = initialValues.get(key);
                var.getEqnOrMathmlOrUnits().add(factory.createStockEqn(eqnText));
            }
        }
        //find any initialValues that are not associated with a stock
    }

    private void captureIValueEqn(String model, CommonTree node) {
        String key = node.getChild(0).getText();
        String value = getEqnText(node.getChild(1));
        initialValues.put(key, value);
    }

    private Auxvar createInitAux(CommonTree node) {
        Auxvar aux = factory.createAuxvar();
        aux.setName(node.getChild(0).getText());
        List<Object> eqn = aux.getEqnOrMathmlOrUnits();
        eqn.add(factory.createAuxvarElementEqn(getInitEqnText(node.getChild(1))));
        return aux;
    }

    private Auxvar createAux(CommonTree node) {
        Auxvar aux = factory.createAuxvar();
        aux.setName(node.getChild(0).getText());
        List<Object> eqn = aux.getEqnOrMathmlOrUnits();
        eqn.add(factory.createAuxvarElementEqn(getEqnText(node.getChild(1))));
        return aux;
    }

    private Object createTableAux(CommonTree node) {
        Auxvar aux = factory.createAuxvar();
        aux.setName(node.getChild(0).getText());
        List<Object> eqn = aux.getEqnOrMathmlOrUnits();
        eqn.add(factory.createAuxvarElementEqn(getEqnText(node.getChild(1))));
        Gf tableRef = factory.createGf();
        String tableName = node.getChild(2).getText();
        tableRef.setName(tableName);
        eqn.add(tableRef);
        xcoords.put(tableName, (CommonTree) node.getChild(3));
        return aux;
    }

    private Flow createFlow(CommonTree node) {
        Flow flow = factory.createFlow();
        flow.setName(node.getChild(0).getText());
        List<Object> eqn = flow.getEqnOrMathmlOrUnits();
        eqn.add(factory.createFlowElementEqn(getEqnText(node.getChild(1))));
        return flow;
    }

    private String getInitEqnText(Tree eqn) {
        int count = eqn.getChildCount();
        String rval = "";
        for (int i = 0; i < count; i++){
            Tree node = eqn.getChild(i);
            if (node.getType() == DynbareParser.ID ){
                rval+= "INIT("+node.getText()+")";
            }
            else {
                rval += eqn.getChild(i).getText();
            }
        }
        return rval;
    }

    private String getEqnText(Tree eqn) {
        int count = eqn.getChildCount();
        String rval = "";
        for (int i = 0; i < count; i++){
            rval += eqn.getChild(i).getText();
        }
        return rval;
    }

    private void printNodeName(CommonTree node){
        System.out.println(leftPad(node.token.getText()));
    }

    private void visitChildren(CommonTree node) {
        indent += 2;
        List<CommonTree> children = (List<CommonTree>) node.getChildren();
        for (CommonTree child: children){
            visit(child);
        }
        indent -= 2;
    }

    private static final String pad = "                                          "
            + "                                                                  "
            + "                                                                  "
            + "                                                                  ";

    private String leftPad(String message) {
        return pad.substring(0, indent)+message;
    }
    /**
     * @param parent
     * @param start
     * @return comma deliminted sequence of test from selected siblings.
     */
    private String siblingText(CommonTree parent, int start){
        return siblingText(parent, start, parent.getChildCount()-1);
    }

    private String siblingText(CommonTree parent, int start, int stop){
        String rval = "";
        for (int i = start; i <= stop; i++){
            rval += (i > start)? ',': "";
            rval += parent.getChild(i).getText();
        }
        return rval;
    }

}
