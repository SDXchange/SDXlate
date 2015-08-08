package org.sdxchange.plugin.api;

import org.sdxchange.core.xframe.IXFrame;

/**
 * Created by Ivan on 22.07.2015.
 */
public interface SDXImportPlugin {
    /**
     * Returns a name of the input format
     * which cam be processed by the plugin
     * @return String format name
     */
    public String getSupportedModelFormat();

    /**
     * Returns an IXFrame structure which is build from the
     * given model source in a custom way, implemented in
     * the plugin
     * @param source String representing content of the model in text representation
     * @return IXFrame structure which reflects model passed as a source
     */
    public IXFrame deserializeModel(String source);
}
