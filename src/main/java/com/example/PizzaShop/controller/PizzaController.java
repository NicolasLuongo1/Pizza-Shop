package com.example.PizzaShop.controller;

import com.example.PizzaShop.dto.PizzaDTO;
import com.example.PizzaShop.service.PizzaService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pizzaController")
public class PizzaController {

    @Autowired
    PizzaService pizzaService;

    private final static Log LOG = LogFactory.getLog(PizzaController.class);

    //====================================================================

    @PostMapping("/addPizzaJson")
    public void addPizza(@RequestBody PizzaDTO pizzaDTO) {

        LOG.info("the pizza is:" + pizzaDTO);
        pizzaService.addPizza(pizzaDTO);

        return;
    }

    @GetMapping("/getAllJson")
    public List<PizzaDTO> getAllJson(){

        return pizzaService.getAll();
    }

    @GetMapping("/deletePizzaJson/{pizzaId}")
    public PizzaDTO deletePizza(@PathVariable(value = "pizzaId") String pizzaId){

        return pizzaService.deletePizza(pizzaId);
    }


}
