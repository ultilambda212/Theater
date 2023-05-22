package com.example.theater.service;

import com.example.theater.shared.dto.RegizorDto;


public interface RegizorService {
    RegizorDto createRegizor(RegizorDto regizor);
    RegizorDto getRegizorByNume(String nume);
    RegizorDto getRegizorById(Long id);
}
