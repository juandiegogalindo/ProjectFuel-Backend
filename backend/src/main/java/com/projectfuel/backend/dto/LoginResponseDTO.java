package com.projectfuel.backend.dto;

import com.projectfuel.backend.entity.UsuarioEntity;

public class LoginResponseDTO {

    private boolean success;
    private String mensaje;
    private UsuarioEntity usuario;

    public LoginResponseDTO() {
    }

    public LoginResponseDTO(boolean success, String mensaje, UsuarioEntity usuario) {
        this.success = success;
        this.mensaje = mensaje;
        this.usuario = usuario;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }
}