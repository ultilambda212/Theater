package com.example.theater.service.impl;

import com.example.theater.entity.PiesaEntity;
import com.example.theater.repository.PiesaRepository;
import com.example.theater.shared.Utils;
import com.example.theater.shared.dto.PiesaDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PiesaServiceImpl {

    @Autowired
    Utils utils;

    @Autowired
    PiesaRepository piesaRepository;
/*
    @Override
    public PiesaDto createPiesa(PiesaDto piesa) {
        PiesaEntity piesaEntity = new PiesaEntity();
        BeanUtils.copyProperties(piesa, piesaEntity);

        String publicPiesaid = utils.generateIdPiesa(30);
        piesaEntity.setId_piesa(publicPiesaid);

        PiesaEntity storedPiesaDetails = piesaRepository.save(piesaEntity);

        PiesaDto returnValue = new PiesaDto();
        BeanUtils.copyProperties(storedPiesaDetails, returnValue);

        return returnValue;
    }

 */
}
