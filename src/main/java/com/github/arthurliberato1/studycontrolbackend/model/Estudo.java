package com.github.arthurliberato1.studycontrolbackend.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Estudo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
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
