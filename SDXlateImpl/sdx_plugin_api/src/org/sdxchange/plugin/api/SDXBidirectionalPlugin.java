package org.sdxchange.plugin.api;

/**
 * Created by Ivan on 22.07.2015.
 */

import org.sdxchange.core.xframe.IXFrame;

/**
 * This interface should be implemented by sdXchange plugins which are
 * able to perform both types of transformation:
 * From some custom format, known for the plugin to xFrame structure
 * From xFrame structure to some custom format, known for the plugin
 */
public interface SDXBidirectionalPlugin {
    /**
     * Returns a name of the input and output format
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

    /**
     * Serialize model to get a text-based interpretation of
     * given IXFrame object in a custom, know for the plugin
     * way
     * @param model IXFrame model to be serialized
     * @return String serialized model in a custom for the plugin way
     */
    public String serializeModel(IXFrame model);
}
