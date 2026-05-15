package com.projectfuel.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectfuel.backend.entity.AlertaEntity;
import com.projectfuel.backend.repository.AlertaRepository;

@Service
public class AlertaService {

    @Autowired
    private AlertaRepository alertaRepository;

    public AlertaEntity guardar(AlertaEntity alerta) {
        return alertaRepository.save(alerta);
    }

    public List<AlertaEntity> obtenerTodas() {
        return alertaRepository.findAll();
    }

    public AlertaEntity obtenerPorId(Integer id) {
        return alertaRepository.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        alertaRepository.deleteById(id);
    }
}