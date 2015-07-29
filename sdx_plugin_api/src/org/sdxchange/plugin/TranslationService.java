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

        System.out.println("Found readers: " + countProcessors(modelReaders).toString() );
        System.out.println("Found writes: " + countProcessors(modelWriters).toString());
        System.out.println("Found bi-directional: " + countProcessors(modelReadWriters).toString());
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
}
