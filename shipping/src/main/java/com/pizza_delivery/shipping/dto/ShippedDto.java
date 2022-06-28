package com.pizza_delivery.shipping.dto;
import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class ShippedDto {
    @NotNull(message = "Please enter valid addressLine1")
    @Size(min = 5 , max = 1024)
    private String addressLine1;
    private String landMark;
    @NotNull(message = "Please enter valid city")
    private String city;
    @NotNull(message = "Please enter valid pincode")
    private String pincode;
    @NotNull(message = "Please enter valid state")
    private String state;
    @NotNull(message = "Please enter valid country")
    private String country;
    @NotNull(message = "Please enter valid shippedTo ")
    private String shippedTo;
    @NotNull(message = "Please enter valid fromUserId ")
    private String orderId;
}
