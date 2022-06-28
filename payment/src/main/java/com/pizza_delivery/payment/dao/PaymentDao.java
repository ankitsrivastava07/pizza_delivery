package com.pizza_delivery.payment.dao;
import com.pizza_delivery.payment.dao.repository.entity.PaymentEntity;
public interface PaymentDao {
    PaymentEntity revertPayment(PaymentEntity payment);

    PaymentEntity debitPayment(PaymentEntity payment);
}
