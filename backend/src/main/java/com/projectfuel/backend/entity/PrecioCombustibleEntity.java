package com.projectfuel.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "precio_combustible")
public class PrecioCombustibleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_precio")
    private Integer idPrecio;

    @ManyToOne
    @JoinColumn(name = "id_combustible")
    private CombustibleEntity combustible;

    @ManyToOne
    @JoinColumn(name = "id_ubicacion")
    private UbicacionEntity ubicacion;

    private Double precio;

    // GETTERS Y SETTERS

    public Integer getIdPrecio() {
        return idPrecio;
    }

    public void setIdPrecio(Integer idPrecio) {
        this.idPrecio = idPrecio;
    }

    public CombustibleEntity getCombustible() {
        return combustible;
    }

    public void setCombustible(CombustibleEntity combustible) {
        this.combustible = combustible;
    }

    public UbicacionEntity getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(UbicacionEntity ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}