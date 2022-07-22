package com.example.PizzaShop.service;


import com.example.PizzaShop.dto.FoodDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FoodService {

    FoodDTO addFood(FoodDTO foodDTO);
    List<FoodDTO> getAll();
    FoodDTO findById(String id);

}
