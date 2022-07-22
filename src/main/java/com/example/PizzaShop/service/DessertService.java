package com.example.PizzaShop.service;

import com.example.PizzaShop.dto.DessertDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DessertService {

    DessertDTO addDessert(DessertDTO dessertDTO);
    List<DessertDTO> getAll();
    DessertDTO findById(String id);

}
