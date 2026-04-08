package com.example.CortesGerald.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.CortesGerald.model.recursos;

@Repository
public class recursosRepository {
    
    private List<recursos> listaRecursos = new ArrayList<>();

    public List<recursos> obtenerRecursos() {
        return listaRecursos;
    }

    public void seed(){
        listaRecursos.add(new recursos(1, "Recurso 1", 10, "Responsable 1", 2023, "Tipo A", 5));
        listaRecursos.add(new recursos(2, "Recurso 2", 20, "Responsable 2", 2022, "Tipo B", 10));
        listaRecursos.add(new recursos(3, "Recurso 3", 15, "Responsable 3", 2021, "Tipo A", 8));
    }

    public recursos obtenerPorId(int id) {
        for (recursos recurso : listaRecursos) {
            if (id == recurso.getId()) {
                return recurso;
            }
        }
        return null;
    }
    public recursos agregar(recursos recurso) {
        listaRecursos.add(recurso);
        return recurso;
    }

    public recursos actualizar(int id, recursos recurso) {
        for (int i = 0; i < listaRecursos.size(); i++) {
            if (listaRecursos.get(i).getId() == id) {
                
                recurso.setId(id); 
                
                listaRecursos.set(i, recurso);
                
                return recurso;
            }
        }
        return null;
    }

    public boolean eliminar(int id) {
        for (int i = 0; i < listaRecursos.size(); i++) {
            if (listaRecursos.get(i).getId() == id) {
                listaRecursos.remove(i);
                return true;
            }
        }
        return false;
    }
}
