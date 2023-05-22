package com.example.theater.service;

import com.example.theater.shared.dto.ContDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface ContService extends UserDetailsService {
    ContDto createCont(ContDto cont);
    ContDto getCont(String username);
    ContDto getContByEmail(String email);
    ContDto getContById(Long id);
}
