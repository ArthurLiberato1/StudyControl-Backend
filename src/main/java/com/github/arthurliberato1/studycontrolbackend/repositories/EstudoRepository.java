package com.github.arthurliberato1.studycontrolbackend.repositories;

import com.github.arthurliberato1.studycontrolbackend.model.Estudo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudoRepository extends JpaRepository<Estudo, Long> {
}
