package com.pizza_delivery.order_service.dao.repository.entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
@Document(collection = "order")
@Data
public class OrderEntity {
    @Id
    private String id;
    private List<String> productId;
    private String userId;
    private String categorySlugName;
    private Double price;
    private Integer quantity;
    private String size;
    private String type;
    private String status;
}
