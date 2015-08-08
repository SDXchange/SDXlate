package org.sdxchange.plugin;

import org.sdxchange.plugin.api.SDXBidirectionalPlugin;
import org.sdxchange.plugin.api.SDXExportPlugin;
import org.sdxchange.plugin.api.SDXImportPlugin;

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
}
