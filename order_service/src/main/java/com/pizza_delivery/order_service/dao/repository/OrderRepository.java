package com.pizza_delivery.order_service.dao.repository;
import com.pizza_delivery.order_service.dao.repository.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface OrderRepository extends MongoRepository<OrderEntity,String> {

}
