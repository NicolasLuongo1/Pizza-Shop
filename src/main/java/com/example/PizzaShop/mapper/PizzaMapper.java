package com.example.PizzaShop.mapper;

import com.example.PizzaShop.dto.PizzaDTO;
import com.example.PizzaShop.entity.Pizza;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PizzaMapper {

    PizzaMapper INSTANCE = Mappers.getMapper(PizzaMapper.class);

    Pizza toEntity (PizzaDTO pizzaDTO);

    PizzaDTO toDTO(Pizza pizza);

}
