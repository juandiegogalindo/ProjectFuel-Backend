package com.projectfuel.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "alerta")
public class AlertaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alerta")
    private Integer idAlerta;

    @ManyToOne
    @JoinColumn(name = "id_combustible")
    private CombustibleEntity combustible;

    @ManyToOne
    @JoinColumn(name = "id_ubicacion")
    private UbicacionEntity ubicacion;

    @Column(name = "nivel_minimo")
    private Double nivelMinimo;

    private Integer activa = 1;

    // GETTERS Y SETTERS

    public Integer getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(Integer idAlerta) {
        this.idAlerta = idAlerta;
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

    public Double getNivelMinimo() {
        return nivelMinimo;
    }

    public void setNivelMinimo(Double nivelMinimo) {
        this.nivelMinimo = nivelMinimo;
    }

    public Integer getActiva() {
        return activa;
    }

    public void setActiva(Integer activa) {
        this.activa = activa;
    }
}