package com.example.PizzaShop.controller;

import com.example.PizzaShop.dto.PattyDTO;
import com.example.PizzaShop.service.PattyService;
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
@RequestMapping("/pattyController")
public class PattyController {

    @Autowired
    PattyService pattyService;

    private final static Log LOG = LogFactory.getLog(PattyController.class);

    //====================================================================

    @PostMapping("/addPattyJson")
    public void addPatty(@RequestBody PattyDTO pattyDTO) {

        LOG.info("la empanada es:" + pattyDTO);
        pattyService.addPatty(pattyDTO);

        return;
    }

    @GetMapping("/getAllJson")
    public List<PattyDTO> getAllJson(){

        return pattyService.getAll();
    }

    //==================================================================

}
