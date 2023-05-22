package com.example.theater.controller;

import com.example.theater.model.request.RecenzieRequest;
import com.example.theater.model.response.ActorResponse;
import com.example.theater.model.response.RecenzieResponse;
import com.example.theater.service.RecenzieService;
import com.example.theater.shared.dto.ActorDto;
import com.example.theater.shared.dto.RecenzieDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Recenzie")
public class RecenzieController {

    @Autowired
    RecenzieService recenzieService;

    @GetMapping(path = "/{nota}")
    public RecenzieResponse getRecenzie(@PathVariable String nota) {
        RecenzieResponse returnValue = new RecenzieResponse();

        RecenzieDto recenzieDto = recenzieService.getRecenzieByNota(nota);
        BeanUtils.copyProperties(recenzieDto, returnValue);

        return returnValue;
    }

    @PostMapping(
            consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
    )
    public RecenzieResponse createRecenzie(@RequestBody RecenzieRequest recenzieDetails) {
        RecenzieResponse returnValue = new RecenzieResponse();

        RecenzieDto recenzieDto = new RecenzieDto();
        BeanUtils.copyProperties(recenzieDetails, recenzieDto);

        RecenzieDto createdRecenzie = recenzieService.createRecenzie(recenzieDto);
        BeanUtils.copyProperties(createdRecenzie, returnValue);

        return returnValue;
    }

    @PutMapping
    public String updateRecenzie() {
        return null;
    }

    @DeleteMapping
    public String deleteRecenzie() {
        return null;
    }
}
