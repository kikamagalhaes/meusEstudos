package com.web.ioc.ioc.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.ioc.ioc.domain.model.Sala;
import com.web.ioc.ioc.domain.repository.SalaRepository;
import com.web.ioc.ioc.domain.resource.SalaRequest;

@Service
public class SalaService {


    @Autowired
    private SalaRepository salaRepository;

    public void salvar(SalaRequest salaRequest){

        var obj = salaRepository.findById((long) 3);

        System.out.println(obj.toString());

        Sala sala = salaRequest.convert();




        salaRepository.save(sala);


    }
}
