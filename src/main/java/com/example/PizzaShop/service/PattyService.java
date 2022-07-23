package com.example.PizzaShop.service;


import com.example.PizzaShop.dto.PattyDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PattyService {

    PattyDTO addPatty(PattyDTO pattyDTO);
    List<PattyDTO> getAll();
    PattyDTO findById(String id);
    PattyDTO deletePatty(String idPatty);
}
