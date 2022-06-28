package com.pizza_delivery.payment.dto;
import lombok.Data;

@Data
public class ErrorField {

    private Object rejectedValue;
    private String fieldName;
    private String message;
}
