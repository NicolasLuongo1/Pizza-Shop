package com.example.PizzaShop.service;


import com.example.PizzaShop.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    UserDTO addUser(UserDTO userDTO);
    List<UserDTO> getAll();
    UserDTO findById(String id);

}
