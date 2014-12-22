package examples;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.CommonTree;

import examples.Symbol.Type;

//TOTO: qualify all symbols with module name. or at least have option to
//do so. (global vs. model namespaces)
public class SymbolVisitor {

    CommonTree tree;
    Map<String, Symbol> symtab = new HashMap<String, Symbol>();
    Map<String, Symbol> initSyms = new HashMap<String, Symbol>();
    int indent = 0;

    public SymbolVisitor(CommonTree t) {
        this.tree = t;
    }

    public Map<String, Symbol> visit() {
        visit(tree);
        for (String name: initSyms.keySet()){
            if (! symtab.containsKey(name)) { // if not associated with a stock
                symtab.put(name, initSyms.get(name));
            }
        }
        return symtab;
    }

    private void visit(CommonTree node) {
        //          printNodeName(node);
        switch (node.token.getType())
        {
            case DynbareParser.DOCUMENT :
            case DynbareParser.CONTROL :
            case DynbareParser.MODEL :
            case DynbareParser.MODULE :
            case DynbareParser.VARIABLES:
                visitChildren(node);
                break;
            case DynbareParser.TAUX:
            case DynbareParser.RATE:
            case DynbareParser.LEVEL:
            case DynbareParser.AUX:
                recordSymbols(symtab, node);
                break;
            case DynbareParser.IVALUE:
                recordSymbols(initSyms, node);
                break;
            default:
                System.out.println("Unhandled tokentype "+ node.getToken());
        }
    }
    private void recordSymbols(Map<String,Symbol> table, CommonTree varNode) {
        String name = varNode.getChild(0).getText();
        Symbol.Type type = token2symbolType(varNode.token.getType());
        Symbol entry = new Symbol(name, type );
        table.put(name, entry);
        for (Object item: varNode.getChildren()){
            CommonTree child = (CommonTree) item;
            if (child.token.getType() == DynbareParser.EQN){
                List<String> rightIds = extractIds(child);
                if (rightIds != null && rightIds.size()>0){
                    entry.addFrom(rightIds);
                }
                return;
            }

        }

    }

    private Type token2symbolType(int type) {
        switch (type){
            case DynbareParser.AUX: return Type.aux;
            case DynbareParser.LEVEL: return Type.stock;
            case DynbareParser.RATE:  return Type.flow;
            case DynbareParser.TAUX:  return Type.aux;
            case DynbareParser.YCOORDS: return Type.gf;
            case DynbareParser.IVALUE: return Type.init;
        }
        return null;
    }

    private List<String> extractIds(CommonTree eqnNode) {
        List<String> rval = new LinkedList<String>();
        for (Object obj : eqnNode.getChildren()){
            CommonTree child = (CommonTree) obj;
            if (child.token.getType() == DynbareParser.ID ){
                String sym = child.getText();
                if (!sym.contentEquals("DT") && !rval.contains(sym)){
                    rval.add(child.getText());
                }
            }
        }
        return rval;
    }

    private void visitChildren(CommonTree node) {
        indent += 2;
        List<CommonTree> children = (List<CommonTree>) node.getChildren();
        for (CommonTree child: children){
            visit(child);
        }
        indent -= 2;
    }

    public String dumpTable() {
        String rval = "";
        for (String sym: symtab.keySet()){
            rval += symtab.get(sym);
        }
        return rval;
    }
}