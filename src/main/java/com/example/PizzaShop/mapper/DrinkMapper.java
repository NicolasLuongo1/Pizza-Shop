package com.example.PizzaShop.mapper;

import com.example.PizzaShop.dto.DrinkDTO;
import com.example.PizzaShop.entity.Drink;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DrinkMapper {

    DrinkMapper INSTANCE = Mappers.getMapper(DrinkMapper.class);

    Drink toEntity(DrinkDTO drinkDTO);

    DrinkDTO toDTO(Drink drink);

}
