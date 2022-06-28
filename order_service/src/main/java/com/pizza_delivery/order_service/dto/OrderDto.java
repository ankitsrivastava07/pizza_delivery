package com.pizza_delivery.order_service.dto;
import com.pizza_delivery.order_service.annotation.ListNotEmptyField;
import com.pizza_delivery.order_service.annotation.ListNotNull;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
@Data
public class OrderDto {

    @ListNotNull(message = "productId can not be null")
    @ListNotEmptyField
    private List<String> productId;
    @NotBlank(message = "Please enter valid user Id")
    private String userId;
    @NotBlank(message = "Please enter valid category slug name")
    private String categorySlugName;
    @NotNull(message = "Please enter valid quantity ")
    private Integer quantity;
    @NotBlank(message = "Please enter valid size ")
    private String size;
    @NotNull(message = "Please enter order type")
    private String type;
    private AddressDto addressDto;
}
