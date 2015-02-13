package org.arriva.core2048.impl;

import org.arriva.core2048.Cell;
import org.arriva.core2048.ConjunctionRule;

public class StandartConjuctionRule extends ConjunctionRule {

    @Override
    public boolean canConjuct(Cell firstCell, Cell secondCell) {
        return firstCell.getRating() == secondCell.getRating();
    }

    @Override
    public int getConguctRating(Cell firstCell, Cell secondCell) {
        return firstCell.getRating() + secondCell.getRating();
    }
}
