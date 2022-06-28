package com.pizza_delivery.payment.dto;
import lombok.Data;
import javax.validation.constraints.NotNull;
@Data
public class PaymentDto {

    @NotNull(message = "Please enter valid amount")
    private Double amount;
    @NotNull(message = "Please enter valid paymentMethod")
    private String paymentMethod;
    @NotNull(message = "Please enter valid userId")
    private String userId;
    @NotNull(message = "Please enter valid order Id")
    private String orderId;
}
