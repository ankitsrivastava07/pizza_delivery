package com.pizza_delivery.payment.dao.repository.entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "payment")
@Data
public class PaymentEntity {
    @Id
    private String id;
    private String paymentMethod;
    private String transactionId;
    private Double amount;
    private String orderId;
    private String userId;
    private String status;
}
