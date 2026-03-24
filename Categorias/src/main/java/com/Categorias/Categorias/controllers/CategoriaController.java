package com.Categorias.Categorias.controllers;

import com.Categorias.Categorias.entity.Categoria;
import com.Categorias.Categorias.services.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    private CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public Categoria criar(@RequestBody Categoria categoria){
        return categoriaService.criarCategoria(categoria);
    }

    @GetMapping
    public List<Categoria> listar(){
        return categoriaService.listarTodos();
    }

    @GetMapping("/{id}")
    public Categoria buscar(@PathVariable Long id){
        return categoriaService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        categoriaService.deletarPorId(id);
    }

}
