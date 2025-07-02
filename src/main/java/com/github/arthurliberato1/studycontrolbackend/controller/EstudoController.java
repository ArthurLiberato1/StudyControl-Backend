package com.github.arthurliberato1.studycontrolbackend.controller;

import com.github.arthurliberato1.studycontrolbackend.model.Estudo;
import com.github.arthurliberato1.studycontrolbackend.services.EstudoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudo")
public class EstudoController {

    EstudoService estudoService;

    public EstudoController(EstudoService estudoService) {
        this.estudoService = estudoService;
    }

    @PostMapping
    public Estudo registrar(@RequestBody Estudo estudo) {
        //ver de settar o id aqui
        estudoService.salvar(estudo);
        return estudo;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> obterPorId(@PathVariable("id") Long id){
        if(estudoService.buscarPeloId(id) != null){
            return ResponseEntity.ok(estudoService.buscarPeloId(id));
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public void deletar (@PathVariable("id") Long id){
        estudoService.remover(id);
    }

    public void atualizar(@PathVariable("id") Long id, @RequestBody Estudo estudo){
        estudo.setId(id);
        estudoService.salvar(estudo);
    }

    //fazer buscas mais elaboradas e adicionar verificações nos endpoints
    //buscar estudos pelo título
}
