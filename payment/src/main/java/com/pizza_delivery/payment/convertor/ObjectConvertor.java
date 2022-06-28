package com.pizza_delivery.payment.convertor;
import org.modelmapper.ModelMapper;
public class ObjectConvertor {
    private static final ModelMapper mapper = new ModelMapper();
    public static <D> D convert(Object source , Class<D> target){
        mapper.getConfiguration().setAmbiguityIgnored(Boolean.TRUE);
        return mapper.map(source,target);
    }
}
