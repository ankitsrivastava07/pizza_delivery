package com.pizza_delivery.vendor.dto;
import lombok.Data;
import java.io.File;
import java.util.Date;
import java.util.List;

@Data
public class FssaiDto {
    private File license;
    private List<String> kindOfBusiness;
    private Date issueDate;
    private Date expiraryDate;
    private Double price;
    private String type;
    private String licenseNumber;
}
