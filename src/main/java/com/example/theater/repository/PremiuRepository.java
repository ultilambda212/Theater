package com.example.theater.repository;

import com.example.theater.entity.ContEntity;
import com.example.theater.entity.PremiuEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PremiuRepository extends CrudRepository<PremiuEntity, Long> {
    PremiuEntity findByNumePremiu(String numePremiu);
}
