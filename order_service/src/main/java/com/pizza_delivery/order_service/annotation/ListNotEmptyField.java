package com.pizza_delivery.order_service.annotation;
import com.pizza_delivery.order_service.annotation.validator.ListNotEmptyFieldValidator;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ListNotEmptyFieldValidator.class)
public @interface ListNotEmptyField {

    String message() default "Product id can not be empty in a list ";

    Class<?> [] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
