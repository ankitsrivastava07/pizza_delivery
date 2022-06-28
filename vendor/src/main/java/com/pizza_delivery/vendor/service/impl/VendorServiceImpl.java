package com.pizza_delivery.vendor.service.impl;
import com.pizza_delivery.vendor.convertor.ObjectConvertor;
import com.pizza_delivery.vendor.dao.VendorDao;
import com.pizza_delivery.vendor.dao.repository.entity.VendorEntity;
import com.pizza_delivery.vendor.dto.ApiResponse;
import com.pizza_delivery.vendor.dto.VendorCreateDto;
import com.pizza_delivery.vendor.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class VendorServiceImpl implements VendorService {
    @Autowired VendorDao vendorDao;
    @Override
    public ApiResponse addVendor(VendorCreateDto vendorCreateDto) {
        Map<? ,?> map = vendorCreateDto.getFoodMenu();
        VendorEntity entity = ObjectConvertor.dtoToEntity(vendorCreateDto , VendorEntity.class);
         entity = vendorDao.addVendor(entity);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Successfully saved");
        apiResponse.setData(entity);
        apiResponse.setStatus(Boolean.TRUE);
         return apiResponse;
    }
}
