package com.pizza_delivery.payment.controller;
import com.pizza_delivery.payment.dto.PaymentDto;
import com.pizza_delivery.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import javax.validation.Valid;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired PaymentService paymentService;

    @PostMapping("/debit")
    public ResponseEntity<?> debitAmount(@RequestBody @Valid PaymentDto paymentDto){
       try {
           paymentService.debitAmount(paymentDto);
           return null;
       }catch (WebClientResponseException.BadRequest exception){
           paymentService.revertPayment(paymentDto);
           return new ResponseEntity<>("Validation Failed" , HttpStatus.BAD_REQUEST);
       }
    }

}
