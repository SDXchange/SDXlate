package org.sdxchange.dynamo.parser4;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class XUtil {
    static String pad = "                                                  "+
            "                                                                    ";
    public static String rPad(String name, int width) {
        return (name + pad).substring(0,width);
    }

    public static boolean hasAncestorNode(ParseTree f, ParserRuleContext ctx, int rule) {
        ParserRuleContext ctxBase = ctx;
        if (f instanceof TerminalNode) {
            f = f.getParent();
        }
        ParserRuleContext node = (ParserRuleContext) f;
        while ((node=node.getParent()) != ctxBase){
            if (node.getRuleContext().getRuleIndex() == rule){
                return true;
            }
        }
        return false;
    }


}
