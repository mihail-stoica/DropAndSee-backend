package com.mihailstoica.dropandsee.validator;

import com.mihailstoica.dropandsee.validator.impl.UniqueUserNameValidatorImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UniqueUserNameValidatorImpl.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueUserName {

    String message() default "{dropandsee.constraints.username.UniqueUserName.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
