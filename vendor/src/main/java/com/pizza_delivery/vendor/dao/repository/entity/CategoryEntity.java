package com.pizza_delivery.vendor.dao.repository.entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "category")
public class CategoryEntity {
    @Id
    private String id;
    private String name;
    private String title;
    private String description;
}
