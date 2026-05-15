package com.projectfuel.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "movimientos")
public class MovimientoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimiento")
    private Integer idMovimiento;

    @ManyToOne
    @JoinColumn(name = "id_combustible")
    private CombustibleEntity combustible;

    @ManyToOne
    @JoinColumn(name = "id_ubicacion")
    private UbicacionEntity ubicacion;

    @Column(name = "tipo_movimiento")
    private String tipoMovimiento;

    private Double galones;

    @Column(name = "precio_unitario")
    private Double precioUnitario;

    private Double total;

    private String fecha;

    // GETTERS Y SETTERS

    public Integer getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(Integer idMovimiento) {
        this.idMovimiento = idMovimiento;
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

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public Double getGalones() {
        return galones;
    }

    public void setGalones(Double galones) {
        this.galones = galones;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}