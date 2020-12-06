package ru.miit.validators;

import ru.miit.annotations.ValidateLen;
import ru.miit.RollingStock;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RollingStockValidator implements ConstraintValidator<ValidateLen, RollingStock> {
    @Override
    public boolean isValid(RollingStock rollingStock, ConstraintValidatorContext constraintValidatorContext) {
        return rollingStock.getLenStockAtConventionalWagons().equals(rollingStock.getWagonList().size());
    }
}
