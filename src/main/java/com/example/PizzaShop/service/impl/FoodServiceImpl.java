package com.example.PizzaShop.service.impl;

import com.example.PizzaShop.dto.FoodDTO;
import com.example.PizzaShop.mapper.FoodMapper;
import com.example.PizzaShop.repository.FoodRepository;
import com.example.PizzaShop.service.FoodService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    FoodRepository foodRepository;

    private final static Log LOG = LogFactory.getLog(FoodServiceImpl.class);

    FoodMapper INSTANCE = Mappers.getMapper(FoodMapper.class);


    @Override
    public FoodDTO addFood(FoodDTO foodDTO) {


        //Aca llega y abajo se rompe

        LOG.info("La entidad es:" + INSTANCE.toEntity(foodDTO));
        // no creo pero ahi va

        foodRepository.save(INSTANCE.toEntity(foodDTO)); // aca se hace mierda

        LOG.info("La entidad es:" + INSTANCE.toEntity(foodDTO));


        return foodDTO;
    }

    @Override
    public List<FoodDTO> getAll() {
        return null;
    }

    @Override
    public FoodDTO findById(String id) {
        return null;
    }
}
