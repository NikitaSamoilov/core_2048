package org.arriva.core2048.impl;

import org.arriva.core2048.Cell;
import org.arriva.core2048.CellRatingModifier;
import org.arriva.core2048.SpecialRatingValues;

public class StandartCellRatingModifier extends CellRatingModifier {

    @Override
    protected void modifyCellArray(Cell[] cells) {
        int[] ratings = getClearRatingArray(cells);

        conjuctionTransform(cells, ratings);
        fillCellsRating(cells, ratings);
    }

    private int[] getClearRatingArray(Cell[] cells) {
        int[] ratings = new int[cells.length];
        for (int i = 0; i < ratings.length; i++) {
            ratings[i] = SpecialRatingValues.EMPTY_CELL_RATING;
        }
        return ratings;
    }

    private void conjuctionTransform(Cell[] cells, int[] ratings) {
        int currentCellIndex = 0;
        int currentRatingIndex = 0;

        // TODO: Refactor this shit below

        while (currentCellIndex < (cells.length - 1)){
            if (cells[currentCellIndex].getRating() == SpecialRatingValues.EMPTY_CELL_RATING) {
                currentCellIndex += 1;
                continue;
            }

            Cell firstCell = cells[currentCellIndex];
            Cell secondCell = cells[currentCellIndex + 1];
            if (conjunctionRule.canConjuct(firstCell, secondCell)) {
                ratings[currentRatingIndex] = conjunctionRule.getConguctRating(firstCell, secondCell);
                currentRatingIndex += 1;
                currentCellIndex += 2;
                continue;
            }

            ratings[currentRatingIndex] = firstCell.getRating();
            ratings[currentRatingIndex + 1] = secondCell.getRating();
            currentRatingIndex += 2;
            currentCellIndex += 1;
        }
    }

    private void fillCellsRating(Cell[] cells, int[] ratings) {
        for (int i = 0; i < ratings.length; i++) {
            cells[i].setRating(ratings[i]);
        }
    }

}
