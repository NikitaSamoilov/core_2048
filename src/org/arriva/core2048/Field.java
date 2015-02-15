package org.arriva.core2048;

public abstract class Field {

    protected ConjunctionRule conjunctionRule;

    public ConjunctionRule getConjunctionRule() {
        return conjunctionRule;
    }

    public void setConjunctionRule(ConjunctionRule conjunctionRule) {
        this.conjunctionRule = conjunctionRule;
    }

    public abstract boolean hasEmptyCells();
    public abstract boolean hasAvailableConjunction();
    public abstract int getCellCount();

}
