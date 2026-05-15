package com.projectfuel.backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectfuel.backend.dto.LoginResponseDTO;
import com.projectfuel.backend.dto.UsuarioRequestDTO;
import com.projectfuel.backend.dto.UsuarioResponseDTO;
import com.projectfuel.backend.entity.UbicacionEntity;
import com.projectfuel.backend.entity.UsuarioEntity;
import com.projectfuel.backend.repository.UbicacionRepository;
import com.projectfuel.backend.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UbicacionRepository ubicacionRepository;

    public LoginResponseDTO login(String correo, String password) {

        Optional<UsuarioEntity> usuario =
                usuarioRepository.findByCorreoAndPassword(correo, password);

        if (usuario.isPresent()) {

            return new LoginResponseDTO(
                    true,
                    "Login exitoso",
                    usuario.get()
            );
        }

        return new LoginResponseDTO(
                false,
                "Credenciales incorrectas",
                null
        );
    }

    public UsuarioResponseDTO registrarUsuario(UsuarioRequestDTO request) {

        if (usuarioRepository.existsByCorreo(request.getCorreo())) {
            throw new RuntimeException("El correo ya existe");
        }

        if (usuarioRepository.existsByUsuario(request.getUsuario())) {
            throw new RuntimeException("El usuario ya existe");
        }

        UsuarioEntity usuario = new UsuarioEntity();

        usuario.setNombre(request.getNombre());
        usuario.setUsuario(request.getUsuario());
        usuario.setCorreo(request.getCorreo());
        usuario.setDireccion(request.getDireccion());
        usuario.setPassword(request.getPassword());
        usuario.setRol(request.getRol());

        // BUSCAR UBICACION
        if (request.getIdUbicacion() != null) {

            UbicacionEntity ubicacion =
                    ubicacionRepository.findById(request.getIdUbicacion())
                    .orElseThrow(() ->
                            new RuntimeException("Ubicación no encontrada"));

            usuario.setUbicacion(ubicacion);
        }

        usuario.setFechaNacimiento(request.getFechaNacimiento());
        usuario.setGenero(request.getGenero());
        usuario.setLatitud(request.getLatitud());
        usuario.setLongitud(request.getLongitud());

        usuario.setVerificado(1);

        UsuarioEntity guardado = usuarioRepository.save(usuario);

        return new UsuarioResponseDTO(
                guardado.getId(),
                guardado.getNombre(),
                guardado.getUsuario(),
                guardado.getCorreo(),
                guardado.getRol(),
                guardado.getUbicacion() != null
                        ? guardado.getUbicacion().getIdUbicacion()
                        : null
        );
    }
}