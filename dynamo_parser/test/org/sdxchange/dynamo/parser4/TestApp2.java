package org.sdxchange.dynamo.parser4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.oasis.xmile.v1_0.Xmile;
import org.sdxchange.dynamo.app2.Dyn2Xmile;
import org.sdxchange.dynamo.app2.XmileBuilder;

public class TestApp2 {


    @Test
    public void testApp2p211(){
        String[] argv = {"/pugh_p211.dyn"};
        Dyn2Xmile.main(argv);
    }


    @Test
    public void testApp2p96(){
        String[] argv = {"/pugh_p96.dyn"};
        Dyn2Xmile.main(argv);
    }

    @Test
    public void testApp2p96a(){
        String[] argv = {"/pugh_p96a.dyn"};
        Dyn2Xmile.main(argv);
    }

    @Test
    public void testApp2Teacup(){
        String[] argv = {"/teacup.dyn"};
        Dyn2Xmile.main(argv);
    }

    @Test
    public void testApp2Prob(){
        String[] argv = {"/pdf.dyn"};
        Dyn2Xmile.main(argv);
    }

    @Test
    public void testApp2AbdelHamid(){
        String[] argv = {"/abdel-hamid.dyn"};
        Dyn2Xmile.main(argv);
    }
    @Test
    public void testApp2Varinit(){
        String[] argv = {"/initdata.dyn"};
        Dyn2Xmile.main(argv);
    }


    @Test
    public void testApp2MinTable() throws IOException{
        Dyn2Xmile app = new Dyn2Xmile();
        XmileBuilder builder = app.genXmile("/tableonly.dyn");
        Xmile doc = builder.getDocument();
        String result = builder.marshallDocument();
        System.out.println(result);
        assertTrue(result.contains("<gf name=\"TAB1"));
        assertFalse(result.contains("TABLE("));
    }

    @Test
    public void testTableFix() throws IOException {
        Dyn2Xmile app = new Dyn2Xmile();
        XmileBuilder builder = app.genXmile("/tabledata.dyn");
        Xmile doc = builder.getDocument();
        String result = builder.marshallDocument();
        System.out.println(result);
        assertFalse(result.contains("TABLE("));
    }

}
