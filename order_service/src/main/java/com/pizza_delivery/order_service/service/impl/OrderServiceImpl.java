package com.pizza_delivery.order_service.service.impl;
import com.pizza_delivery.order_service.constant.PizzaDelivery;
import com.pizza_delivery.order_service.convertor.ObjectConvertor;
import com.pizza_delivery.order_service.dao.OrderDao;
import com.pizza_delivery.order_service.dao.repository.entity.OrderEntity;
import com.pizza_delivery.order_service.dto.OrderDto;
import com.pizza_delivery.order_service.dto.PaymentDto;
import com.pizza_delivery.order_service.dto.api.ApiResponse;
import com.pizza_delivery.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired OrderDao orderDao;
    @Override
    public ApiResponse info(){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Success");
        apiResponse.setStatus(Boolean.TRUE);
        return apiResponse;
    }
    @Override
    //@Transactional
    public ApiResponse create(OrderDto orderDto) {

        ApiResponse response = new ApiResponse();
        OrderEntity order = new OrderEntity();
        order.setStatus(PizzaDelivery.ORDER_STATUS_CREATED);
        order.setType(PizzaDelivery.ORDER_TYPE_CASH_ON_DELIVERY);
        order = orderDao.save(ObjectConvertor.convert(orderDto, OrderEntity.class));

        Map<Object , Object> payLoad = new HashMap<>();
        payLoad.put("amount" , 450d);
        payLoad.put("userId" , orderDto.getUserId());
        payLoad.put("paymentMethod" , "UPI");
        payLoad.put("userId" , "UPI");
        payLoad.put("orderId" , "845894");

        try {

            Mono<ApiResponse> mono = WebClient
                    .create()
                    .post()
                    .uri("http://localhost:8086/payment/debit")
                    .bodyValue(payLoad)
                    .retrieve()
                    .bodyToMono(ApiResponse.class);

            ApiResponse apiResponse =  mono.block();
            response.setMessage("Successfully order created");
            response.setStatus(Boolean.TRUE);
            response.setData(order);
            response.setPaymentUrl("http://localhost:8086/payment");
            return response;
        }catch (WebClientResponseException.BadRequest ex) {
            order.setType(PizzaDelivery.ORDER_TYPE_CASH_ON_DELIVERY);
            order.setStatus(PizzaDelivery.ORDER_STATUS_CANCEL);
            order = orderDao.save(order);
            response.setData(order);
            response.setMessage("Something went wrong your has been cancelled. Please try again later");
            response.setStatus(Boolean.FALSE);
            return response;
        }
    }
}
