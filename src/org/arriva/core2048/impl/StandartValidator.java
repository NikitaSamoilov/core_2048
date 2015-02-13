package org.arriva.core2048.impl;

import org.arriva.core2048.Field;
import org.arriva.core2048.ValidationResult;
import org.arriva.core2048.Validator;

public class StandartValidator extends Validator {

    @Override
    public ValidationResult Validate(Field field) {
        if (field.hasEmptyCells()) {
            return ValidationResult.HasEmpty;
        }

        if (field.hasAvailableConjunction()) {
            return ValidationResult.NoEmptyCanAction;
        }

        return ValidationResult.NoAction;
    }
}
