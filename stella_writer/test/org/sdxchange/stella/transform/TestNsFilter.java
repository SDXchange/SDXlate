package org.sdxchange.stella.transform;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;
import org.sdxchange.xmile.devkit.util.XUtil;

public class TestNsFilter {

    @Test
    public void test() throws IOException {
        InputStream input = getClass().getResourceAsStream("/pugh_p96.xmile");
        InputStream filtered = XUtil.filterFirstStream(input, "xmlns=\"[^\"]*\"","");
        String result = XUtil.readStream(filtered);
        System.out.println(result);
    }

}