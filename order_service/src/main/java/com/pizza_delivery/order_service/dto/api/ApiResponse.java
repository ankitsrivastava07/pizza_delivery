package com.pizza_delivery.order_service.dto.api;
import lombok.Data;

@Data
public class ApiResponse {
    private Object data;
    private String message;
    private Boolean status;
    private Object error;
    private String paymentUrl;
}
