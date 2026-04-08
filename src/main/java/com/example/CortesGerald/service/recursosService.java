package com.example.CortesGerald.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CortesGerald.model.recursos;
import com.example.CortesGerald.repository.recursosRepository;

@Service
public class recursosService {
    @Autowired
    private recursosRepository recursosRepository;

    public List<recursos> readAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readAll'");
    }

    public recursos create(recursos recurso) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    public void seed() {
        recursosRepository.seed();
    }

    public recursos readById(int id) {
        return recursosRepository.obtenerPorId(id);
    }

    public recursos update(int id, recursos recurso) {
        return recursosRepository.actualizar(id,recurso);
    }
    
    public boolean delete(int id) {
        return recursosRepository.eliminar(id);
    }
}
