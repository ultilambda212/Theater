package com.example.theater.repository;

import com.example.theater.entity.ContEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContRepository extends CrudRepository<ContEntity, Long> {
    ContEntity findContByEmail(String email);
    ContEntity findByUsername(String username);
    ContEntity findContById(Long id);
}
