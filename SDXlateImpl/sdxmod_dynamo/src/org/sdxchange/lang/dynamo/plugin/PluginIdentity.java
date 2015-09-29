package org.sdxchange.lang.dynamo.plugin;

import org.sdxchange.core.xframe.IXFrame;

/**
 * Created by Ivan on 24.07.2015.
 */
public class PluginIdentity implements org.sdxchange.plugin.api.SDXImportPlugin {

    private static final String XMILE_FORMAT_NAME = "dynamo";

    @Override
    public String getSupportedModelFormat() {
        return XMILE_FORMAT_NAME;
    }

    @Override
    public IXFrame deserializeModel(String source) {
        return null;
    }
}
