package com.pizza_delivery.order_service.dto.error;
import lombok.Data;

@Data
public class FieldError {
    private String message;
    private Object fieldName;
    private Object rejectedValue;
}
