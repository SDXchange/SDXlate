package examples;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.Test;

public class TestDynamoGrammar {

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
//	        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
//	        DynWalk walker = new DynWalk(nodes);
//	        walker.prog();

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

    @Test
    public void testDyn2XmileMapping() throws IOException, RecognitionException{
        CommonTree t = getAst("/test1.dyn");
        System.out.println(t.toStringTree());
        Dyn2XmileMapper mapper = new Dyn2XmileMapper(t);
        String xml = mapper.map();
        System.out.println("\nAFTER MAPPING:\n"+xml);

    }

    @Test
    public void testPugh_96() throws IOException, RecognitionException{
        CommonTree t = getAst("/pugh_p96.dyn");
        System.out.println(t.toStringTree());
        Dyn2XmileMapper mapper = new Dyn2XmileMapper(t);
        String xml = mapper.map();
        System.out.println("\nAFTER MAPPING:\n"+xml);

    }

    @Test
    public void testPugh_96Connections() throws IOException, RecognitionException{
        translateFile("/pugh_p96.dyn");
    }

    @Test
    public void testPugh_211Connections() throws IOException, RecognitionException{
        translateFile("/pugh_p211.dyn");
    }

    private void translateFile(String resource) throws IOException, RecognitionException{
        CommonTree t = getAst(resource);
        System.out.println(t.toStringTree());
        SymbolVisitor visitor = new SymbolVisitor(t);
        Map<String, Symbol> symtab= visitor.visit();
        Dyn2XmileMapper mapper = new Dyn2XmileMapper(t, symtab);
        String xml = mapper.map();
        System.out.println("\nSymbolTable:\n"+visitor.dumpTable());
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
