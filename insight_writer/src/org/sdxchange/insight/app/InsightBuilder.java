package org.sdxchange.insight.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.sdxchange.xmile.devkit.symbol.GraphOutPane;
import org.sdxchange.xmile.devkit.symbol.StockSymbol;
import org.sdxchange.xmile.devkit.symbol.XSymbol;
import org.sdxchange.xmile.devkit.xframe.IXFrame;
import org.sdxchange.xmile.devkit.xframe.Pane;
import org.sdxchange.xmile.devkit.xframe.TableOutPane;


public class InsightBuilder {

    InsightGraph outModel;
    IXFrame frame;
    Map<String, Integer> uidIndex = new HashMap<String, Integer>();
    Map<String, ImNode> nodeIndex = new HashMap<String, ImNode>();

    public InsightBuilder(IXFrame frame) {
        this.frame = frame;
    }

    public InsightGraph genGraph(){
        outModel = new InsightGraph(frame.getSimulationName());
        applySettings();
        assignUids();
        createDisplayNodes();
        createDefinedVarNodes();
        adjustFlowDimensions();
        createLinkNodes();
        return outModel;
    }

    private void createDisplayNodes() {

        System.out.println ("Frame is "+frame);
        System.out.println ("  pane list is "+ frame.getGraphOutputs());
        for (Pane item: frame.getGraphOutputs()){
            GraphOutPane graph = (GraphOutPane) item;

            DisplayNode imGraph = new DisplayNode(graph.getTitle(), "Time Series",
                    outModel.currentFolder.id, uidIndex.get(graph.getTitle()).intValue());
            imGraph.setEntities(lookupIds(graph.getEntityNames()));
            outModel.addNode(imGraph);
        }

        for (Pane item: frame.getTableOutputs()){
            TableOutPane table = (TableOutPane) item;

            DisplayNode imTable = new DisplayNode(table.getTitle(), "Tabular",
                    outModel.currentFolder.id, uidIndex.get(table.getTitle()).intValue());
            imTable.setEntities(lookupIds(table.getEntityNames()));
            outModel.addNode(imTable);
        }

    }

    private String lookupIds(Set<String> names){
        String rval = "";
        String temp = null;
        for (String name: names){
            Integer id = uidIndex.get(name);
            if (id == null){
                System.err.println("Failed to find uid for "+name);
            }
            else {
                rval += ((rval.isEmpty())? ""+id: ","+id);
            }
        }
        return rval;
    }

    private void adjustFlowDimensions() {
        for (XSymbol sym: frame.getDefinedVars()){
            if (sym.getVarType().contentEquals("LVL")){
                StockSymbol stock = (StockSymbol) sym;
                for (String inFlow: stock.getInFlows()){
                    FlowNode flow = (FlowNode) nodeIndex.get(inFlow);
                    flow.setTarget(uidIndex.get(stock.getName()).intValue());
                    //compute stock center
                    int x = stock.getPosition().getX()+50;
                    int y = stock.getPosition().getY()+20;
                    System.err.println("Center at "+x+", "+y);
                    flow.setTargetY(y);
                    flow.setTargetX(x);
                    flow.setSourceY(y+100);
                    flow.setSourceX(x-100);

                }
                for (String outFlow: stock.getOutFlows()){
                    FlowNode flow = (FlowNode) nodeIndex.get(outFlow);
                    flow.setSource(uidIndex.get(stock.getName()).intValue());
                    flow.setSourceX(stock.getPosition().getX()+50);
                    flow.setTargetX(flow.getSourceX());

                }
            }
        }

    }

    private void createLinkNodes() {
        for (XSymbol sym: frame.getDefinedVars()){

            for (String source: sym.getDependencies()){
                int linkId = outModel.nextNodeId++;
                LinkNode link = new LinkNode("LINK"+linkId, outModel.currentFolder.id, linkId);
                uidIndex.put(link.getName(),linkId);
                link.source = uidIndex.get(source);
                link.target = uidIndex.get(sym.getName());
                outModel.addNode(link);
            }


        }
    }

    private void assignUids() {
        for (Pane item: frame.getGraphOutputs()){
            uidIndex.put(item.getTitle(), new Integer(outModel.nextNodeId++));
        }
        for (Pane item: frame.getTableOutputs()){
            uidIndex.put(item.getTitle(), new Integer(outModel.nextNodeId++));
        }

        for (XSymbol sym: frame.getDefinedVars()){
            uidIndex.put(sym.getName(),new Integer(outModel.nextNodeId++));
        }
    }

    private void createDefinedVarNodes(){
        for (XSymbol sym: frame.getDefinedVars()){
//            String varType = sym.getVarType();

            switch (sym.getVarType()){
                case "AUX": {
                    String name = sym.getName();
                    if (sym.hasNestedTable()) {
                        ConvNode item = new ConvNode(name, outModel.currentFolder.id, uidIndex.get(name) );
                        nodeIndex.put(name, item);
                        item.setEqn(sym.getEqn());
                        item.setSource(uidIndex.get(sym.getEqn()));
                        item.setTableInfo(sym.getNestedTable());
                        item.setTableType(sym.getNestedTable().getTableType());

                        item.setPosition(sym.getPosition().getX(), sym.getPosition().getY());
                        outModel.addNode(item);
                    }
                    else {
                        AuxNode item = new AuxNode(name, outModel.currentFolder.id, uidIndex.get(name) );
                        nodeIndex.put(name, item);
                        item.setEqn(normalizeIDs(sym.getEqn()));
                        item.setPosition(sym.getPosition().getX(), sym.getPosition().getY());
                        outModel.addNode(item);
                    }
                }
                break;
                case "TAUX": {
                    String name = sym.getName();
                    ConvNode item = new ConvNode(name, outModel.currentFolder.id, uidIndex.get(name) );
                    nodeIndex.put(name, item);
                    item.setSource(uidIndex.get(sym.getEqn()));
                    item.setTableInfo(sym.getNestedTable());
                    item.setEqn(normalizeIDs(sym.getEqn()));
                    item.setPosition(sym.getPosition().getX(), sym.getPosition().getY());
                    outModel.addNode(item);
                }
                break;
                case "RATE": {
                    String name = sym.getName();
                    FlowNode item = new FlowNode(name, outModel.currentFolder.id, uidIndex.get(name) );
                    nodeIndex.put(name, item);
                    item.setEqn(normalizeIDs(sym.getEqn()));
                    item.setPosition(sym.getPosition().getX(), sym.getPosition().getY());
                    outModel.addNode(item);
                }
                break;
                case "LVL": {
                    String name = sym.getName();
                    StockNode item = new StockNode(name, outModel.currentFolder.id, uidIndex.get(name) );
                    nodeIndex.put(name, item);
                    item.setEqn(normalizeIDs(sym.getEqn()));
                    item.setPosition(sym.getPosition().getX(), sym.getPosition().getY());
                    outModel.addNode(item);
                }
                break;

                default:
            }
        }
    }


    /**
     * Process equations so that all Variables are bracketed as expected by InsightMaker.
     * This is pretty simple-minded, but is worth a try. If it doesn't work, we'll need to
     * capture a pointer to the equation in the symbol table entry so that we can visit the
     * equation tree to accomplish this.
     *
     * @param eqn
     * @return
     */

    public static String normalizeIDs(String eqn) {
        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z_0-9]+"); //for now we know it's a Dynamo ID
        Matcher m = p.matcher(eqn);
        StringBuffer rval = new StringBuffer(eqn.length()*2+2); //max it can grow, assume one char ids with 1 char op between.
        while (m.find()){
//            System.err.println("group(0) "+m.group(0));
            m.appendReplacement(rval, Matcher.quoteReplacement("["+m.group(0)+"]"));
        }
        m.appendTail(rval);
//        System.err.println(rval);
        return rval.toString();
    }

    private void applySettings() {
        SettingsNode node = new SettingsNode();
        node.setStart(frame.getSimSpec().getStart());
        node.setStop(frame.getSimSpec().getStop());
        node.setDt(frame.getSimSpec().getDt());

        outModel.settings = node;
    }

}
