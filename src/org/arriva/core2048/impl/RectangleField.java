package org.arriva.core2048.impl;

import org.arriva.core2048.Cell;
import org.arriva.core2048.Field;
import org.arriva.core2048.SpecialRatingValues;
import org.arriva.core2048.impl.helpers.RectangleFieldHelper;

public class RectangleField extends Field {

    private int rowCount;
    private int colCount;

    protected Cell[][] cells;
    protected RectangleFieldHelper rectangleFieldHelper;

    public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public RectangleField(int rowCount, int colCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;

        rectangleFieldHelper = new RectangleFieldHelper();
        cells = new Cell[rowCount][colCount];
    }

    @Override
    public boolean hasEmptyCells() {
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (cells[i][j].getRating() == SpecialRatingValues.EMPTY_CELL_RATING) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean hasAvailableConjunction() {
        if (rectangleFieldHelper.hasAvailableHorizontalConjunction(cells, rowCount, colCount, conjunctionRule)) {
            return true;
        }

        if (rectangleFieldHelper.hasAvailableVerticalConjunction(cells, rowCount, colCount, conjunctionRule)) {
            return true;
        }

        return false;
    }

    @Override
    public int getCellCount() {
        return rowCount * colCount;
    }
}
