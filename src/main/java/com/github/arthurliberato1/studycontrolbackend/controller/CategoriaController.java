package com.github.arthurliberato1.studycontrolbackend.controller;

import com.github.arthurliberato1.studycontrolbackend.model.Categoria;
import com.github.arthurliberato1.studycontrolbackend.services.CategoriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private final CategoriaService categoriaService;
    private CategoriaService service;

    public CategoriaController(CategoriaService service, CategoriaService categoriaService) {
        this.service = service;
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public Categoria cadastrarCategoria(@RequestBody Categoria categoria) {
        service.salvar(categoria);
        return categoria;
    }
    @PutMapping("/{id}")
    public Categoria atualizarCategoria( @PathVariable("id") Long id , @RequestBody Categoria categoria) {
        categoria.setId(id);
        service.salvar(categoria);
        return categoria;
    }
    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable("id") Long id) {
        service.deletar(id);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarCategoriaPorId(@PathVariable("id") Long id) {
        if(service.buscarCategoria(id)!=null){
            return ResponseEntity.ok(service.buscarCategoria(id));
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

}
