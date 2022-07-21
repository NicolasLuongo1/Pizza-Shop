package com.example.PizzaShop.mapper;

import com.example.PizzaShop.dto.PattyDTO;
import com.example.PizzaShop.entity.Patty;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PattyMapper {

    PattyMapper INSTANCE = Mappers.getMapper(PattyMapper.class);

    Patty toEntity(PattyDTO pattyDTO);

    PattyDTO toDTO(Patty patty);


}
