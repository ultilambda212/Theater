package com.example.theater.service;

import com.example.theater.shared.dto.PremiuDto;

public interface PremiuService {
    PremiuDto createPremiu(PremiuDto premiu);
    PremiuDto getPremiuByNumePremiu(String numePremiu);
}
