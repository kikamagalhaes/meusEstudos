package com.web.ioc.ioc.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao", nullable = true, length = 75)
    private String descricao;

    @Column(name = "numero_alunos", nullable = true, length = 75)
    private Integer numeroAlunos;

    @Column(name = "turma")
    private String turma;

}
