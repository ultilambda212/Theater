package com.example.theater.repository;

import com.example.theater.entity.RecenzieEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecenzieRepository extends CrudRepository<RecenzieEntity, Long> {
    RecenzieEntity findByNota(String nota);
}
