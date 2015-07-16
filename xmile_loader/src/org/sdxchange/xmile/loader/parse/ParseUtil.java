package org.sdxchange.xmile.loader.parse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.sdxchange.xmile.devkit.policy.TargetPolicy;
import org.sdxchange.xmile.parser4.XmileLexer;
import org.sdxchange.xmile.parser4.XmileParser;
import org.sdxchange.xmile.parser4.XmileParser.ExprContext;

public class ParseUtil {


    public static final Parser refParser = new XmileParser(null);

    public static ExprContext createExprParseTree(TargetPolicy policy, String eqn) {
        if (policy != null && policy.isEquationParseNeeded()) {
            return parseExpr(eqn);
        }
        else {
            return null;
        }
    }

    private static ExprContext parseExpr(String eqn) {
        try {
            InputStream testInput = new ByteArrayInputStream(eqn.getBytes());
            ANTLRInputStream input = new ANTLRInputStream(testInput);
            XmileLexer lexer = new XmileLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            XmileParser parser = new XmileParser(tokens);
            ExprContext pTree = parser.expr();
            return pTree;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
