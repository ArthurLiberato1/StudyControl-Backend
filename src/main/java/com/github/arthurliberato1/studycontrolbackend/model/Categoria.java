package com.github.arthurliberato1.studycontrolbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Categoria {

    @Id
    @Column
    private Long id;
    @Column
    private String nome;
    @Column
    private String descricao;
    //tem que ter a pessoa que criou a categoria
}
