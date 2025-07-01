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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }
}
