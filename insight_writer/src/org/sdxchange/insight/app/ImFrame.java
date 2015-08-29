package org.sdxchange.insight.app;

import org.antlr.v4.runtime.tree.ParseTree;
import org.sdxchange.xmile.devkit.symbol.SymbolBase;
import org.sdxchange.xmile.devkit.symbol.XSymbol;
import org.sdxchange.xmile.devkit.symbol.XY;
import org.sdxchange.xmile.loader.XmileFrame;
import org.sdxchange.xmile.loader.context.AuxvarContext;
import org.sdxchange.xmile.loader.context.ParsedEqn;

public class ImFrame extends XmileFrame {

    public ImFrame (String name){
        super(name);
    }

    public void refactorTableInputs() {

        for (XSymbol sym : getDefinedVars()) {
            System.out.println("Refactor Processing symbol " + sym.dump());
            switch (sym.getVarType()) {
                case "AUX":
                case "TAUX":
                case "RATE": {

                    if (sym.hasNestedTable() && sym.hasComplexEqn()) {
                        String synthName = SymbolBase.createVarName("TABIN");
                        XSymbol helper = new AuxvarContext(synthName, sym.getEqn());
                        //TODO: fixup display coordinates?
                        this.defineVar(synthName, helper);
                        //set view position
                        XY varPos = sym.getPosition();
                        XY newPos = new XY(varPos.getX()+25, varPos.getY()+25);
                        helper.setPosition(newPos);
                        //reset original dependencies and update eqn.
                        sym.clearDependencies();
                        sym.setEqn(synthName);
                    }
                }

                //todo: rate... does insight maker allow table input to rate?
                break;
                default:
            }
        }
    }

    //TODO: create common function to apply visitors
    public void inlineInitTerms() {

        for (XSymbol sym : getDefinedVars()) {
            System.out.println("Init Refactor Processing symbol " + sym.dump());
            if (sym instanceof ParsedEqn ){
                ParseTree tree = ((ParsedEqn) sym).getEqnParseTree();
                InitRefVisitor visitor = new InitRefVisitor(this);
                String eqn = visitor.visit(tree);
                if (visitor.isEquationChanged() ){
                    System.out.println("Equation changed to "+eqn);
                    sym.clearDependencies();
                    sym.setEqn(eqn);
                }
            }
        }
    }

    public void mapTimeReferences() {

        for (XSymbol sym : getDefinedVars()) {
            System.out.println("Time Refactor Processing symbol " + sym.dump());
            if (sym instanceof ParsedEqn ){
                ParseTree tree = ((ParsedEqn) sym).getEqnParseTree();
                TimeRefVisitor visitor = new TimeRefVisitor(this);
                String eqn = visitor.visit(tree);
                if (visitor.isEquationChanged() ){
                    System.out.println("Equation changed to "+eqn);
                    sym.clearDependencies();
                    sym.setEqn(eqn);
                }
            }
        }
    }

    public void mapIfThenExprs() {
        for (XSymbol sym : getDefinedVars()) {
            System.out.println("IfThen Refactor Processing symbol " + sym.dump());
            if (sym instanceof ParsedEqn ){
                ParseTree tree = ((ParsedEqn) sym).getEqnParseTree();
                IfThenVisitor visitor = new IfThenVisitor(this);
                String eqn = visitor.visit(tree);
                if (visitor.isEquationChanged() ){
                    System.out.println("Equation changed to "+eqn);
                    sym.clearDependencies();
                    sym.setEqn(eqn);
                }
            }
        }
    }


}
