package ru.miit.annotations;

import ru.miit.validators.RollingStockValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Constraint(validatedBy = {RollingStockValidator.class})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateLen {
    String message() default "Len value is not valid";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    int lenStockAtConventionalWagons() default 0;
    int calculatedStock() default 0;
}
