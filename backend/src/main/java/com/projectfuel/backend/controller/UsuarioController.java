package com.projectfuel.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projectfuel.backend.dto.LoginRequestDTO;
import com.projectfuel.backend.dto.LoginResponseDTO;
import com.projectfuel.backend.dto.UsuarioRequestDTO;
import com.projectfuel.backend.dto.UsuarioResponseDTO;
import com.projectfuel.backend.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public LoginResponseDTO login(@RequestBody LoginRequestDTO request) {

        return usuarioService.login(
                request.getCorreo(),
                request.getPassword()
        );
    }

    @PostMapping("/registro")
    public UsuarioResponseDTO registrar(
            @RequestBody UsuarioRequestDTO request
    ) {
        return usuarioService.registrarUsuario(request);
    }
}