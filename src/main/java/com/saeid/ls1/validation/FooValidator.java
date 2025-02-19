package com.saeid.ls1.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class FooValidator implements ConstraintValidator<Foo, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null || value.equals("Foo")) {
            return false;
        }
        return true;
    }
}
