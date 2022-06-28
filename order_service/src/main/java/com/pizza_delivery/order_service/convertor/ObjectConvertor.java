package com.pizza_delivery.order_service.convertor;
import org.modelmapper.ModelMapper;

public class ObjectConvertor {
    private static ModelMapper mapper = null;

    static {
        if(mapper == null)
            mapper = new ModelMapper();
    }

    private ObjectConvertor(){}

    public static <D> D convert(Object source , Class<D> target){
       return mapper.map(source , target);
    }

}
