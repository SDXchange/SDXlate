package org.sdxchange.xmile.devkit.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Paths;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class XUtil {
    static String pad = "                                                  "+
            "                                                                    ";
    public static String rPad(String name, int width) {
        return (name + pad).substring(0,width);
    }

    public static boolean hasAncestorNode(ParseTree f, ParserRuleContext ctx, int rule) {
        ParserRuleContext ctxBase = ctx;
        if (f instanceof TerminalNode) {
            f = f.getParent();
        }
        ParserRuleContext node = (ParserRuleContext) f;
        while ((node=node.getParent()) != ctxBase){
            if (node.getRuleContext().getRuleIndex() == rule){
                return true;
            }
        }
        return false;
    }

    public static InputStream filterFirstStream(InputStream iStream, String match, String replacement) throws IOException{
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        int nRead;
        byte[] data = new byte[4096];

        // copy input stream to output buffer
        while ((nRead = iStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        buffer.flush();

        //modify contents
        String xml = new String(buffer.toByteArray());
        return new ByteArrayInputStream(xml.replaceFirst(match,replacement).getBytes());
    }

    public static String readStream(InputStream is) throws IOException{
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        int nRead;
        byte[] data = new byte[4096];

        // copy input stream to output buffer
        while ((nRead = is.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        buffer.flush();

        String xml = new String(buffer.toByteArray());
        return xml.replaceFirst("xmlns=\"[^\"]*\"","");
    }

    public static OutputStream transform(InputStream xmlIn, InputStream xform, OutputStream result){
        Source xmlInput = new StreamSource(xmlIn);
        Source xsl = new StreamSource(xform);
        Result xmlOutput = new StreamResult(result);
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer(xsl);
            transformer.transform(xmlInput, xmlOutput);
        } catch (TransformerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    public static InputStream getFileInput(String fPath) throws Exception{
        Exception error = null;
        FileInputStream rval = null;
        String resourcePath = null;
        String currentDir = Paths.get(".").toAbsolutePath().normalize().toString();
        String path = currentDir + File.separator + fPath;
        try {
            rval = new FileInputStream(path);
            return rval; //success
        } catch (Exception e){
            error = e;
            //save it in case we can't find as resource either.
        }
        try {
            URL url = XUtil.class.getResource(fPath);
            resourcePath = url.getFile();
            System.out.println(resourcePath);
            rval = new FileInputStream(resourcePath);
            System.out.println("Opening resource file at "+resourcePath);
            return rval;
        } catch (Exception e){
            System.err.println("Unable to open file "+path +"\n ...or resource "+ resourcePath);
            throw error;
        }


    }

    //TODO: make a little more intelligent search, look resource relative first,
    // then resource relative, and then absolute.
    public static String getFileLoc(String fileLoc){
//      URL dir = this.getClass().getResource(".");
//        System.out.println(dir.getFile());
        String rval = System.getProperty("user.dir") + fileLoc;
//        System.out.println("Looking for file at absolute path "+rval);
        return rval;
//        URL url = this.getClass().getResource(dir.getFile()+"../../.."+fileLoc);
//       String resourcePath = url.getFile();
//        return dir.getFile()+"../../.."+fileLoc;
    }



}
