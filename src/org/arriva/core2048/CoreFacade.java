package org.arriva.core2048;

public class CoreFacade {

    private ConjunctionRule conjunctionRule;
    private CellRatingModifier cellRatingModifier;
    private Field field;

    public ConjunctionRule getConjunctionRule() {
        return conjunctionRule;
    }

    public CellRatingModifier getCellRatingModifier() {
        return cellRatingModifier;
    }


    public Field getField() {
        return field;
    }

    public CoreFacade(Field field, ConjunctionRule conjunctionRule, CellRatingModifier cellRatingModifier) {
        this.field = field;
        this.conjunctionRule = conjunctionRule;
        this.cellRatingModifier = cellRatingModifier;

        buildLinkage();
    }

    protected void buildLinkage() {
        cellRatingModifier.setConjunctionRule(conjunctionRule);
        field.setConjunctionRule(conjunctionRule);
    }

    private void FakeMethodForTestGitHubAuth() {
        //
    }



}
