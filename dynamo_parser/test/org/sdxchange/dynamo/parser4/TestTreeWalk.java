package org.sdxchange.dynamo.parser4;

import static org.sdxchange.dynamo.parser4.TestV4Listener.performPass;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.xpath.XPath;
import org.junit.Test;
import org.sdxchange.dynamo.parser4.DynamoParser.TContext;

public class TestTreeWalk {

    @Test
    public void test() throws IOException {
        CaptureListener cListener = new CaptureListener();
        InputStream inStream = TestV4Parser.getFileInput("/pugh_p211.dyn");
        TestListener listener = new TestListener();
        TContext tree = performPass(inStream, cListener);
        listener.setTokens(cListener.getTokens());
        Collection<ParseTree> matches = XPath.findAll(tree,"//eqn", cListener.getParser());
        ParseTreeWalker walker = new ParseTreeWalker();
        for (ParseTree match: matches){
            String eqn = match.getText();
            System.out.println("========================\nSegment: "+eqn+"\n");
            if (eqn.toUpperCase().contains("CLIP(")){
                walker.walk(listener,match);
            }
        }
    }

    @Test
    public void testVisitor() throws IOException {
        CaptureListener cListener = new CaptureListener();
        InputStream inStream = TestV4Parser.getFileInput("/clipdata.dyn");
        ClipVisitor visitor = new ClipVisitor();
        TContext tree = performPass(inStream, cListener);
        visitor.setParser(cListener.getParser());
        Collection<ParseTree> matches = XPath.findAll(tree,"//eqn", cListener.getParser());
        for (ParseTree match: matches){
            String eqn = match.getText();
            System.out.println("========================\nSegment: "+eqn+"\n");
            if (eqn.toUpperCase().contains("CLIP(")){
                System.out.println("Rval = "+ visitor.visit(match));
            }
        }
    }

    @Test
    public void testMatcher() throws IOException {
        CaptureListener cListener = new CaptureListener();
        InputStream inStream = TestV4Parser.getFileInput("/pugh_p211.dyn");
        TestListener listener = new TestListener();
        TContext tree = performPass(inStream, cListener);
        listener.setTokens(cListener.getTokens());
        Collection<ParseTree> matches = XPath.findAll(tree,"//eqn", cListener.getParser());
        ParseTreeWalker walker = new ParseTreeWalker();
        for (ParseTree match: matches){
            String eqn = match.getText();
            System.out.println("========================\nSegment: "+eqn+"\n");
            if (eqn.toUpperCase().contains("CLIP(")){
                walker.walk(listener,match);
            }
        }
    }


}
