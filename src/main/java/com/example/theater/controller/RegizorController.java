package com.example.theater.controller;

import com.example.theater.model.request.RegizorRequest;
import com.example.theater.model.response.RecenzieResponse;
import com.example.theater.model.response.RegizorResponse;
import com.example.theater.service.RegizorService;
import com.example.theater.shared.dto.RecenzieDto;
import com.example.theater.shared.dto.RegizorDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Regizor")
public class RegizorController {

    @Autowired
    RegizorService regizorService;

    @GetMapping(path = "{id}")
    public RegizorResponse getRegizor(@PathVariable Long id) {
        RegizorResponse returnValue = new RegizorResponse();

        RegizorDto regizorDto = regizorService.getRegizorById(id);
        BeanUtils.copyProperties(regizorDto, returnValue);

        return returnValue;
    }

    @PostMapping
    public RegizorResponse createRegizor(@RequestBody RegizorRequest regizorRequestDetails) throws Exception {
        RegizorResponse returnValue = new RegizorResponse();

        //RegizorDto regizorDto = new RegizorDto();
        //BeanUtils.copyProperties(regizorRequestDetails, regizorDto);

        ModelMapper modelMapper = new ModelMapper();
        RegizorDto regizorDto = modelMapper.map(regizorRequestDetails, RegizorDto.class);

        RegizorDto createdRegizor = regizorService.createRegizor(regizorDto);
        returnValue = modelMapper.map(createdRegizor, RegizorResponse.class);

        return returnValue;
    }

    @PutMapping
    public String updateRegizor() {
        return "updateRegizor was called";
    }

    @DeleteMapping
    public String deleteRegizor() {
        return "deleteRegizor was called";
    }
}
