package org.sdxchange.dynamo.parser4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.antlr.runtime.RecognitionException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.Trees;
import org.junit.Test;
import org.sdxchange.dynamo.parser4.DynamoParser.TContext;

public class TestV4Parser {

    @Test
    public void testPredicates() throws IOException {
        String data = "NOTE comment  *  stuff \n"
                + "C NAME=3\n"
                + "A V=7 with comment\n"
                ;
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        String result = parseStream(testInput);
        System.out.println(result);
        assertTrue(result.contains("auxDef"));
        assertTrue(result.contains("constDef"));
        assertTrue(result.contains("(eqn V = (expr (numLit 7)))"));
    }

    @Test
    public void testFloat()throws RecognitionException, IOException {
        String data = "C VAR=1E6\n"
                + "C V2=2e+6\n"
                + "C V3=3.1412e-2 with comment\n";
        String result = parseString(data);
        System.out.println(result);
        assertTrue(result.contains("constDef"));
        assertTrue(result.contains("(expr (numLit 1E6)"));
        assertTrue(result.contains("(numLit 2e+6)"));
        assertTrue(result.contains("(numLit 3.1412e-2)"));
    }

    @Test
    public void testPugh96() throws RecognitionException, IOException {
        String expected = ""
                + "(t (starCard * \\t (comment SIMPLE   EPIDEMIC   MODEL)) \\r\\n "
                + "(card (commentCard NOTE   )) \\r\\n "
                + "(card (stockDef L \\t (eqn SUSC (timeScript . K) = (expr (expr SUSC (timeScript . J)) + (expr (expr (funcRef DT)) * (expr ( (expr - (expr INF (timeScript . JK))) ))))))) \\r\\n "
                + "(card (initDef N \\t (eqn SUSC = (expr (numLit 988))))) \\r\\n "
                + "(card (commentCard NOTE \\t\\t (comment SUSCEPTIBLE   POPULATION    ( PEOPLE )  ))) \\r\\n "
                + "(card (rateDef R \\t (eqn INF (timeScript . KL) = (expr (expr (expr SICK (timeScript . K)) * (expr CNTCTS (timeScript . K))) * (expr FRSICK)))  )) \\r\\n "
                + "(card (commentCard NOTE \\t (comment INFECTION   RATE \\t ( PEOPLE   PER   DAY )))) \\r\\n "
                + "(card (constDef C \\t (eqn FRSICK = (expr (numLit 0.05)))   )) \\r\\n "
                + "(card (commentCard NOTE \\t (comment FRACTION   OF   CONTACTS   BECOMING   SICK))) \\r\\n "
                + "(card (commentCard NOTE \\t (comment ( DIMENSIONLESS )))) \\r\\n (card (stockDef L \\t (eqn SICK (timeScript . K) = (expr (expr SICK (timeScript . J)) + (expr (expr (funcRef DT)) * (expr ( (expr (expr INF (timeScript . JK)) - (expr CURE (timeScript . JK))) ))))))) \\r\\n "
                + "(card (initDef N \\t (eqn SICK = (expr (numLit 2))))) \\r\\n "
                + "(card (commentCard NOTE \\t (comment SICK   POPULATION \\t ( PEOPLE )))) \\r\\n "
                + "(card (auxDef A \\t (eqn CNTCTS (timeScript . K) = (expr (funcRef TABLE ( (exprList (expr TABCON) , (expr (expr SUSC (timeScript . K)) / (expr TOTAL (timeScript . K))) , (expr (numLit 0)) , (expr (numLit 1)) , (expr (numLit 0.2))) )))))) \\r\\n "
                + "(card (commentCard NOTE \\t (comment SUSCEPTIBLES   CONTACTED   PER   INFECTED   PERSON))) \\r\\n "
                + "(card (commentCard NOTE \\t (comment PER   DAY    ( PEOPLE   PER     PERSON   PER   DAY )))) \\r\\n "
                + "(card (tableDef T \\t TABCON = (yValues (numLit 0) (separator /) (numLit 2.8) (separator /) (numLit 5.5) (separator /) (numLit 8) (separator /) (numLit 9.5) (separator /) (numLit 10)))) \\r\\n "
                + "(card (commentCard NOTE \\t\\t (comment TABLE   FOR   CNTCTS))) \\r\\n "
                + "(card (initDef N \\t (eqn TOTAL = (expr (expr (expr SUSC) + (expr SICK)) + (expr RECOV))))) \\r\\n "
                + "(card (commentCard NOTE \\t\\t (comment TOTAL   POPULATION   ( PEOPLE )))) \\r\\n "
                + "(card (rateDef R \\t (eqn CURE (timeScript . KL) = (expr (expr SICK (timeScript . K)) / (expr DUR))))) \\r\\n "
                + "(card (commentCard NOTE \\t\\t (comment CURE   RATE    ( PEOPLE   PER   DAY )))) \\r\\n "
                + "(card (constDef C \\t (eqn DUR = (expr (numLit 10))))) \\r\\n "
                + "(card (commentCard NOTE \\t (comment DURATION   OF   DISEASE    ( DAYS )))) \\r\\n "
                + "(card (stockDef L \\t (eqn RECOV (timeScript . K) = (expr (expr RECOV (timeScript . J)) + (expr (expr (funcRef DT)) * (expr CURE (timeScript . JK))))))) \\r\\n "
                + "(card (initDef N \\t (eqn RECOV = (expr (numLit 10))))) \\r\\n "
                + "(card (commentCard NOTE     )) \\r\\n "
                + "(card (commentCard NOTE \\t (comment RECOVERED   POPULATION \\t ( PEOPLE )))) \\r\\n "
                + "(card (commentCard NOTE)) \\r\\n "
                + "(card (specCard SPEC  \\t DT = (numLit 0.25) , LENGTH = (numLit 50) , PRTPER = (numLit 5) , PLTPER = (numLit 1))) \\r\\n "
                + "(card (printCard PRINT  \\t (rptList (rptSpec SUSC) (separator ,) (rptSpec SICK) (separator ,) (rptSpec RECOV) (separator ,) (rptSpec INF) (separator ,) (rptSpec CURE)))) \\r\\n "
                + "(card (plotCard PLOT   \\t (plotList (plotSpec SUSC = (plotChar W)) (separator ,) (plotSpec SICK = (plotChar S)) (separator ,) (plotSpec RECOV = (plotChar R)) (separator /) (plotSpec INF = (plotChar I)) (separator ,) (plotSpec CURE = (plotChar C) (bounds ( (numLit 0) , (numLit 200) ))))))"
                + " \\r\\n)";
        String result = parseFile("/pugh_p96.dyn");
        System.out.println(result);
        int i = 0;
        while (i < result.length() && expected.charAt(i) == result.charAt(i)){
            System.out.print(result.charAt(i++));
        }
        System.out.println();
        assertEquals(expected, result);
    }

    @Test
    public void testPugh211() throws RecognitionException, IOException {
        String result = parseFile("/pugh_p211.dyn");
        System.out.println(result);
    }

    @Test
    public void testAhp247() throws RecognitionException, IOException {
        String result = parseFile("/ah_p247.dyn");
        System.out.println(result);
    }

    @Test
    public void testAhp248() throws RecognitionException, IOException {
        String result = parseFile("/ah_p248.dyn");
        System.out.println(result);
    }

    @Test
    public void testAbdelHamid() throws RecognitionException, IOException {
        String result = parseFile("/abdel-hamid.dyn");
        System.out.println(result);
    }



    public static String parseString(String data) throws IOException{
        InputStream testInput = new ByteArrayInputStream(data.getBytes());
        return parseStream(testInput);
    }


    public static String parseFile(String path) throws IOException {
        InputStream inStream = getFileInput(path);
        return parseStream(inStream);
    }

    public static String parseStream(InputStream inStream) throws IOException{
        ANTLRInputStream input = new ANTLRInputStream(inStream);
        DynamoLexer lexer = new DynamoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DynamoParser parser = new DynamoParser(tokens);
        TContext tree = parser.t();
        return Trees.toStringTree(tree, parser);
    }

    public static InputStream getFileInput(String resourceName) throws FileNotFoundException {
        URL url = TestV4Parser.class.getResource(resourceName);
        String resourcePath = url.getFile();
        System.out.println(resourcePath);
        FileInputStream rval = new FileInputStream(resourcePath);
        return rval;
    }


}
