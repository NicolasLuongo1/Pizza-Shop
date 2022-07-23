package com.example.PizzaShop.service.impl;

import com.example.PizzaShop.dto.PattyDTO;
import com.example.PizzaShop.entity.Patty;
import com.example.PizzaShop.mapper.PattyMapper;
import com.example.PizzaShop.repository.PattyRepository;
import com.example.PizzaShop.service.PattyService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class PattyServiceImpl implements PattyService {


    private static final Log LOG = LogFactory.getLog(PattyServiceImpl.class);

    @Autowired
    PattyRepository pattyRepository;


    PattyMapper INSTANCE = Mappers.getMapper(PattyMapper.class);

    @Override
    public PattyDTO addPatty(PattyDTO pattyDTO) {

        pattyRepository.save(INSTANCE.toEntity(pattyDTO));


        return pattyDTO;
    }

    @Override
    public List<PattyDTO> getAll() {

        List<Patty> pattyList = pattyRepository.findAll();

        List<PattyDTO> pattyDTOS = new ArrayList<>();

        pattyList.forEach(x-> pattyDTOS.add(INSTANCE.toDTO(x)));


        return pattyDTOS;
    }

    @Override
    public PattyDTO findById(String id) {

        Optional<Patty> op = pattyRepository.findById(id);

        return op.isPresent() ? INSTANCE.toDTO(op.get()) : new PattyDTO();

    }

    @Override
    public PattyDTO deletePatty(String idPatty) {

        PattyDTO pattyDTO = findById(idPatty);
        pattyRepository.delete(INSTANCE.toEntity(pattyDTO));

        return pattyDTO;
    }
}
