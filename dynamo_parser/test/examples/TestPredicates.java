package examples;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.Test;

public class TestPredicates {


    @Test
    public void testPredicate() throws RecognitionException, IOException {
        String data = "MEMO comment # * ! stuff \n"
                + "C NAME=3\n"
                + "P V=7 with comment\n"
                + "P P=9 with comment \n"
                + "MEMO MEMO MEMO \n"
                + "P V=7 \n"
                + "P V=7 V=7 = *\n";
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        ANTLRInputStream input = new ANTLRInputStream(testInput);
        PredLexer lexer = new PredLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PredParser parser = new PredParser(tokens);
        parser.prog();
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

}
