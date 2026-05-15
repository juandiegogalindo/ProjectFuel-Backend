package com.projectfuel.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String usuario;

    @Column(nullable = false, unique = true)
    private String correo;

    private String direccion;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String rol; 

    @ManyToOne
    @JoinColumn(name = "id_ubicacion")
    private UbicacionEntity ubicacion;

    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;

    private String genero;

    private Double latitud;

    private Double longitud;

    private Integer verificado = 0;

    @Column(name = "codigo_verificacion")
    private String codigoVerificacion;

    public UsuarioEntity() {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public UbicacionEntity getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(UbicacionEntity ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Integer getVerificado() {
        return verificado;
    }

    public void setVerificado(Integer verificado) {
        this.verificado = verificado;
    }

    public String getCodigoVerificacion() {
        return codigoVerificacion;
    }

    public void setCodigoVerificacion(String codigoVerificacion) {
        this.codigoVerificacion = codigoVerificacion;
    }
}