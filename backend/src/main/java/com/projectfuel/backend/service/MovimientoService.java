package com.projectfuel.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectfuel.backend.entity.InventarioEntity;
import com.projectfuel.backend.entity.MovimientoEntity;
import com.projectfuel.backend.repository.InventarioRepository;
import com.projectfuel.backend.repository.MovimientoRepository;

@Service
public class MovimientoService {

    @Autowired
    private MovimientoRepository movimientoRepository;

    @Autowired
    private InventarioRepository inventarioRepository;

    public MovimientoEntity registrarMovimiento(
            MovimientoEntity movimiento) {

        List<InventarioEntity> inventarios =
                inventarioRepository.findAll();

        for (InventarioEntity inventario : inventarios) {

            boolean mismoCombustible =
                    inventario.getCombustible()
                            .getIdCombustible()
                            .equals(
                                    movimiento.getCombustible()
                                            .getIdCombustible());

            boolean mismaUbicacion =
                    inventario.getUbicacion()
                            .getIdUbicacion()
                            .equals(
                                    movimiento.getUbicacion()
                                            .getIdUbicacion());

            if (mismoCombustible && mismaUbicacion) {

                if (movimiento.getTipoMovimiento()
                        .equalsIgnoreCase("ENTRADA")) {

                    inventario.setCantidad(
                            inventario.getCantidad()
                                    + movimiento.getGalones());

                } else {

                    inventario.setCantidad(
                            inventario.getCantidad()
                                    - movimiento.getGalones());
                }

                inventarioRepository.save(inventario);
            }
        }

        movimiento.setTotal(
                movimiento.getGalones()
                        * movimiento.getPrecioUnitario());

        return movimientoRepository.save(movimiento);
    }

    public List<MovimientoEntity> obtenerTodos() {
        return movimientoRepository.findAll();
    }

     public MovimientoEntity obtenerPorId(Integer id) {
        return movimientoRepository.findById(id).orElse(null);
    }

    public MovimientoEntity guardar(MovimientoEntity movimiento) {
        return movimientoRepository.save(movimiento);
    }

    public void eliminar(Integer id) {
        movimientoRepository.deleteById(id);
    }
}