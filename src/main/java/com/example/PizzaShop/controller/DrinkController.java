package com.example.PizzaShop.controller;

import com.example.PizzaShop.dto.DrinkDTO;
import com.example.PizzaShop.service.DrinkService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/drinkController")
public class DrinkController {

    private static final Log LOG = LogFactory.getLog(DrinkController.class);

    @Autowired
    DrinkService drinkService;

    @PostMapping("/addDrink")
    public DrinkDTO addDrink (@RequestBody DrinkDTO drinkDTO){

        drinkService.addDrink(drinkDTO);

        LOG.info("The drink add is: " + drinkDTO);

        return drinkDTO;
    }

    @GetMapping("/getAllJson")
    public List<DrinkDTO> getAll(){

        LOG.info("the list of Drink is: "+ drinkService.getAll());

        return drinkService.getAll();
    }

    @GetMapping("/deleteDrink/{idDrink}")
    public DrinkDTO deleteDrink(@PathVariable(value = "idDrink") String idDrink){

        return drinkService.deleteDrink(idDrink);

    }


}
