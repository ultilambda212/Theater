package com.example.theater.controller;

import com.example.theater.model.request.PremiuRequest;
import com.example.theater.model.response.ActorResponse;
import com.example.theater.model.response.PremiuResponse;
import com.example.theater.model.response.RegizorResponse;
import com.example.theater.service.PremiuService;
import com.example.theater.shared.dto.ActorDto;
import com.example.theater.shared.dto.PremiuDto;
import com.example.theater.shared.dto.RegizorDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Premiu")
public class PremiuController {

    @Autowired
    PremiuService premiuService;

    @GetMapping(path = "/{numePremiu}")
    public PremiuResponse getPremiu(@PathVariable String numePremiu){
        PremiuResponse returnValue = new PremiuResponse();

        PremiuDto premiuDto = premiuService.getPremiuByNumePremiu(numePremiu);
        BeanUtils.copyProperties(premiuDto, returnValue);

        return returnValue;
    }

    @PostMapping
    public PremiuResponse createPremiu(@RequestBody PremiuRequest premiuDetails) {
        PremiuResponse returnValue = new PremiuResponse();

        ModelMapper modelMapper = new ModelMapper();
        PremiuDto premiuDto = modelMapper.map(premiuDetails, PremiuDto.class);

        PremiuDto createdPremiu = premiuService.createPremiu(premiuDto);
        returnValue = modelMapper.map(createdPremiu, PremiuResponse.class);

        return returnValue;
    }

    @PutMapping
    public String updatePremiu(){
        return null;
    }

    @DeleteMapping
    public String deletePremiu() {
        return null;
    }
}
