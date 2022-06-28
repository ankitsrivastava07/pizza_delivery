package com.pizza_delivery.shipping.controller;
import com.pizza_delivery.shipping.dto.ShippedDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping("/ship")
@RestController
public class ShippedController {

    @PostMapping("/deliver-to")
    public ResponseEntity<?> shipTo(@RequestBody @Valid ShippedDto shippedDto){
        return new ResponseEntity<>("Success" , HttpStatus.CREATED);
    }
}
