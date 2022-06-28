package com.pizza_delivery.vendor.dao.repository.entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;
import java.util.Random;
@Data
@Document(collection = "vendor")
public class VendorEntity {
    @Id
    private String id;
    private String fullName;
    private Map<String , List<FoodEntity>> foodMenu;
    private AddressEntity address;
    private String mobile;
    private String email;
    private String password;
}
