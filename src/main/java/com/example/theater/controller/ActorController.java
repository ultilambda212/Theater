package com.example.theater.controller;

import com.example.theater.model.request.ActorRequest;
import com.example.theater.model.response.ActorResponse;
import com.example.theater.model.response.ErrorMessages;
import com.example.theater.model.response.OperationStatus;
import com.example.theater.service.ActorService;
import com.example.theater.shared.dto.ActorDto;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Actor")
public class ActorController {

    @Autowired
    ActorService actorService;

    @GetMapping(path = "/{id}")
    public ActorResponse getActor(@PathVariable Long id){
        ActorResponse returnValue = new ActorResponse();

        ActorDto actorDto = actorService.getActorById(id);
        BeanUtils.copyProperties(actorDto,returnValue);

        return returnValue;
    }

    @PostMapping(
            consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
    )
    public ActorResponse createActor(@RequestBody ActorRequest actorDetails) throws Exception {
        ActorResponse returnValue = new ActorResponse();

        if(actorDetails.getNume().isEmpty()) throw new Exception(ErrorMessages.MISSING_REQUIRED_FIELD.getErrorMessage());

        ActorDto actorDto = new ActorDto();
        BeanUtils.copyProperties(actorDetails, actorDto);

        ActorDto createdActor = actorService.createActor(actorDto);
        BeanUtils.copyProperties(createdActor, returnValue);

        return returnValue;
    }

    @PutMapping(path = "/{id}")
    public ActorResponse updateActor(@PathVariable Long id, @RequestBody ActorRequest actorDetails) {
        ActorResponse returnValue = new ActorResponse();

        ActorDto actorDto = new ActorDto();
        BeanUtils.copyProperties(actorDetails, actorDto);

        ActorDto updatedActor = actorService.updateActor(id, actorDto);
        BeanUtils.copyProperties(updatedActor, returnValue);

        return returnValue;
    }

    @DeleteMapping(path = "/{id}",
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public OperationStatus deleteActor(Long id) {
        OperationStatus returnValue = new OperationStatus();
        returnValue.setOperationName(RequestOperationName.DELETE.name());

        actorService.deleteActor(id);

        returnValue.setOperationResult(RequestOperationStatus.SUCCESS.name());
        return returnValue;
    }

    @GetMapping
    public List<ActorResponse> getActori(@RequestParam(value="page", defaultValue="0") int page, @RequestParam(value="limit", defaultValue="1") int limit) {
        List<ActorResponse> returnValue = new ArrayList<>();

        List<ActorDto> actori = actorService.getActori(page, limit);

        for(ActorDto actorDto : actori) {
            ActorResponse actorModel = new ActorResponse();
            BeanUtils.copyProperties(actorDto, actorModel);
            returnValue.add(actorModel);
        }

        return returnValue;
    }
}
