package com.pizza_delivery.order_service.dto.error;
import java.util.List;
import java.util.stream.Collectors;

public class FieldValidator {

  public static List<FieldError> getFieldErrors(List<org.springframework.validation.FieldError> errors){
       return errors.stream().map(e-> {
            FieldError error = new FieldError();
            error.setMessage(e.getDefaultMessage());
            error.setFieldName(e.getField());
            error.setRejectedValue(e.getRejectedValue());
            return error;
        }).collect(Collectors.toList());
    }
}
