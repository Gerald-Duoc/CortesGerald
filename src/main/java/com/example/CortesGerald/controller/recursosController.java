package com.example.CortesGerald.controller;

import java.util.List;
import com.example.CortesGerald.service.recursosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.CortesGerald.model.recursos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;




@RestController
@RequestMapping("/recursos")
public class recursosController {
    @Autowired
    private recursosService recursosService;

    @GetMapping
    public List<recursos> getRecursos() {
        return recursosService.readAll();
    }
    
    @PostMapping
    public recursos postRecursos(@RequestBody recursos recurso) {
        return recursosService.create(recurso);
    }

    @GetMapping("cargar-DATOS")
    public String getCargarDatos() {
        recursosService.seed();
        return "Datos cargados exitosamente";
    }

    @GetMapping("{id}")
    public recursos getRecursoById(@PathVariable int id) {
        return recursosService.readById(id);
    }
    @PutMapping("modificar/{id}")
    public recursos putRecurso(@PathVariable int id, @RequestBody recursos recurso) {
        return recursosService.update(id,recurso); 
    }

    @DeleteMapping("eliminar/{id}")
    public String deleteRecurso(@PathVariable int id) {
        boolean eliminado = recursosService.delete(id);
        
        if (eliminado) {
            return "El recurso con ID " + id + " fue eliminado correctamente";
        } else {
            return "Error: No se encontró ningún recurso con el ID " + id;
        }
    }
}
