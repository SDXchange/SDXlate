package org.sdxchange.dynamo.parser4;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class FlowVisitor implements ParseTreeVisitor<FlowSet> {

    DynamoParser parser;

    public FlowVisitor(DynamoParser parser) {
        this.parser = parser;
    }

    @Override
    public FlowSet visit(ParseTree root) {
        int count = root.getChildCount();
        for (int i =0; i < count; i++){
            ParseTree node = root.getChild(i);
            System.out.println("#2:"+node.toStringTree(parser));
            visit(root.getChild(i));
        }
        return null;
    }

    @Override
    public FlowSet visitChildren(RuleNode rule) {
        int count = rule.getChildCount();
        for (int i =0; i < count; i++){
            ParseTree node = rule.getChild(i);
            System.out.println("#1:"+node.toStringTree(parser));
            visit(rule.getChild(i));
        }
        return null;
    }

    @Override
    public FlowSet visitErrorNode(ErrorNode errorNode) {
        System.out.println("#4:"+errorNode.toStringTree(parser));
        return null;
    }

    @Override
    public FlowSet visitTerminal(TerminalNode node) {
        System.out.println("#3:"+node.getChildCount()+":"+node.getText());
        return null;
    }

}
