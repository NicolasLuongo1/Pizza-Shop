package com.example.PizzaShop.service.impl;

import com.example.PizzaShop.dto.FoodDTO;
import com.example.PizzaShop.entity.Food;
import com.example.PizzaShop.mapper.FoodMapper;
import com.example.PizzaShop.repository.FoodRepository;
import com.example.PizzaShop.service.FoodService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    FoodRepository foodRepository;

    private final static Log LOG = LogFactory.getLog(FoodServiceImpl.class);

    FoodMapper INSTANCE = Mappers.getMapper(FoodMapper.class);


    @Override
    public FoodDTO addFood(FoodDTO foodDTO) {

        foodRepository.save(INSTANCE.toEntity(foodDTO));

        LOG.info("the entity food is:" + INSTANCE.toEntity(foodDTO));

        return foodDTO;
    }

    @Override
    public List<FoodDTO> getAll() {

        List<Food> listFoodEntity = foodRepository.findAll();

        LOG.info("The list of entities is: " + listFoodEntity);
        List<FoodDTO> listFoodDTO = new ArrayList<>();

        listFoodEntity.forEach(x-> listFoodDTO.add(INSTANCE.toDTO(x)));

        LOG.info("The list of DTO is: " + listFoodDTO);

        return listFoodDTO;
    }

    @Override
    public FoodDTO deleteFood(String id) {

        FoodDTO foodDTO = findById(id);
        foodRepository.delete(INSTANCE.toEntity(foodDTO));

        return foodDTO;
    }


    @Override
    public FoodDTO findById(String id) {

        Optional<Food> optionalFood = foodRepository.findById(id);

        return optionalFood.isPresent() ? INSTANCE.toDTO(optionalFood.get()) : new FoodDTO();
    }
}
