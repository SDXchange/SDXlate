package org.sdxchange.stella.transform;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.junit.Test;
import org.sdxchange.xmile.devkit.util.XUtil;

public class TestXslt {

    @Test
    public void test() throws FileNotFoundException {

        InputStream input = getClass().getResourceAsStream("/pugh_p96.xmile");
        InputStream xform = getClass().getResourceAsStream("/resources/stripStellaMacros.xslt");
        String path = XUtil.getFileLoc("/pugh_p96.stmx");
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        OutputStream result = buffer;

        Source xmlInput = new StreamSource(input);
        Source xsl = new StreamSource(xform);
        Result xmlOutput = new StreamResult(buffer);
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer(xsl);
            transformer.transform(xmlInput, xmlOutput);
        } catch (TransformerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void testPipeline() throws IOException {

        InputStream input = getClass().getResourceAsStream("/pugh_p96.xmile");
        InputStream xform = getClass().getResourceAsStream("/resources/stripStellaMacros.xslt");
        InputStream xform2 = getClass().getResourceAsStream("/resources/xmile2stella.xslt");
        String path = XUtil.getFileLoc("/pugh_p96.stmx");
        OutputStream result = new FileOutputStream(path);
        InputStream filtered = XUtil.filterFirstStream(input, "xmlns=\"[^\"]*\"","");
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        XUtil.transform(filtered, xform, buffer);
        ByteArrayInputStream inPipe = new ByteArrayInputStream(buffer.toByteArray());
        XUtil.transform(inPipe, xform2, result);

        System.out.println(buffer.toString());
    }

}
