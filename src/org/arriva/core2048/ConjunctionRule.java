package org.arriva.core2048;

public abstract class ConjunctionRule {

    protected int conjuctionRatingFactor;

    public int getConjuctionRatingFactor() {
        return conjuctionRatingFactor;
    }

    public void setConjuctionRatingFactor(int conjuctionRatingFactor) {
        this.conjuctionRatingFactor = conjuctionRatingFactor;
    }

    public abstract boolean canConjuct(Cell firstCell, Cell secondCell);
    public abstract int getConguctRating(Cell firstCell, Cell secondCell);

}
