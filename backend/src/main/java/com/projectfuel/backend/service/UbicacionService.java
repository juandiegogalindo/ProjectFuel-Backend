package com.projectfuel.backend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectfuel.backend.entity.UbicacionEntity;
import com.projectfuel.backend.repository.UbicacionRepository;

@Service
public class UbicacionService {

    @Autowired
    private UbicacionRepository ubicacionRepository;

    // OBTENER TODAS LAS UBICACIONES
    public List<UbicacionEntity> obtenerTodas() {
        return ubicacionRepository.findAll();
    }

    // OBTENER POR ID
    public UbicacionEntity obtenerPorId(Integer id) {

        return ubicacionRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Ubicación no encontrada"));
    }

    // OBTENER CIUDADES ÚNICAS
    public List<String> obtenerCiudades() {

        return ubicacionRepository.findAll()
                .stream()
                .map(UbicacionEntity::getCiudad)
                .distinct()
                .collect(Collectors.toList());
    }

    // OBTENER ZONAS POR CIUDAD
    public List<String> obtenerZonasPorCiudad(String ciudad) {

    return ubicacionRepository.findByCiudad(ciudad)
            .stream()
            .map(UbicacionEntity::getLocalidad)
            .collect(Collectors.toList());
}

    // GUARDAR UBICACION
    public UbicacionEntity guardar(UbicacionEntity ubicacion) {
        return ubicacionRepository.save(ubicacion);
    }

    public void eliminar(Integer id) {
        ubicacionRepository.deleteById(id);
    }
}