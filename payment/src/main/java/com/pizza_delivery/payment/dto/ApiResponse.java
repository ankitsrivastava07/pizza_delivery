package com.pizza_delivery.payment.dto;
import lombok.Data;
import org.springframework.validation.FieldError;
import java.util.List;

@Data
public class ApiResponse {

    private String message;
    private Object data;
    private Boolean status;
    private List<FieldError> error;
}
