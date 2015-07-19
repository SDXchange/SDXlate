package org.sdxchange.stella.transform;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.sdxchange.xmile.devkit.util.XUtil;

public class StellaTransform {

    private static final String kXform1Loc = "/resources/stripStellaMacros.xslt";
    private static final String kXform2Loc = "/resources/xmile2stella.xslt";
    InputStream xform ;
    InputStream xform2 ;

    public StellaTransform( ) {
        xform = getClass().getResourceAsStream(kXform1Loc);
        xform2 = getClass().getResourceAsStream(kXform2Loc);
    }

    public void transform(InputStream input, OutputStream result) throws IOException{
        // remove xmlns attribute
        InputStream filtered = XUtil.filterFirstStream(input, "xmlns=\"[^\"]*\"","");
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        // perform first transform to local buffer
        XUtil.transform(filtered, xform, buffer);
        ByteArrayInputStream inPipe = new ByteArrayInputStream(buffer.toByteArray());
        // perform second transform from local buffer to output stream
        XUtil.transform(inPipe, xform2, result);
    }


}
