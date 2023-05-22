package com.example.theater.service.impl;

import com.example.theater.entity.ContEntity;
import com.example.theater.entity.PremiuEntity;
import com.example.theater.repository.PremiuRepository;
import com.example.theater.service.PremiuService;
import com.example.theater.shared.Utils;
import com.example.theater.shared.dto.ContDto;
import com.example.theater.shared.dto.PiesaDto;
import com.example.theater.shared.dto.PremiuDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PremiuServiceImpl implements PremiuService {
    @Autowired
    Utils utils;

    @Autowired
    PremiuRepository premiuRepository;

    @Override
    public PremiuDto createPremiu(PremiuDto premiu) {

        PremiuEntity premiuEntity = new PremiuEntity();
        PiesaDto piesa = premiu.getPiesa();
        piesa.setId_piesa(utils.generateIdPiesa(30));
        premiu.setPiesa(piesa);
        BeanUtils.copyProperties(premiu, premiuEntity);

        String publicPremiuId = utils.generateIdPremiu(30);
        premiuEntity.setId_premiu(publicPremiuId);

        PremiuEntity storedPremiuDetails = premiuRepository.save(premiuEntity);

        PremiuDto returnValue = new PremiuDto();
        BeanUtils.copyProperties(storedPremiuDetails, returnValue);

        return returnValue;
    }

    @Override
    public PremiuDto getPremiuByNumePremiu(String numePremiu) {
        PremiuDto returnValue = new PremiuDto();
        PremiuEntity premiuEntity = premiuRepository.findByNumePremiu(numePremiu);

        if(premiuEntity == null) throw new UsernameNotFoundException(numePremiu);

        BeanUtils.copyProperties(premiuEntity, returnValue);

        return returnValue;
    }
}
