package com.pizza_delivery.payment.service.impl;
import com.pizza_delivery.payment.convertor.ObjectConvertor;
import com.pizza_delivery.payment.dao.PaymentDao;
import com.pizza_delivery.payment.dao.repository.entity.PaymentEntity;
import com.pizza_delivery.payment.dto.ApiResponse;
import com.pizza_delivery.payment.dto.PaymentDto;
import com.pizza_delivery.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;
import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired PaymentDao paymentDao;
    @Override
    public ApiResponse debitAmount(PaymentDto paymentDto) {
        PaymentEntity payment = ObjectConvertor.convert(paymentDto,PaymentEntity.class);
        Map<String, String> payLoad = new HashMap<>();
        payLoad.put("orderId", paymentDto.getOrderId());

        Mono<ApiResponse> mono = WebClient
                .create()
                .post()
                .uri("http://localhost:8087/ship/deliver-to")
                .bodyValue(payLoad)
                .retrieve()
                .bodyToMono(ApiResponse.class);
        ApiResponse response = mono.block();
           response.setStatus(Boolean.FALSE);
           response.setMessage("Validation failed");
            payment.setStatus("Roll Back ");
            payment = paymentDao.debitPayment(payment);
            return response;
    }

    @Override
    public void revertPayment(PaymentDto paymentDto) {
        PaymentEntity payment = ObjectConvertor.convert(paymentDto,PaymentEntity.class);
        payment.setStatus("Payment Reverted");
         paymentDao.revertPayment(payment);
    }
}
