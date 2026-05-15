package com.projectfuel.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectfuel.backend.entity.AlertaEntity;

public interface AlertaRepository 
        extends JpaRepository<AlertaEntity, Integer> {

    Optional<AlertaEntity>
    findByCombustible_IdCombustibleAndUbicacion_IdUbicacionAndActiva(
            Integer idCombustible,
            Integer idUbicacion,
            Integer activa
    );

}