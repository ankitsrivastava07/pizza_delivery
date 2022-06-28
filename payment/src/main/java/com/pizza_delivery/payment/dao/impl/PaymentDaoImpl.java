package com.pizza_delivery.payment.dao.impl;
import com.pizza_delivery.payment.dao.PaymentDao;
import com.pizza_delivery.payment.dao.repository.PaymentRepository;
import com.pizza_delivery.payment.dao.repository.entity.PaymentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDaoImpl implements PaymentDao {
    @Autowired PaymentRepository paymentRepository;
    @Override
    public PaymentEntity revertPayment(PaymentEntity paymentEntity){
        return paymentRepository.save(paymentEntity);
    }

    @Override
    public PaymentEntity debitPayment(PaymentEntity payment) {
        return paymentRepository.save(payment);
    }
}
