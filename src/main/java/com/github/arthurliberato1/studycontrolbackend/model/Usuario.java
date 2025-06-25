package com.github.arthurliberato1.studycontrolbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table
public class Usuario {
    @Id
    @Column
    private Long id;
    @Column
    private String nome;
    @Column
    private String email;
    @Column
    private String senha;//deve ser criptografada
}
