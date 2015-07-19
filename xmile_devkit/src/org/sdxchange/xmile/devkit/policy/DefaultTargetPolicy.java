package org.sdxchange.xmile.devkit.policy;

public class DefaultTargetPolicy implements TargetPolicy {

    @Override
    public boolean isMacros() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isTableFunctionRef() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isComplexTableInput() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isIsolateInitializers() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isTableInAux() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isTablesInFlow() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isStandAloneTables() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEquationParseNeeded() {
        return true;
    }

    @Override
    public boolean isFunctionsNeedParens() {
        // TODO Auto-generated method stub
        return false;
    }

}
