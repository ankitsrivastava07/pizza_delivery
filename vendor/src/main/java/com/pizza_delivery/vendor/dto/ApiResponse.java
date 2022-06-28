package com.pizza_delivery.vendor.dto;
import lombok.Data;

@Data
public class ApiResponse {
    private String message;
    private Object data;
    private Boolean status;
}
