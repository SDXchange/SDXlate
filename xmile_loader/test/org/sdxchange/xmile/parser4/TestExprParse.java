package org.sdxchange.xmile.parser4;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import org.sdxchange.xmile.devkit.policy.DefaultTargetPolicy;
import org.sdxchange.xmile.devkit.policy.TargetPolicy;
import org.sdxchange.xmile.parser4.XmileParser.ExprContext;

public class TestExprParse {

    String[][] tData = {
            { "intLit","1234","(expr (numLit 1234))"},
            { "IDOnly","A","(expr A)"},
            { "IDw$","My$Var + YourVar$","(expr (expr My$Var) + (expr YourVar$))"},
            { "arrayRef","A(1)","(expr (arrayRef A ( (exprList (expr (numLit 1))) )))"},
            { "binaryAdd","23 + 35","(expr (expr (numLit 23)) + (expr (numLit 35)))"},
            { "local","v_1 AND v_2 OR NOT v3 AND v4", "(expr (expr (expr v_1) AND (expr v_2)) OR (expr (expr NOT (expr v3)) AND (expr v4)))"},
            { "builtin-logical","VAR1 <= LN(23)","(expr (expr VAR1) <= (expr (funcRef (builtin LN) ( (exprList (expr (numLit 23))) ))))"}
    };

    static TargetPolicy policy = new DefaultTargetPolicy();
    static XmileParser refParser = new XmileParser( null ); // only use for lookups

    @Test
    public void test() throws IOException {
        boolean success=true;
        for (int i=0; i < tData.length; i++)
            try {
                success &= evaluate(tData[i][0], tData[i][1], tData[i][2]);
            } catch (Exception e) {
                success = false;
            }
        assertTrue(success);
    }


    private ExprContext parseExpr(String name, String eqn, String expect) throws IOException{
        InputStream testInput = new ByteArrayInputStream(eqn.getBytes());
        ANTLRInputStream input = new ANTLRInputStream(testInput);
        XmileLexer lexer = new XmileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XmileParser parser = new XmileParser(tokens);
        ExprContext pTree = parser.expr();
        return pTree;
    }

    private boolean evaluate(String name, String eqn, String expect) throws IOException{
        InputStream testInput = new ByteArrayInputStream(eqn.getBytes());
        ANTLRInputStream input = new ANTLRInputStream(testInput);
        XmileLexer lexer = new XmileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XmileParser parser = new XmileParser(tokens);
        ExprContext pTree = parser.expr();
        String parse = pTree.toStringTree(refParser );
//        String parse = pTree.toStringTree(parser);
        boolean testResult = expect.contentEquals(parse);
        System.out.println( "\n=="+name+" tests:"+testResult+"\n  "+eqn+"\n  "+parse);
        return testResult;
    }


}
