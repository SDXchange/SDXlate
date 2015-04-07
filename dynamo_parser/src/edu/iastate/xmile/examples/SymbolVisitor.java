package edu.iastate.xmile.examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.CommonTree;

import edu.iastate.xmile.DynFunctions;
import edu.iastate.xmile.DynVars;
import edu.iastate.xmile.examples.Symbol.Type;
import examples.DynbareParser;

//TOTO: qualify all symbols with module name. or at least have option to
//do so. (global vs. model namespaces)
public class SymbolVisitor {

    CommonTree tree;
    Map<String, Symbol> symtab = new HashMap<String, Symbol>();
    Map<String, Symbol> initSyms = new HashMap<String, Symbol>();
    int indent = 0;
    private static DynFunctions functions = new DynFunctions();
    private static DynVars vars = new DynVars();

    public SymbolVisitor(CommonTree t) {
        this.tree = t;
        addBuiltIns();
    }

    private void addBuiltIns() {
        for (String name : functions.getAll()){
            Symbol item = new Symbol(name, Type.function);
            symtab.put(name, item);
        }
        for (String name : vars.getAll()){
            Symbol item = new Symbol(name, Type.aux);
            symtab.put(name, item);
        }
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
            case DynbareParser.PARAMS:
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
            case DynbareParser.PAUX:
                System.out.println("processing PAUX");
                recordParam(symtab, node);
                break;
            case DynbareParser.IVALUE:
                recordSymbols(initSyms, node);
                break;
            default:
                System.out.println("Unhandled tokentype "+ node.getToken());
        }
    }

    private void recordParam(Map<String,Symbol> table, CommonTree varNode) {
        //for each param subtree
        String name = varNode.getChild(0).getText(); // the ID
        Symbol.Type type = Type.aux;
        Symbol entry = new Symbol(name, type );
        table.put(name, entry);
        CommonTree expr = (CommonTree) varNode.getChild(1);
        if (expr != null && expr.getChildren() != null){
            for (Object item: expr.getChildren()){
                CommonTree atom = (CommonTree) item;
                List<String> rightIds = extractIds(atom);
                if (rightIds != null && rightIds.size()>0){
                    entry.addFrom(rightIds);
                }
            }
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

    public String dumpRefErrors() {
        Set<String> refs = new HashSet<String>();
        for (Symbol sym: symtab.values()){
            refs.addAll(sym.getFrom());
        }
        String rval = "";
        for (String ref : refs){
            if (symtab.get(ref)==null){
                rval+=ref+"\n";
            }
        }
        return rval;
    }


}