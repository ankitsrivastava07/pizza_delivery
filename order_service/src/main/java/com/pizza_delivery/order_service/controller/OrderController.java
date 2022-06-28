package com.pizza_delivery.order_service.controller;
import com.pizza_delivery.order_service.dto.OrderDto;
import com.pizza_delivery.order_service.dto.api.ApiResponse;
import com.pizza_delivery.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/info")
    public ResponseEntity<?> info(HttpServletRequest request){
      ApiResponse response = orderService.info();
       response.setData(request.getRequestURI());
       response.setMessage("Success");
       return new ResponseEntity(response , HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createOrder(@RequestBody @Valid OrderDto orderDto){
        ApiResponse response = orderService.create(orderDto);
        return new ResponseEntity<>(response , HttpStatus.CREATED);
    }

    @GetMapping("/cancel/{orderId}")
    public ResponseEntity<?> cancelOrder(@PathVariable String orderId){
         return new ResponseEntity<>("" ,HttpStatus.CREATED);
    }


}
