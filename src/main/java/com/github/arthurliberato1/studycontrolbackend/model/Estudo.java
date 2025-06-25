package com.github.arthurliberato1.studycontrolbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table
public class Estudo {

    @Id(/*aqui eu coloco a estratégia de agregação...*/)
    @Column
    private Long id;
    @Column
    private String titulo;
    @Column
    private Date data;
    @Column
    private String descricao;
    @Column
    private int duracaoMin;
    //categoria
    //usuário
}
