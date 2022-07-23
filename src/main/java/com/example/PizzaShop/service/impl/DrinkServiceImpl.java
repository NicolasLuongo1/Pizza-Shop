package com.example.PizzaShop.service.impl;

import com.example.PizzaShop.dto.DrinkDTO;
import com.example.PizzaShop.entity.Drink;
import com.example.PizzaShop.mapper.DrinkMapper;
import com.example.PizzaShop.repository.DrinkRepository;
import com.example.PizzaShop.service.DrinkService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class DrinkServiceImpl implements DrinkService {

    private static final Log LOG = LogFactory.getLog(DrinkServiceImpl.class);

    @Autowired
    DrinkRepository drinkRepository;

    DrinkMapper INSTANCE = Mappers.getMapper(DrinkMapper.class);

    @Override
    public DrinkDTO addDrink(DrinkDTO drinkDTO) {

        drinkRepository.save(INSTANCE.toEntity(drinkDTO));

        LOG.info("the drink add is : " + drinkDTO);

        return drinkDTO;
    }

    @Override
    public List<DrinkDTO> getAll() {

        List<Drink> drinkList = drinkRepository.findAll();

        List<DrinkDTO> drinkDTOS = new ArrayList<>();

        drinkList.forEach(x->drinkDTOS.add(INSTANCE.toDTO(x)));

        return drinkDTOS;
    }

    @Override
    public DrinkDTO findById(String id) {

        Optional<Drink> op = drinkRepository.findById(id);

        return op.isPresent() ? INSTANCE.toDTO(op.get()) : new DrinkDTO();

    }

    @Override
    public DrinkDTO deleteDrink(String idDrink) {

        DrinkDTO drinkDTO = findById(idDrink);

        drinkRepository.delete(INSTANCE.toEntity(drinkDTO));

        return drinkDTO;
    }
}
