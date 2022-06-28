package com.pizza_delivery.shipping.exception;
import com.pizza_delivery.shipping.dto.api.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

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
}
