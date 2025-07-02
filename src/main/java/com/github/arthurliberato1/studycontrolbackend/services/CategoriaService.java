package com.github.arthurliberato1.studycontrolbackend.services;

import com.github.arthurliberato1.studycontrolbackend.model.Categoria;
import com.github.arthurliberato1.studycontrolbackend.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public void salvar(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    public void deletar(Long id) {
        categoriaRepository.deleteById(id);
    }

    public Categoria buscarCategoria(Long id) {
        return categoriaRepository.findById(id).get();
    }
}
