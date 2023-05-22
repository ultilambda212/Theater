package com.example.theater.service;

import com.example.theater.shared.dto.RecenzieDto;

public interface RecenzieService {
    RecenzieDto createRecenzie(RecenzieDto recenzie);
    RecenzieDto getRecenzieByNota(String nota);
}
