package com.github.arthurliberato1.studycontrolbackend.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Usuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
