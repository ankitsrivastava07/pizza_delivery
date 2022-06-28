package com.pizza_delivery.vendor.service;
import com.pizza_delivery.vendor.dto.ApiResponse;
import com.pizza_delivery.vendor.dto.VendorCreateDto;
public interface VendorService {
    ApiResponse addVendor(VendorCreateDto vendorCreateDto);
}
