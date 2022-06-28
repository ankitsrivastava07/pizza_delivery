package com.pizza_delivery.order_service.dto;
import lombok.Data;

@Data
public class PaymentDto {
    private Double amount;
    private String transactionId;
    private String paymentMethod;
    private String userId;
}
