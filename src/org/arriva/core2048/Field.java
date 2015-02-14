package org.arriva.core2048;

public abstract class Field {

    public abstract boolean hasEmptyCells();
    public abstract boolean hasAvailableConjunction();
    public abstract int getCellCount();

}
