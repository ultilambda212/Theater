package com.example.theater.service.impl;

import com.example.theater.entity.PremiuEntity;
import com.example.theater.entity.RecenzieEntity;
import com.example.theater.repository.RecenzieRepository;
import com.example.theater.service.RecenzieService;
import com.example.theater.shared.Utils;
import com.example.theater.shared.dto.PremiuDto;
import com.example.theater.shared.dto.RecenzieDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class RecenzieImpl implements RecenzieService {
    @Autowired
    Utils utils;

    @Autowired
    RecenzieRepository recenzieRepository;

    @Override
    public RecenzieDto createRecenzie(RecenzieDto recenzie) {

        RecenzieEntity recenzieEntity = new RecenzieEntity();
        BeanUtils.copyProperties(recenzie, recenzieEntity);

        String publicRecenzieId = utils.generateIdRecenzie(30);
        recenzieEntity.setId_recenzie(publicRecenzieId);

        RecenzieEntity storedRecenzieDetails = recenzieRepository.save(recenzieEntity);

        RecenzieDto returnValue = new RecenzieDto();
        BeanUtils.copyProperties(storedRecenzieDetails, returnValue);

        return returnValue;
    }

    @Override
    public RecenzieDto getRecenzieByNota(String nota) {
        RecenzieDto returnValue = new RecenzieDto();
        RecenzieEntity recenzieEntity = recenzieRepository.findByNota(nota);

        if(recenzieEntity == null) throw new UsernameNotFoundException(nota);

        BeanUtils.copyProperties(recenzieEntity, returnValue);

        return returnValue;
    }
}
