package com.projectfuel.backend.dto;

public class UsuarioResponseDTO {

    private Integer id;
    private String nombre;
    private String usuario;
    private String correo;
    private String rol;
    private Integer idUbicacion;

    public UsuarioResponseDTO() {
    }

    public UsuarioResponseDTO(Integer id, String nombre, String usuario,
                              String correo, String rol, Integer idUbicacion) {

        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.correo = correo;
        this.rol = rol;
        this.idUbicacion = idUbicacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }
}