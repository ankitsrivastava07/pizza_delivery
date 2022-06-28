package com.pizza_delivery.user.controller;
import com.pizza_delivery.user.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public ResponseEntity<?> get(){
        return new ResponseEntity<>("Successfully api called " , HttpStatus.ACCEPTED);
    }

    @GetMapping("/{userName}")
    public ResponseEntity<?> getUser(@PathVariable String userName) throws Exception {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Successfully api called");
        apiResponse.setData(userName);
        apiResponse.setStatus(Boolean.TRUE);
      //  Thread.sleep(9000);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
