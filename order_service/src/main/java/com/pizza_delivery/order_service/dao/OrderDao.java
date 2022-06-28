package com.pizza_delivery.order_service.dao;
import com.pizza_delivery.order_service.dao.repository.entity.OrderEntity;
public interface OrderDao {
    OrderEntity save(OrderEntity orderEntity);
}
