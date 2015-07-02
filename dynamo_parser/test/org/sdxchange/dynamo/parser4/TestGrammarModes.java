package org.sdxchange.dynamo.parser4;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

public class TestGrammarModes {


    @Test
    public void testContinuation() throws IOException {
        String data = "C NAME=3\n"
                + "X *4 with comment\n"
                ;
        String result =TestV4Parser.parseString(data);
        System.out.println(result);
        assertTrue(result.contains("constDef"));
        assertTrue(result.contains("(expr (numLit 3)) * (expr (numLit 4))"));
    }

    @Test
    public void testNumbers() throws IOException{
        String data = "A V=.7\n"+
                "A V=1.7\n"+
                "A V=7e6\n"+
                "A V=6e-3\n"+
                "A V=3.7e+4\n"+
                "A V=13\n"
                ;
        String result = TestV4Parser.parseString(data);
        System.out.println(result);
    }

}
