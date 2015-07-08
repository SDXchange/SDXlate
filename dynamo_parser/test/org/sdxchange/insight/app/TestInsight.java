package org.sdxchange.insight.app;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.sdxchange.dynamo.app2.Dyn2Xmile;
import org.sdxchange.dynamo.app2.FixedGraphEditor;
import org.sdxchange.dynamo.parser4.XFrame;

public class TestInsight {



    @Test
    public void testApp2Teacup() throws IOException{
        Dyn2Xmile app = new Dyn2Xmile();
        XFrame frame = Dyn2Xmile.processFile("/teacup.dyn");
        FixedGraphEditor editor = new FixedGraphEditor();
        setGridDefaults(editor);
        editor.assignPositions(frame);
        System.out.println("=====================\nAfter Position Assigned\n");
        frame.dump();
        InsightBuilder builder = new InsightBuilder(frame);
        InsightGraph model = builder.genGraph();
        model.updateFolderSizes(600+50, editor.getMaxY()+200);
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
