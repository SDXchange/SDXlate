package org.sdxchange.dynamo.app2;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.oasis.xmile.v1_0.Xmile;
import org.sdxchange.dynamo.parser4.DynamoLexer;
import org.sdxchange.dynamo.parser4.DynamoParser;
import org.sdxchange.dynamo.parser4.DynamoParser.TContext;
import org.sdxchange.dynamo.parser4.DynamoSymbolListener;
import org.sdxchange.dynamo.parser4.DynamoTreeListener;
import org.sdxchange.dynamo.parser4.FunctionLiftListener;
import org.sdxchange.dynamo.parser4.IXFrame;
import org.sdxchange.dynamo.parser4.NormalizeListener;
import org.sdxchange.dynamo.parser4.UserDefListener;
import org.sdxchange.dynamo.parser4.XFrame;
import org.sdxchange.xmile.devkit.util.XUtil;
import org.sdxchange.xmile.devkit.util.XmlHelper;


public class Dyn2Xmile {
    private IXFrame lastFrame = null;
    private XmlHelper<Xmile> helper = new XmlHelper<Xmile>();

    public static void main(String[] argv){
        //argv[1] is source file, relative or absolute, with extension .dyn
        //output will be written to source root.xml
        if (argv.length < 1){
            usage();
            System.exit( -1);
        }
        String inFileLoc = argv[0];
        System.err.println("Procesing file location "+inFileLoc);
        Dyn2Xmile application = new Dyn2Xmile();
        try {
            application.exec(inFileLoc);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit( -1);
        }
//        System.exit( 0);
    }

    private static void usage() {
        System.err.println("Usage: java -jar dyn2xmile.jar <relative file path>");
    }

    public void exec(String inFileName) throws Exception {
        InputStream inStream = null;
        PrintWriter writer   = null;
        PrintWriter symOut   = null;
        try {
            String baseName = getBaseName(inFileName);
            writer   = getWriter(baseName+".xmile");
            symOut   = getWriter(baseName+".sym");
            XmileBuilder builder = genXmile(baseName+".dyn");
            System.out.println(builder.marshallDocument());
            writeXmile(builder.getDocument(), writer);
            symOut.println(lastFrame.dumpSymbols());
        } finally {
            if (inStream != null ) {
                inStream.close();
            }
            if (writer != null) {
                writer.close();
            }
            if (symOut !=null) {
                symOut.close();
            }
        }

    }

    private PrintWriter getWriter(String string) throws Exception {
        try {
            return new PrintWriter(new FileOutputStream(getFileLoc(string)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new Exception("Can't open output file "+string+"\n"+e.getMessage(), e);
        }
    }

    private String getBaseName(String inFileName) {
        return (inFileName.endsWith(".dyn") ? inFileName.substring(0, inFileName.length()-4 ): inFileName);
    }

    private void writeXmile(Xmile document, PrintWriter out){
        String xml = helper.marshal(document);
        out.println(xml);
    }

    public XmileBuilder genXmile(String path) throws Exception{
        XFrame frame = processFile(path);
        lastFrame=frame;
        GraphEditor editor = new FixedGraphEditor();
        editor.assignPositions(frame);
        System.out.println("=====================\nAfter Position Assigned\n");
        frame.dump();
        XmileBuilder builder = new XmileBuilder();
        builder.applySimSpecs(frame);
        builder.applyDefaultFrame(frame);
        return builder;
    }
    public static XFrame processFile(String path) throws Exception {
        //pass0 collects info necessary to reliably normalize array references and to recognize reference types.
        InputStream inStream = XUtil.getFileInput(path);
        UserDefListener listener = new UserDefListener();
        performPass(inStream, listener);
        System.out.println("Pass0 finds array names: "+listener.getArrayNames());
        inStream.close();

        //pass1 performs token level normalization, to minimize work in the symbol collection phase and in code generation.
        inStream = XUtil.getFileInput(path);
        NormalizeListener pass1Listener = new NormalizeListener();
        pass1Listener.setDefinitions("ArrayNames", listener.getArrayNames());
        TContext tree = performPass(inStream,pass1Listener);
        System.out.println("Pass1 rewrite=\n"+pass1Listener.getRewriter().getText());
        System.out.println(tree.toStringTree(pass1Listener.getParser()));

        //pass2 "lifts" table references so that they stand alone within their own AUX var. This eliminates the need for functional form
        //table references during code generation.
        InputStream normedStream = new ByteArrayInputStream(pass1Listener.getRewriter().getText().getBytes(StandardCharsets.US_ASCII));
        TableLiftListener tLiftListener = new TableLiftListener();
        TContext pass2Tree = performPass(normedStream, tLiftListener);
        System.out.println("\n\n===============>>pass2 output <<==================\n"+
                tLiftListener.getRewriter().getText()+"\n==========================\n\n");
        //pass3 "lifts" complex expressions out of stock references so that they represent just inflows and outflows.
        InputStream flatStream = new ByteArrayInputStream(tLiftListener.getRewriter().getText().getBytes(StandardCharsets.US_ASCII));
        FunctionLiftListener fLiftListener = new FunctionLiftListener();
        TContext pass3Tree = performPass(flatStream, fLiftListener);

        //pass4 finishes populating the Xframe and it's symbol tables.
        InputStream liftedStream = new ByteArrayInputStream(fLiftListener.getRewriter().getText().getBytes(StandardCharsets.US_ASCII));
        DynamoSymbolListener symbolListener = new DynamoSymbolListener();
        symbolListener.setTableInfo(fLiftListener.getTableInfo());
        TContext pass4Tree = performPass(liftedStream, symbolListener);
        return symbolListener.getCurrentFrame(); //for dynamo there is always just one frame. Other translators might require a hierarchy of frames.
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

    @Deprecated
    private static String getFileLoc(String fileLoc){

        String currentDir = Paths.get(".").toAbsolutePath().normalize().toString();

        System.out.println("Paths computes: "+ Paths.get(".").toAbsolutePath().normalize().toString());


//      URL dir = this.getClass().getResource(".");
//        System.out.println(dir.getFile());

        String rval = currentDir + File.separator + fileLoc;
        System.out.println("Looking for file at absolute path "+rval);
        return rval;
//        URL url = this.getClass().getResource(dir.getFile()+"../../.."+fileLoc);
//       String resourcePath = url.getFile();
//        return dir.getFile()+"../../.."+fileLoc;
    }




}
