package org.sdxchange.plugin;

import org.sdxchange.core.xframe.IXFrame;
import org.sdxchange.plugin.api.SDXBidirectionalPlugin;
import org.sdxchange.plugin.api.SDXExportPlugin;
import org.sdxchange.plugin.api.SDXImportPlugin;
import org.sdxchange.plugin.api.SDXPlugin;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by Ivan on 22.07.2015.
 */
public class TranslationService {
    private static TranslationService service;
    private ServiceLoader<SDXImportPlugin> modelReaders;
    private ServiceLoader<SDXExportPlugin> modelWriters;
    private ServiceLoader<SDXBidirectionalPlugin> modelReadWriters;

    private TranslationService() {
        modelReaders = ServiceLoader.load(SDXImportPlugin.class);
        modelWriters = ServiceLoader.load(SDXExportPlugin.class);
        modelReadWriters = ServiceLoader.load(SDXBidirectionalPlugin.class);
    }

    private Integer countProcessors(ServiceLoader<?> loader) {
        Integer result = 0;
        Iterator<?> dictionaries = loader.iterator();
        while (dictionaries.hasNext()) {
            result ++;
            dictionaries.next();
        }
        return result;
    }

    public static synchronized TranslationService getInstance() {
        if (service == null) {
            service = new TranslationService();
        }
        return service;
    }

    /**
     * Get the list of loaded plugins providing
     * models parsing functionality
     * @return ServiceLoader<SDXImportPlugin> list of loaded model readers
     */
    public ServiceLoader<SDXImportPlugin> getModelReaders() {
        return modelReaders;
    }

    /**
     * Get the list of loaded plugins providing
     * models writing functionality
     * @return ServiceLoader<SDXExportPlugin> list of loaded model writers
     */
    public ServiceLoader<SDXExportPlugin> getModelWriters() {
        return modelWriters;
    }

    /**
     * Get the list of loaded plugins providing
     * models reading and writing functionality
     * @return ServiceLoader<SDXBidirectionalPlugin> list of loaded model reader-writers
     */
    public ServiceLoader<SDXBidirectionalPlugin> getModelReadWriters() {
        return modelReadWriters;
    }

    /**
     * Check does current instance of TranslationService has a reader
     * for the model which format name was passed as a parameter
     * @param modelFormatName name of the model format to be verified
     * @return true in case reader was found. False in all other cases
     */
    public boolean hasReaderForFormat(String modelFormatName) {
        if (null == getHandlerByFormatName(modelFormatName, modelReaders))
            if (null == getHandlerByFormatName(modelFormatName, modelReadWriters))
                return false;
        return true;
    }

    /**
     * Check does current instance of TranslationService has a writer
     * for the model which format name was passed as a parameter
     * @param modelFormatName name of the model format to be verified
     * @return true in case reader was found. False in all other cases
     */
    public boolean hasWriterForFormat(String modelFormatName) {
        if (null == getHandlerByFormatName(modelFormatName, modelWriters))
            if (null == getHandlerByFormatName(modelFormatName, modelReadWriters))
                return false;
        return true;
    }

    /**
     * Build an IXFrame object from the model content and model format name
     * @param modelFormatName name of the model format to load
     * @param modelContent String representation of model content
     * @return IXFrame object
     */
    public IXFrame deserializeModelFromString(String modelFormatName, String modelContent) {
        SDXImportPlugin inLoader = getHandlerByFormatName(modelFormatName, modelReaders);
        SDXBidirectionalPlugin biLoader = getHandlerByFormatName(modelFormatName, modelReadWriters);
        if (null == inLoader)
            if (null == biLoader)
                throw new IllegalArgumentException("Invalid model format name \"" +
                modelFormatName +
                "\". Non of loaded plugins can load model of this type");
            else
                return biLoader.deserializeModel(modelContent);
        else
            return inLoader.deserializeModel(modelContent);

    }

    /**
     * Serialize an IXFrame object to String representation in given model format
     * @param modelFormatName name of the model format to written
     * @param modelContent IXFrame object to be serialized to string
     * @return IXFrame object
     */
    public String serializeModelToString(String modelFormatName, IXFrame modelContent) {
        SDXExportPlugin outWriter = getHandlerByFormatName(modelFormatName, modelWriters);
        SDXBidirectionalPlugin biWriter = getHandlerByFormatName(modelFormatName, modelReadWriters);
        if (null == outWriter)
            if (null == biWriter)
                throw new IllegalArgumentException("Invalid model format name \"" +
                        modelFormatName +
                        "\". Non of loaded plugins can write model of this type");
            else
                return biWriter.serializeModel(modelContent);
        else
            return outWriter.serializeModel(modelContent);

    }

    private<T extends SDXPlugin> T getHandlerByFormatName(String modelFormatName, ServiceLoader<T> loader){
        Iterator<T> processors = loader.iterator();
        while (processors.hasNext()) {
            SDXPlugin plugin = processors.next();
            if (plugin.getSupportedModelFormat().equals(modelFormatName))
                return (T)plugin;

        }
        return null;
    }
}
