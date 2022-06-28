package com.pizza_delivery.order_service.annotation.validator;
import com.pizza_delivery.order_service.annotation.ListNotNull;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;
import java.util.Objects;

public class NullOREmptyValidator implements ConstraintValidator<ListNotNull, List<String>> {
    @Override
    public boolean isValid(List<String> value, ConstraintValidatorContext context) {
        return Objects.nonNull(value);
    }
}
