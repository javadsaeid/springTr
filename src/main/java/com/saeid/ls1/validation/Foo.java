package com.saeid.ls1.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=FooValidator.class)
public @interface Foo {
    String message() default "Sorry, Foo is invalid value";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
