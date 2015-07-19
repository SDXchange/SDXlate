package org.sdxchange.xmile.devkit.policy;
public interface TargetPolicy {

    public abstract boolean isMacros();

    public abstract boolean isTableFunctionRef();

    public abstract boolean isComplexTableInput();

    public abstract boolean isIsolateInitializers();

    public abstract boolean isTableInAux();

    public abstract boolean isTablesInFlow();

    public abstract boolean isStandAloneTables();

    public abstract boolean isEquationParseNeeded();

    public abstract boolean isFunctionsNeedParens();

}