package com.pizza_delivery.order_service.service;
import com.pizza_delivery.order_service.dto.OrderDto;
import com.pizza_delivery.order_service.dto.api.ApiResponse;
public interface OrderService {
    ApiResponse info();
    ApiResponse create(OrderDto orderDto);
}
