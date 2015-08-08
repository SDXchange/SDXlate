package org.sdxchange.lang.insightMaker.plugin;

import org.sdxchange.core.xframe.IXFrame;

/**
 * Created by Ivan on 24.07.2015.
 */
public class PluginIdentity implements org.sdxchange.plugin.api.SDXExportPlugin {

    private static final String XMILE_FORMAT_NAME = "insightMaker";

    @Override
    public String getSupportedModelFormat() {
        return XMILE_FORMAT_NAME;
    }

    @Override
    public String serializeModel(IXFrame model) {
        return null;
    }
}
