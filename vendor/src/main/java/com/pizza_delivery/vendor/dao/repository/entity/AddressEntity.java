package com.pizza_delivery.vendor.dao.repository.entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "address")
public class AddressEntity {
    @Id
    private String id;
    private String addressLine1;
    private String landMark;
    private String city;
    private String state;
    private String country;
    private String pincode;
}
