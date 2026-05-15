package com.projectfuel.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projectfuel.backend.entity.AlertaEntity;
import com.projectfuel.backend.service.AlertaService;

@RestController
@RequestMapping("/alertas")
@CrossOrigin("*")
public class AlertaController {

    @Autowired
    private AlertaService alertaService;

    @GetMapping
    public List<AlertaEntity> obtenerTodas() {
        return alertaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public AlertaEntity obtenerPorId(@PathVariable Integer id) {
        return alertaService.obtenerPorId(id);
    }

    @PostMapping
    public AlertaEntity guardar(@RequestBody AlertaEntity alerta) {
        return alertaService.guardar(alerta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        alertaService.eliminar(id);
    }
}