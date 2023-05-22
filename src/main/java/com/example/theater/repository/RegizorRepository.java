package com.example.theater.repository;

import com.example.theater.entity.RecenzieEntity;
import com.example.theater.entity.RegizorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegizorRepository extends CrudRepository<RegizorEntity, Long> {
    RegizorEntity findByNume(String nume);
    RegizorEntity findRegizorById(Long id);
}
