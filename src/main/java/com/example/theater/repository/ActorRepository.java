package com.example.theater.repository;

import com.example.theater.entity.ActorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends PagingAndSortingRepository<ActorEntity, Long> {
    ActorEntity findActorByNume(String nume);
    ActorEntity findActorById(Long id);

    void delete(ActorEntity actorEntity);

    ActorEntity save(ActorEntity actorEntity);
}
