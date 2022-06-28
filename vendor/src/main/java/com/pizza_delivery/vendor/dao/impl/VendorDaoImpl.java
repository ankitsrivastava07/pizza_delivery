package com.pizza_delivery.vendor.dao.impl;
import com.pizza_delivery.vendor.dao.VendorDao;
import com.pizza_delivery.vendor.dao.repository.entity.VendorEntity;
import com.pizza_delivery.vendor.dao.repository.entity.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class VendorDaoImpl implements VendorDao {
    @Autowired
    private VendorRepository vendorRepository;
    @Override
    public VendorEntity addVendor(VendorEntity vendorEntity) {
        return vendorRepository.save(vendorEntity);
    }
}
