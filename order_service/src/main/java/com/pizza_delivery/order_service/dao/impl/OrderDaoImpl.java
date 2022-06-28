package com.pizza_delivery.order_service.dao.impl;
import com.pizza_delivery.order_service.dao.OrderDao;
import com.pizza_delivery.order_service.dao.repository.OrderRepository;
import com.pizza_delivery.order_service.dao.repository.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl implements OrderDao {
    @Autowired OrderRepository orderRepository;
    @Override
    public OrderEntity save(OrderEntity orderEntity) {
        return orderRepository.save(orderEntity);
    }
}
