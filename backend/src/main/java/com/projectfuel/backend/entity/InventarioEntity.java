package com.projectfuel.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "inventario",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {
                        "id_combustible",
                        "id_ubicacion"
                })
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InventarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventario")
    private Integer idInventario;

    @ManyToOne
    @JoinColumn(name = "id_combustible")
    private CombustibleEntity combustible;

    @ManyToOne
    @JoinColumn(name = "id_ubicacion")
    private UbicacionEntity ubicacion;

    private Double cantidad;
}