package com.example.theater.repository;

import com.example.theater.entity.PiesaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PiesaRepository extends CrudRepository<PiesaEntity, Long> {
}
