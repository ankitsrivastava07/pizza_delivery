package com.pizza_delivery.payment.dao.repository;
import com.pizza_delivery.payment.dao.repository.entity.PaymentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<PaymentEntity, String> {
}
