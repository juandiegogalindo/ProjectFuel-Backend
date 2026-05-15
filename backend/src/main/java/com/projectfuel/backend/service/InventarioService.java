package com.projectfuel.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectfuel.backend.entity.InventarioEntity;
import com.projectfuel.backend.repository.InventarioRepository;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    public List<InventarioEntity> obtenerTodo() {
        return inventarioRepository.findAll();
    }

    public InventarioEntity guardar(InventarioEntity inventario) {
        return inventarioRepository.save(inventario);
    }

    public InventarioEntity obtenerPorId(Integer id) {

        return inventarioRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Inventario no encontrado"));
    }

    public void eliminar(Integer id) {
        inventarioRepository.deleteById(id);
    }

    public List<InventarioEntity> obtenerTodos() {
        return inventarioRepository.findAll();
    }
}