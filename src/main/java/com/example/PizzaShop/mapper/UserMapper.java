package com.example.PizzaShop.mapper;

import com.example.PizzaShop.dto.UserDTO;
import com.example.PizzaShop.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toEntity(UserDTO userDTO);

    UserDTO toDTO(User user);

}
