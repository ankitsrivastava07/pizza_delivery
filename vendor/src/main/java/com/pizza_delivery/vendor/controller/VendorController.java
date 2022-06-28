package com.pizza_delivery.vendor.controller;
import com.pizza_delivery.vendor.dto.VendorCreateDto;
import com.pizza_delivery.vendor.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
public class VendorController {
    @Autowired VendorService vendorService;

    @PostMapping("/create")
    public ResponseEntity<?> addVendor(@RequestBody VendorCreateDto vendorCreateDto){
       return new ResponseEntity<>(vendorService.addVendor(vendorCreateDto) , HttpStatus.CREATED);
    }

    @GetMapping("/{vendorId}")
    public ResponseEntity<?> findById(@PathVariable String vendorId){
        return new ResponseEntity<>("Success " , HttpStatus.CREATED);
    }

}
