package org.arriva.core2048;


public abstract class CellRatingModifier {

    protected ConjunctionRule conjunctionRule;

    public ConjunctionRule getConjunctionRule() {
        return conjunctionRule;
    }

    public void setConjunctionRule(ConjunctionRule conjunctionRule) {
        this.conjunctionRule = conjunctionRule;
    }

    public void modifyCells(Cell[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            modifyCellArray(cells[i]);
        }
    }

    protected abstract void modifyCellArray(Cell[] cells);
}
