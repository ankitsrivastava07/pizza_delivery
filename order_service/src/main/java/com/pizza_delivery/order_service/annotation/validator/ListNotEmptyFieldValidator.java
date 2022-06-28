package com.pizza_delivery.order_service.annotation.validator;
import com.pizza_delivery.order_service.annotation.ListNotEmptyField;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class ListNotEmptyFieldValidator implements ConstraintValidator<ListNotEmptyField , List<String>> {

    @Override
    public void initialize(ListNotEmptyField listNotEmptyField) {
        ConstraintValidator.super.initialize(listNotEmptyField);
    }

    @Override
    public boolean isValid(List<String> value, ConstraintValidatorContext context) {
        return value!=null && value.stream().anyMatch(e-> e!=null);
    }
}
