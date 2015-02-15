package org.arriva.core2048.impl.helpers;

import org.arriva.core2048.Cell;
import org.arriva.core2048.ConjunctionRule;

public class RectangleFieldHelper {

    public boolean hasAvailableVerticalConjunction(Cell[][] cells, int rowCount, int colCount, ConjunctionRule conjunctionRule) {
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

    public boolean hasAvailableHorizontalConjunction(Cell[][] cells, int rowCount, int colCount, ConjunctionRule conjunctionRule) {
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
}
