package com.example.theater.service.impl;

import com.example.theater.entity.ActorEntity;
import com.example.theater.model.response.ErrorMessages;
import com.example.theater.repository.ActorRepository;
import com.example.theater.service.ActorService;
import com.example.theater.shared.Utils;
import com.example.theater.shared.dto.ActorDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    Utils utils;

    @Autowired
    ActorRepository actorRepository;

    @Override
    public ActorDto createActor(ActorDto actor) {

        ActorEntity actorEntity = new ActorEntity();
        BeanUtils.copyProperties(actor, actorEntity);

        String publicActorId = utils.generateIdActor(30);
        actorEntity.setId_actor(publicActorId);

        ActorEntity storedActorDetails = actorRepository.save(actorEntity);

        ActorDto returnValue = new ActorDto();
        BeanUtils.copyProperties(storedActorDetails, returnValue);

        return returnValue;
    }

    @Override
    public ActorDto getActorByNume(String nume) {
        ActorDto returnValue = new ActorDto();
        ActorEntity actorEntity = actorRepository.findActorByNume(nume);

        if(actorEntity == null) throw new UsernameNotFoundException(nume);

        BeanUtils.copyProperties(actorEntity, returnValue);

        return returnValue;
    }

    @Override
    public ActorDto getActorById(Long id) {
        ActorDto returnValue = new ActorDto();
        ActorEntity actorEntity = actorRepository.findActorById(id);

        if(actorEntity == null) throw new UsernameNotFoundException(ErrorMessages.NO_RECORD_FOUND.getErrorMessage());

        BeanUtils.copyProperties(actorEntity, returnValue);

        return returnValue;
    }

    @Override
    public ActorDto updateActor(Long id, ActorDto actor) {
        ActorDto returnValue = new ActorDto();
        ActorEntity actorEntity = actorRepository.findActorById(id);

        if(actorEntity == null) throw new UsernameNotFoundException(ErrorMessages.NO_RECORD_FOUND.getErrorMessage());

        actorEntity.setNume(actor.getNume());
        actorEntity.setPrenume(actor.getPrenume());
        actorEntity.setDataNastere(actor.getDataNastere());

        ActorEntity updatedActorDetails = actorRepository.save(actorEntity);

        BeanUtils.copyProperties(updatedActorDetails, returnValue);

        return returnValue;
    }

    @Override
    public void deleteActor(Long id) {
        ActorEntity actorEntity = actorRepository.findActorById(id);

        actorRepository.delete(actorEntity);
    }

    @Override
    public List<ActorDto> getActori(int page, int limit) {
        List<ActorDto> returnValue = new ArrayList<>();

        if(page>0) page -= 1;

        Pageable pageableRequest = PageRequest.of(page, limit);

        Page<ActorEntity> actoriPage = actorRepository.findAll(pageableRequest);
        List<ActorEntity> actori = actoriPage.getContent();

        return returnValue;
    }
}
