package org.arriva.core2048.impl;

import org.arriva.core2048.Field;

public class RectangleField extends Field {

    private int rowCount;
    private int colCount;

    public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    @Override
    public boolean hasEmptyCells() {
        // TODO: Implement logic
        return false;
    }

    @Override
    public boolean hasAvailableConjunction() {
        // TODO: Implement logic
        return false;
    }

    @Override
    public int getCellCount() {
        return rowCount * colCount;
    }
}
