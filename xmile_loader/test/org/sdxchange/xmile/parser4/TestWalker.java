package org.sdxchange.xmile.parser4;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.oasis.xmile.v1_0.Xmile;
import org.sdxchange.xmile.devkit.policy.DefaultTargetPolicy;
import org.sdxchange.xmile.devkit.policy.TargetPolicy;
import org.sdxchange.xmile.devkit.util.XmlHelper;
import org.sdxchange.xmile.loader.BaseListener;
import org.sdxchange.xmile.loader.XmileFrame;
import org.sdxchange.xmile.loader.XmileWalker;
import org.sdxchange.xmile.loader.app.XmileLoader;
import org.sdxchange.xmile.loader.context.XmileContextFactory;

public class TestWalker {

    static TargetPolicy policy = new DefaultTargetPolicy();
    static XmileParser refParser = new XmileParser( null ); // only use for lookups

    @Test
    public void test() {
        XmlHelper<Xmile> helper = new XmlHelper<Xmile>();
        Xmile doc = helper.unmarshall("/pugh_p96.xmile", "org.oasis.xmile.v1_0");
        assertNotNull(doc);
        XmileFrame frame = new XmileFrame("");
        XmileContextFactory ctxFactory = XmileContextFactory.getInstance( frame, policy);
        XmileWalker walker = new XmileWalker(doc, ctxFactory, new BaseListener(frame));
        walker.visit();
        System.out.println("=========Variables================");
        System.out.println(frame.dumpSymbols());
        System.out.println("========Connectors================");
        System.out.println(frame.dumpConnectors());
        System.out.println("========Graphs ===================");
        System.out.println(frame.dumpGraphs());
        System.out.println("=========Tables===================");
        System.out.println(frame.dumpTables());

        // Model rework (isolating references, etc.) starts here and operates
        // exclusively on data in the XFrame.
    }

    @Test
    public void testPath(){
        XmileLoader loader = new XmileLoader();
        XmileFrame frame =  loader.load("/pugh_p96.xmile");
        System.out.println("=========Variables================");
        System.out.println(frame.dumpSymbols());
        System.out.println("========Connectors================");
        System.out.println(frame.dumpConnectors());
        System.out.println("========Graphs ===================");
        System.out.println(frame.dumpGraphs());
        System.out.println("=========Tables===================");
        System.out.println(frame.dumpTables());
    }

    @Test
    public void testPathIm(){
        XmileLoader loader = new XmileLoader();
        XmileFrame frame =  loader.load("/pugh_p96im.xmile");
        System.out.println("=========Variables================");
        System.out.println(frame.dumpSymbols());
        System.out.println("========Connectors================");
        System.out.println(frame.dumpConnectors());
        System.out.println("========Graphs ===================");
        System.out.println(frame.dumpGraphs());
        System.out.println("=========Tables===================");
        System.out.println(frame.dumpTables());
    }

}
