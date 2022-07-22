package com.example.PizzaShop.service;


import com.example.PizzaShop.dto.PizzaDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PizzaService {

    PizzaDTO addPizza(PizzaDTO pizzaDTO);
    List<PizzaDTO> getAll();
    PizzaDTO findById(String id);

}
