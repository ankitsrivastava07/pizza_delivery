package com.pizza_delivery.order_service.annotation;

import com.pizza_delivery.order_service.annotation.validator.NullOREmptyValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NullOREmptyValidator.class)
public @interface ListNotNull {

    String message() default "List of objects can not be null";

    Class<?> [] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
