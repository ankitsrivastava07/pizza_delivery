package com.pizza_delivery.payment.service;
import com.pizza_delivery.payment.dto.ApiResponse;
import com.pizza_delivery.payment.dto.PaymentDto;
public interface PaymentService {
    ApiResponse debitAmount(PaymentDto paymentDto);
    void revertPayment(PaymentDto paymentDto);
}
