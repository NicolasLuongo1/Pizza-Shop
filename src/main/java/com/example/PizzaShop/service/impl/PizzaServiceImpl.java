package com.example.PizzaShop.service.impl;

import com.example.PizzaShop.dto.FoodDTO;
import com.example.PizzaShop.dto.PizzaDTO;
import com.example.PizzaShop.entity.Pizza;
import com.example.PizzaShop.mapper.PizzaMapper;
import com.example.PizzaShop.repository.PizzaRepository;
import com.example.PizzaShop.service.PizzaService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    PizzaRepository pizzaRepository;

    PizzaMapper INSTANCE = Mappers.getMapper(PizzaMapper.class);

    @Override
    public PizzaDTO addPizza(PizzaDTO pizzaDTO) {

        pizzaRepository.save(INSTANCE.toEntity(pizzaDTO));

        return pizzaDTO;
    }

    @Override
    public List<PizzaDTO> getAll() {
        return null;
    }

    @Override
    public PizzaDTO findById(String id) {

        Optional<Pizza> op = pizzaRepository.findById(id); // guardo el obj en un optional, puede venir lleno o nulo

       return op.isPresent() ? INSTANCE.toDTO(op.get()):new PizzaDTO(); // si viene llego lo convierto a DTO, sino creo un DTO y lo devuelvo

    }

    @Override
    public PizzaDTO deletePizza(String pizzaId) {

        PizzaDTO pizzaDTO = findById(pizzaId);

        pizzaRepository.delete(INSTANCE.toEntity(pizzaDTO));


        return null;
    }
}
