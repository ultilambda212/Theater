package com.example.theater.controller;

import com.example.theater.model.request.ContRequest;
import com.example.theater.model.response.ContResponse;
import com.example.theater.service.ContService;
import com.example.theater.shared.dto.ContDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Cont")
public class ContController {

    @Autowired
    ContService contService;

    @GetMapping(path = "/{id}")
    public ContResponse getCont(@PathVariable Long id) {
        ContResponse returnValue = new ContResponse();

        ContDto contDto = contService.getContById(id);
        BeanUtils.copyProperties(contDto,returnValue);

        return returnValue;
    }

    @PostMapping
    public ContResponse createCont(@RequestBody ContRequest contDetails){
        ContResponse returnValue = new ContResponse();

        ContDto contDto = new ContDto();
        BeanUtils.copyProperties(contDetails, contDto);

        ContDto createdCont = contService.createCont(contDto);
        BeanUtils.copyProperties(createdCont, returnValue);

        return returnValue;
    }

    @PutMapping
    public String updateCont(){
        return "Cont updated";
    }

    @DeleteMapping
    public String deleteCont(){
        return "Cont deleted";
    }
}
