package org.sdxchange.dynamo.parser4;

import static org.junit.Assert.assertFalse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
import org.oasis.xmile.v1_0.Xmile;
import org.sdxchange.dynamo.app2.FixedGraphEditor;
import org.sdxchange.dynamo.app2.GraphEditor;
import org.sdxchange.dynamo.app2.XmileBuilder;
import org.sdxchange.dynamo.parser4.DynamoParser.TContext;

public class TestV4Listener {



    @Test
    public void testClipFix() throws IOException {
        XmileBuilder builder = genXmile("/clipdata.dyn");
        System.out.println(builder.marshallDocument());
    }

    @Test
    public void testTableFix() throws IOException {
        XmileBuilder builder = genXmile("/tabledata.dyn");
        Xmile doc = builder.getDocument();
        String result = builder.marshallDocument();
        System.out.println(result);
        assertFalse(result.contains("TABLE("));
    }


    @Test
    public void testPass0_1_2() throws IOException {
        XmileBuilder builder = genXmile("/toNormalize.dyn");
        System.out.println(builder.marshallDocument());
    }

    @Test
    public void testFlowExtraction() throws IOException {
        XmileBuilder builder = genXmile("/testFlowData.dyn");
        System.out.println(builder.marshallDocument());
    }

    @Test
    public void testPugh_p96() throws IOException {
        XmileBuilder builder = genXmile("/pugh_p96.dyn");
        System.out.println(builder.marshallDocument());
    }

    private XmileBuilder genXmile(String path) throws IOException{
        XFrame frame = processFile(path);
        GraphEditor editor = new FixedGraphEditor();
        editor.assignPositions(frame);
        System.out.println("=====================\nAfter Position Assigned\n");
        frame.dump();
        XmileBuilder builder = new XmileBuilder();
        builder.applySimSpecs(frame);
        builder.applyDefaultFrame(frame);
        return builder;
    }

    @Test
    public void testPugh_p211() throws IOException {
        XmileBuilder builder = genXmile("/pugh_p211.dyn");
        System.out.println(builder.marshallDocument());
    }

    @Test
    public void testPugh_p379() throws IOException {
        XmileBuilder builder = genXmile("/pugh_p379.dyn");
        System.out.println(builder.marshallDocument());
    }

    @Test
    public void testAbdelHamid() throws IOException {
        XmileBuilder builder = genXmile("/abdel-hamid.dyn");
        System.out.println(builder.marshallDocument());
    }

    @Test
    public void testPugh_p386() throws IOException {
        processFile("/pugh_p386.dyn");
    }

    public static XFrame processFile(String path) throws IOException {
        InputStream inStream = TestV4Parser.getFileInput(path);
        UserDefListener listener = new UserDefListener();
        performPass(inStream, listener);
        System.out.println("Pass0 finds array names: "+listener.getArrayNames());
        inStream.close();

        inStream = TestV4Parser.getFileInput(path);
        NormalizeListener pass1Listener = new NormalizeListener();
        pass1Listener.setDefinitions("ArrayNames", listener.getArrayNames());
        TContext tree = performPass(inStream,pass1Listener);
        System.out.println("Pass1 rewrite=\n"+pass1Listener.getRewriter().getText());
        System.out.println(tree.toStringTree(pass1Listener.getParser()));

        InputStream normedStream = new ByteArrayInputStream(pass1Listener.getRewriter().getText().getBytes(StandardCharsets.US_ASCII));
        FunctionLiftListener liftListener = new FunctionLiftListener();
        TContext pass3Tree = performPass(normedStream, liftListener);

        InputStream liftedStream = new ByteArrayInputStream(liftListener.getRewriter().getText().getBytes(StandardCharsets.US_ASCII));
        DynamoSymbolListener symbolListener = new DynamoSymbolListener();
        symbolListener.setTableInfo(liftListener.getTableInfo());
        TContext pass2Tree = performPass(liftedStream, symbolListener);
        return symbolListener.getCurrentFrame();
    }

    public static TContext performPass(InputStream inputStream, DynamoTreeListener listener) throws IOException{
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        DynamoLexer lexer = new DynamoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DynamoParser parser = new DynamoParser(tokens);
        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
        TContext tree = parser.t();
        if (listener != null){
            ParseTreeWalker walker = new ParseTreeWalker();
            listener.setTokens(tokens);
            listener.setRewriter(rewriter);
            listener.setParser(parser);
            walker.walk(listener, tree);
        }
        return tree;
    }

}
