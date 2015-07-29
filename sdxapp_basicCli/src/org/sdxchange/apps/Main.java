/**
 * Created by Ivan on 27.07.2015.
 */

package org.sdxchange.apps;

import org.sdxchange.plugin.TranslationService;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException {
        System.out.println("Hello world");
        String myLocation = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getParent();
        String pluginsLocation = myLocation + File.separator + "plugins";
        System.out.println("I'm loaded from " + myLocation);
        System.out.println("Plugins location is " + pluginsLocation);
        TranslationService ts = TranslationService.getInstance();
    }

}
