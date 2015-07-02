package examples;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Map;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.Ignore;
import org.junit.Test;
import org.oasis.xmile.v1_0.Xmile;
import org.sdxchange.dynamo.app.Dyn2Xmile;
import org.sdxchange.dynamo.app.Dyn2XmileMapper;
import org.sdxchange.dynamo.app.Symbol;
import org.sdxchange.dynamo.app.SymbolVisitor;

import edu.iastate.xmile.util.XmlHelper;

public class TestDynamoGrammar {

    private XmlHelper<Xmile> helper = new XmlHelper<Xmile>();

    @Test
    public void test() throws RecognitionException, IOException {
        String data = "C   MyVar=23\nR   MYRATE.KL=OLDRATE.KL*03\n";
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        ANTLRInputStream input = new ANTLRInputStream(testInput);
        DynbareLexer lexer = new DynbareLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DynbareParser parser = new DynbareParser(tokens);
        DynbareParser.prog_return r = parser.prog();
        // walk resulting tree
        CommonTree t = (CommonTree)r.getTree();
        System.out.println(t.toStringTree());
    }

    @Test
    public void testExponential() throws RecognitionException, IOException {
        String data = "C VAR=1E6\n"
                + "C V2=2e+6\n"
                + "C V3=3.1412e-2 with comment\n";
        parseString(data);
    }

    @Test
    public void testTabhl() throws RecognitionException, IOException {
        String data = "A    FREFTS.K=TABHL(TFEFS,TSKPRM.K/PJBSZ.K,0,.2,.04)\n";
        parseString(data);
    }

    @Test
    public void testInvalidFuncRef() throws RecognitionException, IOException {
        String data = "A    VAR.K=BADFUNC(X,Y,Z)\n";
        parseString(data);
    }

    @Test
    public void testUnaryOpArgs() throws RecognitionException, IOException {
        String data = "A  MDHDL.K=CLIP(MIN(MAXSHR.K,PMDSHR.K),0-EXSABS.K,PMDSHR.K,0)*CTRLSW\n"+
                "A  MDHDL.K=CLIP(MIN(MAXSHR.K,PMDSHR.K),0+-7,PMDSHR.K,0)*CTRLSW\n"+
                "A  MDHDL.K=CLIP(MIN(MAXSHR.K,PMDSHR.K),-EXSABS.K,PMDSHR.K,0)*CTRLSW\n";
        parseString(data);
    }

    @Test
    public void testCSG() throws RecognitionException, IOException {
        String data = "NOTE xx\n"
                + "NOTE\n"
                + "NOTE \n"
                + "NOTE ***##yellow cat\n"
                + "NOTE ##yellow % stuff \n"
                + "C   MyVar=23\nR   MYRATE.KL=OLDRATE.KL*03\n";
        parseString(data);
    }

    @Test
    public void testStockInit() throws RecognitionException, IOException {
        String data = ""
                + "C   TSTMD=10\n"
                + "A   DEVMD.K=TSTMD.K\n"
                + "A   IRTSDT.K=2*TSTMD\n"
                + "L   TSSZMD.K=TSSZMD.J+DT*IRTSDT.JK+ARTJBM.K*CLIP(1,0,FREFTS.J,.9)\n"
                + "N   TSSZMD=TSTMD\n"
                + "R   IRTSDT.KL=(RTINCT.JK/PRTPRD.K)*(FADHWO.K)\n"
                + "A    FCOMP.K=CRPRG.K/IPD\n"
                + "NOTE RATE OF INCREASE IN TESTING MANDA YS DUE TO DISCOVERED TASKS (MD/D)\n"
                + "L   JBSZMD.K=JBSZMD.J+DT*(IRDVDT.JK+IRTSDT.JK+ARTJBM.JK)\n"
                + "NOTE TOTAL JOB SIZE IN MANDAY A (MAN-DAYS)\n"
                + "N   JBSZMD=DEVMD+TSTMD\n"
                + "R   ARTJBM.KL=(MDRPTN.K+CUMMD.K-JBSZMD.K)/DAJBMD.K\n"
                + "NOTE*C [SECTOR=CONTROL] control sector\n"
                + "SPEC  DT=.5,MAXLEN=1000,PLTPER=10,PRTPER=0\n\n";
        CommonTree ast = parseString(data);
        testMapping(ast);
    }

    private CommonTree parseString(String data) throws IOException, RecognitionException{
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        ANTLRInputStream input = new ANTLRInputStream(testInput);
        DynbareLexer lexer = new DynbareLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DynbareParser parser = new DynbareParser(tokens);
        DynbareParser.prog_return r = parser.prog();
        // walk resulting tree
        CommonTree t = (CommonTree)r.getTree();
        System.out.println(t.toStringTree());
        return t;
    }


    @Test
    public void testFileInput() throws RecognitionException, IOException {
        InputStream testInput = getFileInput("/test1.dyn");
        ANTLRInputStream input = new ANTLRInputStream(testInput);
        DynbareLexer lexer = new DynbareLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DynbareParser parser = new DynbareParser(tokens);
        DynbareParser.prog_return r = parser.prog();
        // walk resulting tree
        CommonTree t = (CommonTree)r.getTree();
        System.out.println(t.toStringTree());
//	        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
//	        DynWalk walker = new DynWalk(nodes);
//	        walker.prog();

    }

    @Ignore
    @Test
    public void testDyn2XmileMapping() throws IOException, RecognitionException{
        CommonTree t = getAst("/test1.dyn");
        System.out.println(t.toStringTree());
        Dyn2XmileMapper mapper = new Dyn2XmileMapper(t);
        String xml = mapper.map();
        System.out.println("\nAFTER MAPPING:\n"+xml);

    }

    private void testMapping(CommonTree t){
        PrintWriter symOut = (new PrintWriter(System.err));
        SymbolVisitor visitor = new SymbolVisitor(t);
        Map<String, Symbol> symtab= visitor.visit();
        Dyn2XmileMapper mapper = new Dyn2XmileMapper(t, symtab);
        Xmile document = mapper.map2Document(); //Should probably return Document! and marshall separately
        symOut.println("\nSymbolTable:\n"+visitor.dumpTable());
        symOut.println("\n\nUndefined Symbols:\n"+visitor.dumpRefErrors());
        String xml = helper.marshal(document);
        System.out.println(xml);
    }

    @Ignore
    public void testPugh_96() throws IOException, RecognitionException{
        CommonTree t = getAst("/pugh_p96.dyn");
        System.out.println(t.toStringTree());
        Dyn2XmileMapper mapper = new Dyn2XmileMapper(t);
        String xml = mapper.map();
        System.out.println("\nAFTER MAPPING:\n"+xml);

    }

    public void main() {
        String[] args = {"/src/pugh_p96.dyn" };
        Dyn2Xmile.main(args);
    }

    @Test
    public void testPugh_96Connections() throws IOException, RecognitionException{
        translateFile("/pugh_p96.dyn");
    }

    @Test
    public void testPugh_211Connections() throws IOException, RecognitionException{
        translateFile("/pugh_p211.dyn");
    }

    @Test
    public void abdelHamid() throws IOException, RecognitionException{
        translateFile("/abdel-hamid.dyn");
    }



    private void translateFile(String resource) throws IOException, RecognitionException{
        CommonTree t = getAst(resource);
        System.out.println(t.toStringTree());
        SymbolVisitor visitor = new SymbolVisitor(t);
        Map<String, Symbol> symtab= visitor.visit();
        Dyn2XmileMapper mapper = new Dyn2XmileMapper(t, symtab);
        String xml = mapper.map();
        System.out.println("\nSymbolTable:\n"+visitor.dumpTable());
        System.out.println("\n\nUndefined  Symbols:\n"+visitor.dumpRefErrors());
        System.out.println(xml);

    }

    private CommonTree getAst(String resource) throws IOException, RecognitionException {
        InputStream testInput = getFileInput(resource);
        ANTLRInputStream input = new ANTLRInputStream(testInput);
        DynbareLexer lexer = new DynbareLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DynbareParser parser = new DynbareParser(tokens);
        DynbareParser.prog_return r = parser.prog();
        // walk resulting tree
        CommonTree t = (CommonTree)r.getTree();
        return t;
    }



    @Test
    public void testEval() throws RecognitionException, IOException {
        String data = "x=1\ny=2\n3*(x+y)\n";
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        ANTLRInputStream input = new ANTLRInputStream(testInput);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ExprParser.prog_return r = parser.prog();

        // walk resulting tree
        CommonTree t = r.getTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        Eval walker = new Eval(nodes);
        walker.prog();
    }

    private InputStream getFileInput(String resourceName) throws FileNotFoundException {
        URL url = this.getClass().getResource(resourceName);
        String resourcePath = url.getFile();
        System.out.println(resourcePath);
        FileInputStream rval = new FileInputStream(resourcePath);
        return rval;
    }

}
