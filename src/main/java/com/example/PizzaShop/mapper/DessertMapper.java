package com.example.PizzaShop.mapper;

import com.example.PizzaShop.dto.DessertDTO;
import com.example.PizzaShop.entity.Dessert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DessertMapper {

    DessertMapper INSTANCE = Mappers.getMapper(DessertMapper.class);

    Dessert toEntity(DessertDTO dessertDTO);

    DessertDTO toDTO(Dessert dessert);

}
