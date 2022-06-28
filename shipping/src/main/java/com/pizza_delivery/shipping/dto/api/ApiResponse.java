package com.pizza_delivery.shipping.dto.api;

import lombok.Data;

@Data
public class ApiResponse {

    private String message;
    private Object data;
    private Boolean status;
}
