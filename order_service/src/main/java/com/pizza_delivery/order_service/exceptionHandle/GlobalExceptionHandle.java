package com.pizza_delivery.order_service.exceptionHandle;
import com.pizza_delivery.order_service.constant.PizzaDelivery;
import com.pizza_delivery.order_service.dto.api.ApiResponse;
import com.pizza_delivery.order_service.dto.error.FieldValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandle {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> exceptionHandle(MethodArgumentNotValidException exception){

        ApiResponse response = new ApiResponse();
        response.setMessage(PizzaDelivery.VALIDATION_FAILED);
        response.setStatus(Boolean.FALSE);
        response.setError(FieldValidator.getFieldErrors(exception.getFieldErrors()));
        return new ResponseEntity<>(response , HttpStatus.BAD_REQUEST);
    }
}
