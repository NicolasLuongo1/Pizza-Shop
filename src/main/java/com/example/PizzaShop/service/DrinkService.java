package com.example.PizzaShop.service;


import com.example.PizzaShop.dto.DrinkDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DrinkService {

    DrinkDTO addDrink(DrinkDTO drinkDTO);
    List<DrinkDTO> getAll();
    DrinkDTO findById(String id);
    DrinkDTO deleteDrink(String idDrink);
}
