package com.projectfuel.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectfuel.backend.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {

    Optional<UsuarioEntity> findByCorreo(String correo);

    Optional<UsuarioEntity> findByUsuario(String usuario);

    Optional<UsuarioEntity> findByCorreoAndPassword(String correo, String password);

    boolean existsByCorreo(String correo);

    boolean existsByUsuario(String usuario);
}