package org.sdxchange.insight.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;

import org.sdxchange.xmile.devkit.util.XUtil;
import org.sdxchange.xmile.loader.XmileFrame;
import org.sdxchange.xmile.loader.app.XmileLoader;

public class Xmile2Insight {

    public static final String kInputExt = "xmile";
    public static final String kOutputExt = "InsightMaker";
    public static final String kSymtabExt = "sym";
    public static final String kUsageMsg =
            "Usage: java -jar xmile2insight.jar <relative file path>";

    public static void main(String[] argv){
        //argv[1] is source file, relative or absolute, with input extension
        //output will be written to <source root>.outputExt
        if (argv.length < 1){
            usage(kUsageMsg);
            System.exit( -1);
        }
        String inFileLoc = argv[0];
        System.err.println("Procesing file location "+inFileLoc);
        Xmile2Insight application = new Xmile2Insight();
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
        PrintWriter writer   = null;
        PrintWriter symOut   = null;

        try {
            String baseName = getBaseName(inFileName);
            writer   = getWriter(baseName+kOutputExt);
            symOut   = getWriter(baseName+kSymtabExt);

            XmileLoader loader = new XmileLoader();
            ImFrame xModel = new ImFrame("");
            XmileFrame frame = loader.load(inFileName, xModel);
            xModel.refactorTableInputs();
            xModel.inlineInitTerms();
            xModel.mapTimeReferences();
            xModel.mapIfThenExprs();
            InsightBuilder builder = new InsightBuilder(xModel);
            InsightGraph model = builder.genGraph();
            String output = model.marshal();
            writer.println(output);
            symOut.println(frame.dumpSymbols());

        } catch (Exception e){
            System.err.println("Translation Failed: "+e.getMessage());
            e.printStackTrace();
        }

        finally {
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
        String path = string;
        try {
            path = XUtil.getFilePath(string);
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
