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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
