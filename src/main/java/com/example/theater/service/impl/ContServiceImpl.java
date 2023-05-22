package com.example.theater.service.impl;

import com.example.theater.entity.ContEntity;
import com.example.theater.repository.ContRepository;
import com.example.theater.service.ContService;
import com.example.theater.shared.Utils;
import com.example.theater.shared.dto.ContDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ContServiceImpl implements ContService {

    @Autowired
    Utils utils;

    @Autowired
    ContRepository contRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public ContDto createCont(ContDto cont) {

        ContEntity contEntity = new ContEntity();
        BeanUtils.copyProperties(cont, contEntity);

        String publicIdCont= utils.generateIdCont(30);
        contEntity.setId_cont(publicIdCont);
        contEntity.setEncParola(bCryptPasswordEncoder.encode(cont.getParola()));

        ContEntity storedContDetails = contRepository.save(contEntity);

        ContDto returnValue = new ContDto();
        BeanUtils.copyProperties(storedContDetails, returnValue);

        return returnValue;
    }

    @Override
    public ContDto getCont(String username) {
        ContEntity contEntity = contRepository.findByUsername(username);
        if(contEntity == null) throw new UsernameNotFoundException(username);

        ContDto returnValue = new ContDto();
        BeanUtils.copyProperties(contEntity, returnValue);

        return returnValue;
    }

    @Override
    public ContDto getContByEmail(String email) {
        ContDto returnValue = new ContDto();
        ContEntity contEntity = contRepository.findContByEmail(email);

        if(contEntity == null) throw new UsernameNotFoundException(email);

        BeanUtils.copyProperties(contEntity, returnValue);

        return returnValue;
    }

    @Override
    public ContDto getContById(Long id) {
        ContDto returnValue = new ContDto();
        ContEntity contEntity = contRepository.findContById(id);

        BeanUtils.copyProperties(contEntity, returnValue);

        return returnValue;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ContEntity contEntity = contRepository.findByUsername(username);

        if(contEntity == null) throw new UsernameNotFoundException(username);

        return new User(username, contEntity.getEncParola(), new ArrayList<>());
    }

}

