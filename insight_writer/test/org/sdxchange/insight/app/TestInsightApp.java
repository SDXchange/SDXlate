package org.sdxchange.insight.app;

import org.junit.Test;

public class TestInsightApp {
    @Test
    public void testApp2p211(){
        String[] argv = {"/pugh_p211im.xmile"};
        Xmile2Insight.main(argv);
    }

    @Test
    public void testApp2p96im(){
        String[] argv = {"/pugh_p96im.xmile"};
        Xmile2Insight.main(argv);
    }
    @Test
    public void testApp2Teacup(){
        String[] argv = {"/teacup.xmile"};
        Xmile2Insight.main(argv);
    }

    @Test
    public void testApp2Prob(){
        String[] argv = {"/pdf.xmile"};
        Xmile2Insight.main(argv);
    }

}
