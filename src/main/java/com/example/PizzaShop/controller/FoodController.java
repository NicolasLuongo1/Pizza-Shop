package com.example.PizzaShop.controller;

import com.example.PizzaShop.dto.FoodDTO;
import com.example.PizzaShop.service.FoodService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/foodController")
public class FoodController {

    @Autowired
    FoodService foodService;

    private final static Log LOG = LogFactory.getLog(PattyController.class);

    //====================================================================

    @PostMapping("/addFoodJson")
    public void addFood(@RequestBody FoodDTO foodDTO) {

        LOG.info("la comida es:" + foodDTO);
        foodService.addFood(foodDTO);

        return;
    }

    @GetMapping("/getAllJson")
    public List<FoodDTO> getAllJson(){

        return foodService.getAll();
    }

    //==================================================================


}
