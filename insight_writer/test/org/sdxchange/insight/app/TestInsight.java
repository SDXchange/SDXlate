package org.sdxchange.insight.app;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.oasis.xmile.devkit.view.edit.FixedGraphEditor;
import org.sdxchange.xmile.loader.XmileFrame;
import org.sdxchange.xmile.loader.app.XmileLoader;

public class TestInsight {



    @Test
    public void testPugh96() throws IOException{
        XmileLoader loader = new XmileLoader();
        XmileFrame frame = loader.load("/pugh_p96.xmile");
        InsightBuilder builder = new InsightBuilder(frame);
        InsightGraph model = builder.genGraph();
        String output = model.marshal();
        System.out.println(output);


    }

    @Test
    public void testPugh96im() throws IOException{
        XmileLoader loader = new XmileLoader();
        XmileFrame frame = loader.load("/pugh_p96im.xmile");
        InsightBuilder builder = new InsightBuilder(frame);
        InsightGraph model = builder.genGraph();
        String output = model.marshal();
        System.out.println(output);

    }

    @Test
    public void testPdfIm()  throws IOException{
        XmileLoader loader = new XmileLoader();
        XmileFrame frame = loader.load("/pdf.xmile");
        InsightBuilder builder = new InsightBuilder(frame);
        InsightGraph model = builder.genGraph();
        String output = model.marshal();
        System.out.println(output);

    }

    @Test
    public void testTeacup()  throws IOException{
        XmileLoader loader = new XmileLoader();
        XmileFrame frame = loader.load("/teacup.xmile");
        InsightBuilder builder = new InsightBuilder(frame);
        InsightGraph model = builder.genGraph();
        String output = model.marshal();
        System.out.println(output);

    }

    @Test
    public void testIdNormalize(){
        String rval = InsightBuilder.normalizeIDs("BARF*2+ OTHER ()");
        assertEquals("[BARF]*2+ [OTHER] ()",rval);
    }

    private void setGridDefaults(FixedGraphEditor editor){
        editor.defaultAuxCol=100;
        editor.defaultFlowCol=200;
        editor.defaultStockCol=400;
        editor.defaultXSpace=200;
        editor.defaultYSpace=100;
    }

}
