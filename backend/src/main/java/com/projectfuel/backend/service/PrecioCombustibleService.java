package com.projectfuel.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectfuel.backend.entity.PrecioCombustibleEntity;
import com.projectfuel.backend.repository.PrecioCombustibleRepository;

@Service
public class PrecioCombustibleService {

    @Autowired
    private PrecioCombustibleRepository precioRepository;

    public List<PrecioCombustibleEntity> obtenerTodos() {
        return precioRepository.findAll();
    }

    public PrecioCombustibleEntity guardar(PrecioCombustibleEntity precio) {
        return precioRepository.save(precio);
    }

    public void eliminar(Integer id) {
        precioRepository.deleteById(id);
    }

    public PrecioCombustibleEntity obtenerPorId(Integer id) {
        return precioRepository.findById(id).orElse(null);
    }
}