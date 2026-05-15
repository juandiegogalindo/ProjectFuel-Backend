package com.projectfuel.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projectfuel.backend.entity.UbicacionEntity;
import com.projectfuel.backend.service.UbicacionService;

@RestController
@RequestMapping("/ubicaciones")
@CrossOrigin("*")
public class UbicacionController {

    @Autowired
    private UbicacionService ubicacionService;

    @GetMapping
    public List<UbicacionEntity> obtenerTodas() {
        return ubicacionService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public UbicacionEntity obtenerPorId(@PathVariable Integer id) {
        return ubicacionService.obtenerPorId(id);
    }

    @PostMapping
    public UbicacionEntity guardar(@RequestBody UbicacionEntity ubicacion) {
        return ubicacionService.guardar(ubicacion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        ubicacionService.eliminar(id);
    }
}