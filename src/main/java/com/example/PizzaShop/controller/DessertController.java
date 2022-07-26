package com.example.PizzaShop.controller;

import com.example.PizzaShop.dto.DessertDTO;
import com.example.PizzaShop.service.DessertService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



import java.util.List;


@RestController
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

    @GetMapping("/addProductos")
    public ModelAndView productos(){

        ModelAndView modelAndView = new ModelAndView("addProduct");
        LOG.info("La vista es: "+ modelAndView);
        modelAndView.addObject("dessert", new DessertDTO());
        LOG.info("La vista ahora es: "+ modelAndView);

        LOG.info("el estado de la vista es: " + modelAndView.getStatus() );
        LOG.info("el diagnostico de la vista es: " + modelAndView);
        LOG.info("el vista devuelta es: " + modelAndView.getView() );

        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView addPss(){
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }

}
