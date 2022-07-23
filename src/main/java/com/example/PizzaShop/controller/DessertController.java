package com.example.PizzaShop.controller;

import com.example.PizzaShop.dto.DessertDTO;
import com.example.PizzaShop.service.DessertService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/dessertController")
public class DessertController {

    private static final Log LOG = LogFactory.getLog(DessertController.class);

    @Autowired
    DessertService dessertService;




    @PostMapping("/addDessert")
    public DessertDTO addDessert(@RequestBody DessertDTO dessertDTO){

        LOG.info("The dessert is: " + dessertDTO);

        dessertService.addDessert(dessertDTO);

        return dessertDTO;
    }

    @GetMapping("/getAllJson")
    public List<DessertDTO> getAll(){

        LOG.info("The list of dessert is: " + dessertService.getAll());

        return dessertService.getAll();

    }

    @GetMapping("/deleteDessert/{idDessert}")
    public DessertDTO deleteDessert(@PathVariable (value = "idDessert") String idDessert){


        return dessertService.deleteDessert(idDessert);

    }

}
