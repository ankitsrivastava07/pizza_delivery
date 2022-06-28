package com.pizza_delivery.vendor.convertor;

import org.modelmapper.ModelMapper;

public class ObjectConvertor {
    private static final ModelMapper mapper = new ModelMapper();

    public static  <D> D dtoToEntity(Object source , Class<D> target){
      return mapper.map(source,target);
    }
}
