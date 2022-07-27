package com.example.PizzaShop.controller;

import com.example.PizzaShop.dto.DessertDTO;
import com.example.PizzaShop.service.DessertService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


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
/*
    @GetMapping("/deleteDessertt/{idDessert}")
    public DessertDTO deleteDessert(@PathVariable (value = "idDessert") String idDessert){


        return dessertService.deleteDessert(idDessert);

    }
*/
    // TODO ================================== for templates ==================================================

    @GetMapping("/addProduct")
    public ModelAndView product(){

        ModelAndView modelAndView = new ModelAndView("addDessert");

        modelAndView.addObject("dessert", new DessertDTO());
        LOG.info("the view is : "+ modelAndView);


        return modelAndView;
    }

    @PostMapping("/add")
    public RedirectView add(@ModelAttribute("dessert") DessertDTO dessertDTO){

        RedirectView redirectView = new RedirectView("/dessertController/findAll");
        dessertService.addDessert(dessertDTO);

        return redirectView ;
    }

    @GetMapping("/findAll")
    public ModelAndView findAll(){

        ModelAndView modelAndView = new ModelAndView("listDessert");
        modelAndView.addObject("listDessert",dessertService.getAll());

        return modelAndView;
    }

    @GetMapping("/deleteDessert/{id}")
    public RedirectView redirectView(@PathVariable(value = "id") String id){

        LOG.info("entre al deleteDessert");

        RedirectView redirectView = new RedirectView("/dessertController/findAll");
        dessertService.deleteDessert(id);

        return redirectView;
    }




}
