package com.github.arthurliberato1.studycontrolbackend.services;

import com.github.arthurliberato1.studycontrolbackend.model.Estudo;
import com.github.arthurliberato1.studycontrolbackend.repositories.EstudoRepository;
import org.springframework.stereotype.Service;

@Service
public class EstudoService {

    EstudoRepository repository;
    public EstudoService(EstudoRepository repository) {
        this.repository = repository;
    }

    public Estudo salvar(Estudo estudo) {
        return repository.save(estudo);
    }

    public Estudo buscarPeloId(Long id) {
        return repository.findById(id).get();
    }

    public void remover(Long id) {
        repository.deleteById(id);
    }
}
