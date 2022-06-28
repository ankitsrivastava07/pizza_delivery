package com.pizza_delivery.user.response;
import lombok.Data;
@Data
public class ApiResponse {

    private String message;
    private Object data;
    private Boolean status;
}
