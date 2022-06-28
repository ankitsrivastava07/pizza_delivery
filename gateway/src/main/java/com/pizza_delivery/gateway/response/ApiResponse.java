package com.pizza_delivery.gateway.response;
import lombok.Data;

@Data
public class ApiResponse {

    private String msg;
    private Object data;
    private Boolean status;
}
