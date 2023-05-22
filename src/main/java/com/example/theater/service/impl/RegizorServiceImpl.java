package com.example.theater.service.impl;

import com.example.theater.entity.RecenzieEntity;
import com.example.theater.entity.RegizorEntity;
import com.example.theater.repository.RegizorRepository;
import com.example.theater.service.RegizorService;
import com.example.theater.shared.Utils;
import com.example.theater.shared.dto.PiesaDto;
import com.example.theater.shared.dto.RecenzieDto;
import com.example.theater.shared.dto.RegizorDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class RegizorServiceImpl implements RegizorService {

    @Autowired
    private RegizorRepository regizorRepository;

    @Autowired
    Utils utils;

    @Override
    public RegizorDto createRegizor(RegizorDto regizor) {

        for(int i = 0; i < regizor.getPiese().size(); i++) {
            PiesaDto piesa = regizor.getPiese().get(i);
            piesa.setRegizorDetails(regizor);
            piesa.setId_piesa(utils.generateIdPiesa(30));
            regizor.getPiese().set(i, piesa);
        }

        //BeanUtils.copyProperties(regizor, regizorEntity);
        ModelMapper modelMapper = new ModelMapper();
        RegizorEntity regizorEntity = modelMapper.map(regizor, RegizorEntity.class);

        String publicIdRegizor = utils.generateIdRegizor(30);
        regizorEntity.setId_regizor(publicIdRegizor);

        RegizorEntity storedRegizorDetails = regizorRepository.save(regizorEntity);

        //BeanUtils.copyProperties(storedRegizorDetails, returnValue);
        RegizorDto returnValue = modelMapper.map(storedRegizorDetails, RegizorDto.class);

        return returnValue;
    }

    @Override
    public RegizorDto getRegizorByNume(String nume) {
        RegizorDto returnValue = new RegizorDto();
        RegizorEntity regizorEntity = regizorRepository.findByNume(nume);

        if(regizorEntity == null) throw new UsernameNotFoundException(nume);

        BeanUtils.copyProperties(regizorEntity, returnValue);

        return returnValue;
    }

    @Override
    public RegizorDto getRegizorById(Long id) {
        RegizorDto returnValue = new RegizorDto();
        RegizorEntity regizorEntity = regizorRepository.findRegizorById(id);

        BeanUtils.copyProperties(regizorEntity, returnValue);

        return returnValue;
    }
}
