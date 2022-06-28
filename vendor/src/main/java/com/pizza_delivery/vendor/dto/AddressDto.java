package com.pizza_delivery.vendor.dto;

import lombok.Data;

@Data
public class AddressDto {

    private String addressLine1;
    private String landMark;
    private String city;
    private String state;
    private String country;
    private String pincode;

}
