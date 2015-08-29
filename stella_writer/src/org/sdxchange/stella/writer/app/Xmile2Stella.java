package org.sdxchange.stella.writer.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import org.sdxchange.stella.transform.StellaTransform;
import org.sdxchange.xmile.devkit.util.XUtil;

public class Xmile2Stella {

    public static final String kInputExt = "xmile";
    public static final String kOutputExt = "stmx";
    public static final String kSymtabExt = "sym";
    public static final String kUsageMsg =
            "Usage: java -jar xmile2stella.jar <relative file path>";

    public static void main(String[] argv){
        //argv[1] is source file, relative or absolute, with input extension
        //output will be written to <source root>.outputExt
        if (argv.length < 1){
            usage(kUsageMsg);
            System.exit( -1);
        }
        String inFileLoc = argv[0];
        System.err.println("Procesing file location "+inFileLoc);
        Xmile2Stella application = new Xmile2Stella();
        try {
            application.exec(inFileLoc);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit( -1);
        }
//        System.exit( 0);
    }

    private static void usage(String msg) {
        System.err.println(msg);
    }

    public void exec(String inFileName) throws Exception {
        InputStream inStream = null;
        OutputStream outStream   = null;
        StellaTransform transform = new StellaTransform();

        try {
            String baseName = getBaseName(inFileName);
            System.out.println("Seeking url for "+baseName+kInputExt);
//            URL url = this.getClass().getResource(baseName+kInputExt);
//            String resourcePath = url.getFile();
//            System.out.println(resourcePath);
            inStream = XUtil.getFileInput(inFileName);

            String path = XUtil.getFilePath(baseName+kOutputExt);
            System.out.println("Writing to "+path);
            outStream = new FileOutputStream(path);
            transform.transform(inStream, outStream);

        } catch (Exception e){
            System.err.println("Translation Failed: "+e.getMessage());
            e.printStackTrace();
        }

        finally {
            if (inStream != null ) {
                inStream.close();
            }
            if (outStream != null) {
                outStream.close();
            }
        }

    }

    private PrintWriter getWriter(String string) throws Exception {
        String path = string;
        try {
            path = XUtil.getFileLoc(string);
            return new PrintWriter(new FileOutputStream(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new Exception("Can't open output file " +string+ " at location " + path + "\n" +e.getMessage(), e);
        }
    }

    private String getBaseName(String inFileName) {
        return (inFileName.endsWith("."+kInputExt) ? inFileName.substring(0, inFileName.length()-kInputExt.length() ): inFileName);
    }


}
