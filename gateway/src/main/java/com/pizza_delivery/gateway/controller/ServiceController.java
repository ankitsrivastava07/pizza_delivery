package com.pizza_delivery.gateway.controller;
import com.pizza_delivery.gateway.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class ServiceController {

    @GetMapping("/user")
    public ApiResponse userFallBack(){
        ApiResponse response = new ApiResponse();
        response.setMsg("User service is currently down . Please try again later");
        response.setStatus(Boolean.FALSE);
        return response;
    }
}
