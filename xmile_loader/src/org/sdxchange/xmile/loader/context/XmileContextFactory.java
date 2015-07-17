package org.sdxchange.xmile.loader.context;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.xpath.XPath;
import org.oasis.xmile.v1_0.Auxvar;
import org.oasis.xmile.v1_0.Flow;
import org.oasis.xmile.v1_0.Gf;
import org.oasis.xmile.v1_0.Model;
import org.oasis.xmile.v1_0.SimSpecs;
import org.oasis.xmile.v1_0.Stock;
import org.oasis.xmile.v1_0.Variables;
import org.oasis.xmile.v1_0.ViewContentType.Connector;
import org.oasis.xmile.v1_0.ViewContentType.Graph;
import org.oasis.xmile.v1_0.ViewContentType.Table;
import org.sdxchange.xmile.devkit.policy.TargetPolicy;
import org.sdxchange.xmile.devkit.xframe.IXFrame;
import org.sdxchange.xmile.loader.parse.ParseUtil;
import org.sdxchange.xmile.parser4.XmileParser.ExprContext;

/**
 * We use a factory to create context objects because it centralizes injection of policy
 * and other globally required information as well as making it relatively easy to
 * embed certain symbol-recognition time decompositions and mappings. The factory is a singleton
 * object.
 *
 * @author rward
 *
 */
public class XmileContextFactory {
    private static XmileContextFactory instance = null;
    private IXFrame frame;
    private TargetPolicy policy;

    public static synchronized XmileContextFactory getInstance(IXFrame frame, TargetPolicy policy){
        if (instance == null){
            instance = new XmileContextFactory(frame, policy);
        }
        return instance;
    }

    public static synchronized XmileContextFactory getInstance(){
        if (instance == null){
            throw new IllegalStateException("XmileContextFactory has not been initialized");
        }
        return instance;
    }

    private XmileContextFactory(IXFrame frame, TargetPolicy policy){
        this.frame = frame;
        this.policy = policy;
    }

    public AuxvarContext createAuxvarContext(Auxvar auxVar){
        AuxvarContext ctx = new AuxvarContext(auxVar);
        ctx.setTargetPolicy(policy);
        return ctx;
    }

    public FlowContext createFlowContext(Flow var){
        FlowContext ctx = new FlowContext(var);
        ctx.setTargetPolicy(policy);
        return ctx;
    }

    public StockContext createStockContext(Stock var){
        StockContext ctx = new StockContext(var);
        ctx.setTargetPolicy(policy);
        return ctx;
    }

    public GfContext createGfContext(Gf var){
        GfContext ctx = new GfContext(var);
        ctx.setTargetPolicy(policy);
        return ctx;
    }

    public ModelCtx createModelContext(Model var){
        ModelCtx ctx = new ModelCtx(var);
//        ctx.setTargetPolicy(policy);
        return ctx;
    }

    public VarsContext createVarsContext(Variables var){
        VarsContext ctx = new VarsContext(var);
//        ctx.setTargetPolicy(policy);
        return ctx;
    }

    //NOTE: this can be disambiguated by type if needed.
    public VarViewContext createVarViewContext(Object viewObj) {
        VarViewContext ctx = new VarViewContext(viewObj);
//      ctx.setTargetPolicy(policy);
        return ctx;
    }

    public SimSpecsContext createSimSpectContext(SimSpecs node) {
        SimSpecsContext ctx = new SimSpecsContext(node);
        return ctx;
    }

    public IXFrame getFrame(){
        return frame;
    }

    public ExprContext createExprContext(String eqn) {
        return ParseUtil.createExprParseTree(policy, eqn);
    }

    public static Set<String> getInputVars(ParseTree eqn) {
        System.out.println("Collecting inputs from: "+eqn.toStringTree(ParseUtil.refParser));
        Set<String> rval = new HashSet<String>();
        Collection<ParseTree> vars = XPath.findAll(eqn, "//expr/ID", ParseUtil.refParser);
        for(ParseTree var: vars){
            rval.add(var.getText().trim());
        }
        return rval;
    }

    public ConnectorContext createConnectorContext(Connector conn) {
        int fCount = conn.getFrom().getContent().size();
        String from = (fCount == 1)? conn.getFrom().getContent().get(0).toString(): "";
        ConnectorContext rval = new ConnectorContext(""+conn.getUid(), from, conn.getTo() );
        System.out.println("Connector: "+rval.dump());
        return rval;
    }

    public static int titleCount = 1;
    public TableOutContext createTableOutContext(Table table) {
        TableOutContext ctx = new TableOutContext(table);
        String title = null;
        if ((title = ctx.getTitle()) == null || title.isEmpty()){
            ctx.setTitle("Default Out "+(titleCount++));
        }
        return ctx;
    }

    public GraphOutContext createGraphOutContext(Graph graph) {
        GraphOutContext ctx = new GraphOutContext(graph);
        String title = null;
        if ((title = ctx.getTitle()) == null || title.isEmpty()){
            ctx.setTitle("Default Out "+(titleCount++));
        }
        return ctx;
    }



}
