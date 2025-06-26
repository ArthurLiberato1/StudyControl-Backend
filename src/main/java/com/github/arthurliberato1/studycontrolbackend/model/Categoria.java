package com.github.arthurliberato1.studycontrolbackend.model;

import jakarta.persistence.*;

@Entity
@Table
public class Categoria {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private Long id;
    @Column
    private String nome;
    @Column
    private String descricao;
    //tem que ter a pessoa que criou a categoria
}
