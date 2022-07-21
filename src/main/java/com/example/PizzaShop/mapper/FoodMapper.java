package com.example.PizzaShop.mapper;

import com.example.PizzaShop.dto.FoodDTO;
import com.example.PizzaShop.entity.Food;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FoodMapper {

    FoodMapper INSTANCE = Mappers.getMapper(FoodMapper.class);

    Food toEntity(FoodDTO foodDTO);

    FoodDTO toDTO(Food food);

}
