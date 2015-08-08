package org.sdxchange.core.symbol;


public interface DispatchEnabled {
    public Object dispatch(DispatchDelegate visitor);
}
