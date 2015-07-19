package org.sdxchange.stella.transform;

import org.junit.Test;
import org.sdxchange.stella.writer.app.Xmile2Stella;

public class TestApp {

    @Test
    public void testApp2p211(){
        String[] argv = {"/pugh_p211.xmile"};
        Xmile2Stella.main(argv);
    }

    @Test
    public void testApp2p96im(){
        String[] argv = {"/pugh_p96.xmile"};
        Xmile2Stella.main(argv);
    }
    @Test
    public void testApp2Teacup(){
        String[] argv = {"/teacup.xmile"};
        Xmile2Stella.main(argv);
    }

    @Test
    public void testApp2Prob(){
        String[] argv = {"/pdf.xmile"};
        Xmile2Stella.main(argv);
    }

}
