package org.sdxchange.dynamo.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.oasis.xmile.v1_0.Xmile;
import org.sdxchange.dynamo.parser.DynamoLexer;
import org.sdxchange.dynamo.parser.DynamoParser;

import edu.iastate.xmile.util.XmlHelper;


public class Dyn2Xmile {

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
        System.exit( 0);
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
            inStream = getInputStream(baseName+".dyn");
            writer   = getWriter(baseName+".xml");
            symOut   = getWriter(baseName+".sym");
            Xmile doc = translateStream(inStream, symOut);
            writeXmile(doc, writer);
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

    private Xmile translateStream(InputStream resource, PrintWriter symOut ) throws IOException, RecognitionException{
        CommonTree t = getAst(resource);
        System.out.println(t.toStringTree());
        SymbolVisitor visitor = new SymbolVisitor(t);
        Map<String, Symbol> symtab= visitor.visit();
        Dyn2XmileMapper mapper = new Dyn2XmileMapper(t, symtab);
        Xmile document = mapper.map2Document(); //Should probably return Document! and marshall separately
        //remove function inflows
        symOut.println("\nSymbolTable:\n"+visitor.dumpTable());
        symOut.println("\n\nUndefined Symbols:\n"+visitor.dumpRefErrors());
        return document;
    }
    private static CommonTree getAst(InputStream testInput)
            throws IOException, RecognitionException {
        ANTLRInputStream input = new ANTLRInputStream(testInput);
        DynamoLexer lexer = new DynamoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DynamoParser parser = new DynamoParser(tokens);
        DynamoParser.prog_return r = parser.prog();
        // walk resulting tree
        CommonTree t = (CommonTree)r.getTree();
        return t;
    }

    private InputStream getInputStream(String resourcePath) throws Exception {
        FileInputStream rval;
        try {
            rval = new FileInputStream(getFileLoc(resourcePath));
        } catch (Exception  e ) {
            e.printStackTrace();
            throw new Exception("Cannot open file at "+resourcePath +"\n"+ e.getMessage());
        }
        return rval;
    }

    private String getFileLoc(String fileLoc){
//      URL dir = this.getClass().getResource(".");
//        System.out.println(dir.getFile());
        String rval = System.getProperty("user.dir") + fileLoc;
        System.out.println("Looking for file at absolute path "+rval);
        return rval;
//        URL url = this.getClass().getResource(dir.getFile()+"../../.."+fileLoc);
//       String resourcePath = url.getFile();
//        return dir.getFile()+"../../.."+fileLoc;
    }




}
