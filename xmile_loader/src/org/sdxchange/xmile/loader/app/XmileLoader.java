package org.sdxchange.xmile.loader.app;

import static org.junit.Assert.assertNotNull;

import org.oasis.xmile.v1_0.Xmile;
import org.sdxchange.xmile.devkit.policy.DefaultTargetPolicy;
import org.sdxchange.xmile.devkit.policy.TargetPolicy;
import org.sdxchange.xmile.devkit.util.XUtil;
import org.sdxchange.xmile.devkit.util.XmlHelper;
import org.sdxchange.xmile.loader.BaseListener;
import org.sdxchange.xmile.loader.XmileFrame;
import org.sdxchange.xmile.loader.XmileWalker;
import org.sdxchange.xmile.loader.context.XmileContextFactory;
import org.sdxchange.xmile.parser4.XmileParser;


public class XmileLoader {

    static TargetPolicy policy = new DefaultTargetPolicy();
    static XmileParser refParser = new XmileParser( null ); // only use for lookups

    public XmileFrame load(String path, XmileFrame frame) {
        XmlHelper<Xmile> helper = new XmlHelper<Xmile>();
        Xmile doc = helper.unmarshall(path, "org.oasis.xmile.v1_0");
        assertNotNull(doc);
        XmileContextFactory ctxFactory = XmileContextFactory.getInstance( frame, policy);
        XmileWalker walker = new XmileWalker(doc, ctxFactory, new BaseListener(frame));
        walker.visit();
        return frame;
    }




}
