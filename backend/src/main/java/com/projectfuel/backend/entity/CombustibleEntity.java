package com.projectfuel.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "combustible")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CombustibleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_combustible")
    private Integer idCombustible;

    @Column(unique = true, nullable = false)
    private String nombre;
}