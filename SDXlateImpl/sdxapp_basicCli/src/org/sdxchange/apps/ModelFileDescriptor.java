package org.sdxchange.apps;

/**
 * Created by Ivan on 8/8/2015.
 */
public class ModelFileDescriptor {

    private String modelFormat;
    private String modelPath;

    public ModelFileDescriptor(String modelUrlDescriptor) {
        int modelFormatEnd = modelUrlDescriptor.indexOf("://");
        modelFormat = modelUrlDescriptor.substring(0, modelFormatEnd);
        modelPath = modelUrlDescriptor.substring(modelFormatEnd + 3);
    }

    public String getModelFormat() {
        return modelFormat;
    }

    public String getModelPath() {
        return modelPath;
    }
}
