package com.projectfuel.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectfuel.backend.entity.UbicacionEntity;

public interface UbicacionRepository
        extends JpaRepository<UbicacionEntity, Integer> {

    List<UbicacionEntity> findByCiudad(String ciudad);

}