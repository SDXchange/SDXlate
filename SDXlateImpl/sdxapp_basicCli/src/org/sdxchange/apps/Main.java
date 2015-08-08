/**
 * Created by Ivan on 27.07.2015.
 */

package org.sdxchange.apps;

import org.sdxchange.plugin.TranslationService;
import org.sdxchange.plugin.api.SDXBidirectionalPlugin;
import org.sdxchange.plugin.api.SDXExportPlugin;
import org.sdxchange.plugin.api.SDXImportPlugin;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException {
        printBanner();

        String myLocation = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getParent();
        String pluginsLocation = myLocation + File.separator + "plugins";

        System.out.println("Application location is: " + myLocation);
        System.out.println("Plugins location is:     " + pluginsLocation);
        TranslationService ts = TranslationService.getInstance();
        System.out.println("");

        renderListOfTranslators(ts);

        if (args.length == 0) {
            printHelp();
            return;
        }
    }

    private static void printBanner() {
        System.out.println("* ****************************************");
        System.out.println("*");
        System.out.println("*  Welcome to the sdXchange project");
        System.out.println("*");
        System.out.println("* ****************************************");
        System.out.println("");
    }

    private static void renderListOfTranslators(TranslationService ts) {
        System.out.println("Following plug-ins were found and successfully loaded:");

        System.out.println(" - Model readers (can parse models)");
        for (SDXImportPlugin p: ts.getModelReaders()) {
            System.out.println(" - - " + p.getSupportedModelFormat());
        }

        System.out.println(" - Model writers (can write models)");
        for (SDXExportPlugin p: ts.getModelWriters()) {
            System.out.println(" - - " + p.getSupportedModelFormat());
        }

        System.out.println(" - Model reader-writers (can do both: read and write models)");
        for (SDXBidirectionalPlugin p: ts.getModelReadWriters()) {
            System.out.println(" - - " + p.getSupportedModelFormat());
        }
    }

    private static void printHelp(){
        System.out.println("* *****************************************************************************************************");
        System.out.println("  Application usage: ");
        System.out.println("     app_launcher -input <inFormatName>://<pathToInputFile> -output <outFormatName>://<pathToInputFile>");
        System.out.println("");
        System.out.println("  Arguments:");
        System.out.println("  -input - specify an input source for the model to be translated");
        System.out.println("           <inFormatName> - name of format for the input model.");
        System.out.println("                            This name must be in the list of loaded reader or read-writer plugins");
        System.out.println("           <pathToInputFile> - absolute or relative path to the inputmodel file");
        System.out.println("  -output - specify target file where translaed model will be stored");
        System.out.println("           <outFormatName> - name of format for the output model.");
        System.out.println("                            This name must be in the list of loaded writer or read-writer plugins");
        System.out.println("           <pathToOutputFile> - absolute or relative path to the inputmodel file");
        System.out.println("* *****************************************************************************************************");
    }

}
