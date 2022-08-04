package com.web.ioc.ioc.domain.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.ioc.ioc.domain.service.SalaService;

@RestController
@RequestMapping("sala")
public class SalaResource {

    @Autowired
    private SalaService salaService;

    @PostMapping
    public void salvar(){

        salaService.salvar();

    }
    
}
