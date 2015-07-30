package org.sdxchange.plugin.api;

import org.sdxchange.core.xframe.IXFrame;

/**
 * Created by Ivan on 22.07.2015.
 */
public interface SDXExportPlugin {
    /**
     * Returns a name of the output format
     * which cam be processed by the plugin
     * @return String format name
     */
    public String getSupportedModelFormat();

    /**
     * Serialize model to get a text-based interpretation of
     * given IXFrame object in a custom, know for the plugin
     * way
     * @param model IXFrame model to be serialized
     * @return String serialized model in a custom for the plugin way
     */
    public String serializeModel(IXFrame model);
}
