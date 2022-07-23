package com.example.PizzaShop.service.impl;

import com.example.PizzaShop.dto.DessertDTO;
import com.example.PizzaShop.entity.Dessert;
import com.example.PizzaShop.mapper.DessertMapper;
import com.example.PizzaShop.repository.DessertRepository;
import com.example.PizzaShop.service.DessertService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DessertServiceImpl implements DessertService {

    private static final Log LOG = LogFactory.getLog(DessertServiceImpl.class);

    @Autowired
    DessertRepository dessertRepository;

    DessertMapper INSTANCE = Mappers.getMapper(DessertMapper.class);


    @Override
    public DessertDTO addDessert(DessertDTO dessertDTO) {


        dessertRepository.save(INSTANCE.toEntity(dessertDTO));

        LOG.info("DessertDTO add is:" + dessertDTO);

        return dessertDTO;
    }

    @Override
    public List<DessertDTO> getAll() {

        List<Dessert> dessertList = dessertRepository.findAll();
        List<DessertDTO> dessertDTOList = new ArrayList<>();

        dessertList.forEach(x-> dessertDTOList.add(INSTANCE.toDTO(x)));

        return dessertDTOList;
    }

    @Override
    public DessertDTO findById(String id) {

        Optional<Dessert> op = dessertRepository.findById(id);

        return op.isPresent() ? INSTANCE.toDTO(op.get()) : new DessertDTO();
    }

    @Override
    public DessertDTO deleteDessert(String idDessert) {

        DessertDTO dessertDTO = findById(idDessert);
        dessertRepository.delete(INSTANCE.toEntity(dessertDTO));

        return dessertDTO;
    }
}
