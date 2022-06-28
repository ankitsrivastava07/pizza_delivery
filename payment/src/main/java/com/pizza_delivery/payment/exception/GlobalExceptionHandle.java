package com.pizza_delivery.payment.exception;
import com.pizza_delivery.payment.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.function.client.WebClientRequestException;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@ControllerAdvice
public class GlobalExceptionHandle {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> methodArgumentNotValidException(MethodArgumentNotValidException exception){
        ApiResponse response = new ApiResponse();
        response.setMessage("Validation Failed");
        response.setStatus(Boolean.FALSE);
        //response.setError();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(WebClientResponseException.BadRequest.class)
    public ResponseEntity<?> badRequestException(WebClientResponseException.BadRequest exception){
        ApiResponse apiResponse = new ApiResponse();
         apiResponse.setStatus(Boolean.FALSE);
         apiResponse.setMessage("Validation Failed");
        return new ResponseEntity<>(apiResponse , HttpStatus.BAD_REQUEST);
    }
}
