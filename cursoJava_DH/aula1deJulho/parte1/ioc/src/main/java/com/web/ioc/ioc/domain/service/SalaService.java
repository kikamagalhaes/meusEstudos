package com.web.ioc.ioc.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.ioc.ioc.domain.model.Sala;
import com.web.ioc.ioc.domain.repository.SalaRepository;

@Service
public class SalaService {


    @Autowired
    private SalaRepository salaRepository;

    public void salvar(){

        var obj = salaRepository.findById((long) 3);

        System.out.println(obj.toString());

        Sala sala = new Sala();
        sala.setDescricao("aula IOC");
        sala.setNumeroAlunos(34);
        sala.setTurma("Digital House");
        salaRepository.save(sala);


    }
}
