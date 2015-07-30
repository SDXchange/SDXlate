package org.sdxchange.lang.xmile.plugin;

import org.sdxchange.core.xframe.IXFrame;

/**
 * Created by Ivan on 24.07.2015.
 */
public class PluginIdentity implements org.sdxchange.plugin.api.SDXBidirectionalPlugin {

    private static final String XMILE_FORMAT_NAME = "xmile";

    @Override
    public String getSupportedModelFormat() {
        return XMILE_FORMAT_NAME;
    }

    @Override
    public IXFrame deserializeModel(String source) {
        return null;
    }

    @Override
    public String serializeModel(IXFrame model) {
        return null;
    }
}
