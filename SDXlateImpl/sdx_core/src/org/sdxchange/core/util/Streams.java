package org.sdxchange.core.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Created by Ivan on 31.07.2015.
 */

/**
 * This class contains utils and helpers to simplify operations with
 * various Java streams
 */
public class Streams {
    /**
     * Create an input stream from given string
     * @param source String
     * @return InputStream containing content of fiven string
     */
    public static InputStream stringToStream(String source) {
        return new ByteArrayInputStream(source.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * Read an input stream and return its content in a string representation
     * @param source InputStream to read content from
     * @return String containing data from given InputStream
     */
    public static String stringFromStream(InputStream source) {
        java.util.Scanner s = new java.util.Scanner(source).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
}
