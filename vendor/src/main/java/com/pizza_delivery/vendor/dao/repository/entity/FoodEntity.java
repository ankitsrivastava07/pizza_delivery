package com.pizza_delivery.vendor.dao.repository.entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "food")
public class FoodEntity {
    @Id
    private String id;
    private String name;
    private String description;
    private String chef;
    private List<String> ingredient;
    private Double price;
    private String currencyType;
}
