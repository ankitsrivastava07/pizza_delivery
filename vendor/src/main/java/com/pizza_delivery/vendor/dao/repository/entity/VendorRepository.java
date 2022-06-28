package com.pizza_delivery.vendor.dao.repository.entity;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface VendorRepository extends MongoRepository<VendorEntity , String> {
}
