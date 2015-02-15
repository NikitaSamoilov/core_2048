package org.arriva.core2048.impl;

import org.arriva.core2048.Cell;
import org.arriva.core2048.Field;
import org.arriva.core2048.SpecialRatingValues;

public class RectangleField extends Field {

    private int rowCount;
    private int colCount;
    protected Cell[][] cells;

    public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public RectangleField(int rowCount, int colCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;
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
        if (hasAvailableHorizontalConjunction()) {
            return true;
        }

        if (hasAvailableVerticalConjunction()) {
            return true;
        }

        return false;
    }

    private boolean hasAvailableVerticalConjunction() {
        for (int i = 0; i < rowCount - 1; i++) {
            for (int j = 0; j < colCount; j++) {
                Cell firstCell = cells[i][j];
                Cell secondCell = cells[i+1][j];

                if (conjunctionRule.canConjuct(firstCell, secondCell)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasAvailableHorizontalConjunction() {
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount - 1; j++) {
                Cell firstCell = cells[i][j];
                Cell secondCell = cells[i][j+1];

                if (conjunctionRule.canConjuct(firstCell, secondCell)) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public int getCellCount() {
        return rowCount * colCount;
    }
}
