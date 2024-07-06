package com.example.mapstruct_learn.mapper;

import com.example.mapstruct_learn.entiy.Car;
import com.example.mapstruct_learn.entiy.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PojoMapper {

    PojoMapper INSTANCE = Mappers.getMapper(PojoMapper.class);

    // 最基础的转换，通过source和target指定字段映射，如果字段名相同会有默认映射
    @Mapping(source = "numberOfSeats", target = "seatCount")
    // 通过expression指定java代码,可以在转换时执行一些特殊操作
    @Mapping(target = "time", expression = "java(new java.util.Date().getTime())")
    CarDto carToCarDto(Car car);

}
