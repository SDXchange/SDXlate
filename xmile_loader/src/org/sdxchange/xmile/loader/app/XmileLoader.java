package org.sdxchange.xmile.loader.app;

import static org.junit.Assert.assertNotNull;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;

import org.oasis.xmile.v1_0.Xmile;
import org.sdxchange.xmile.devkit.policy.DefaultTargetPolicy;
import org.sdxchange.xmile.devkit.policy.TargetPolicy;
import org.sdxchange.xmile.devkit.util.XmlHelper;
import org.sdxchange.xmile.devkit.xframe.IXFrame;
import org.sdxchange.xmile.loader.BaseListener;
import org.sdxchange.xmile.loader.XmileFrame;
import org.sdxchange.xmile.loader.XmileWalker;
import org.sdxchange.xmile.loader.context.XmileContextFactory;
import org.sdxchange.xmile.parser4.XmileParser;


public class XmileLoader {
    private IXFrame lastFrame = null;
    private XmlHelper<Xmile> helper = new XmlHelper<Xmile>();


    public void exec(String inFileName) throws Exception {
        InputStream inStream = null;
        PrintWriter writer   = null;
        PrintWriter symOut   = null;
        try {
            String baseName = getBaseName(inFileName);
            writer   = null; //getWriter(baseName+".xmile");
            symOut   = null; //getWriter(baseName+".sym");
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


    private String getBaseName(String inFileName) {
        return (inFileName.endsWith(".xmile") ? inFileName.substring(0, inFileName.length()-4 ): inFileName);
    }


    private static InputStream getInputStream(String resourcePath) throws Exception {
        FileInputStream rval;
        try {
            rval = new FileInputStream(getFileLoc(resourcePath));
        } catch (Exception  e ) {
            e.printStackTrace();
            throw new Exception("Cannot open file at "+resourcePath +"\n"+ e.getMessage());
        }
        return rval;
    }

    private static String getFileLoc(String fileLoc){
//      URL dir = this.getClass().getResource(".");
//        System.out.println(dir.getFile());
        String rval = System.getProperty("user.dir") + fileLoc;
        System.out.println("Looking for file at absolute path "+rval);
        return rval;
//        URL url = this.getClass().getResource(dir.getFile()+"../../.."+fileLoc);
//       String resourcePath = url.getFile();
//        return dir.getFile()+"../../.."+fileLoc;
    }

    static TargetPolicy policy = new DefaultTargetPolicy();
    static XmileParser refParser = new XmileParser( null ); // only use for lookups

    public XmileFrame load(String path) {
        XmlHelper<Xmile> helper = new XmlHelper<Xmile>();
        Xmile doc = helper.unmarshall(path, "org.oasis.xmile.v1_0");
        assertNotNull(doc);
        XmileFrame frame = new XmileFrame("");
        XmileContextFactory ctxFactory = XmileContextFactory.getInstance( frame, policy);
        XmileWalker walker = new XmileWalker(doc, ctxFactory, new BaseListener(frame));
        walker.visit();
        return frame;
    }




}
