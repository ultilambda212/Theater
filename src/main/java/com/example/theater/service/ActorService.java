package com.example.theater.service;

import com.example.theater.shared.dto.ActorDto;

import java.util.List;

public interface ActorService {
    ActorDto createActor(ActorDto actor);
    ActorDto getActorByNume(String nume);
    ActorDto getActorById(Long id);
    ActorDto updateActor(Long id, ActorDto actor);
    void deleteActor(Long id);
    List<ActorDto> getActori(int page, int limit);
}
