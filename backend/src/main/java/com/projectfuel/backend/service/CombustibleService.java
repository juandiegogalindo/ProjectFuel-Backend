package com.projectfuel.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectfuel.backend.entity.CombustibleEntity;
import com.projectfuel.backend.repository.CombustibleRepository;

@Service
public class CombustibleService {

    @Autowired
    private CombustibleRepository combustibleRepository;

    public List<CombustibleEntity> obtenerTodos() {
        return combustibleRepository.findAll();
    }

    public CombustibleEntity obtenerPorId(Integer id) {

        return combustibleRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Combustible no encontrado"));
    }

    public CombustibleEntity guardar(CombustibleEntity combustible) {
        return combustibleRepository.save(combustible);
    }

    public void eliminar(Integer id) {
        combustibleRepository.deleteById(id);
    }
}