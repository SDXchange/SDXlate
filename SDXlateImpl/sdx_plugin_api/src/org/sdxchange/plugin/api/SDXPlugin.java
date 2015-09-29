package org.sdxchange.plugin.api;

/**
 * Created by Ivan on 8/9/2015.
 */
public interface SDXPlugin {
    /**
     * Returns a name of the output format
     * which cam be processed by the plugin
     * @return String format name
     */
    public String getSupportedModelFormat();
}
