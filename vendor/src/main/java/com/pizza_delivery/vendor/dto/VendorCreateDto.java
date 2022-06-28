package com.pizza_delivery.vendor.dto;
import com.pizza_delivery.vendor.dao.repository.entity.FoodEntity;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Map;
@Data
public class VendorCreateDto {

    private String mobile;
    private String fullName;
    Map<String ,List<FoodEntity>> foodMenu;
    private String email;
    private String password;
    private AddressDto addressDto;
    //private FssaiDto fssaiDto;
}
