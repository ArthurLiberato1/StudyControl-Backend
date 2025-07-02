package com.github.arthurliberato1.studycontrolbackend.repositories;

import com.github.arthurliberato1.studycontrolbackend.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
