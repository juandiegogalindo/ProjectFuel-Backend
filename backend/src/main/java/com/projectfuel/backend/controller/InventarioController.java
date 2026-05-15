package com.projectfuel.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projectfuel.backend.entity.InventarioEntity;
import com.projectfuel.backend.service.InventarioService;

@RestController
@RequestMapping("/inventarios")
@CrossOrigin("*")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @GetMapping
    public List<InventarioEntity> obtenerTodos() {
        return inventarioService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public InventarioEntity obtenerPorId(@PathVariable Integer id) {
        return inventarioService.obtenerPorId(id);
    }

    @PostMapping
    public InventarioEntity guardar(@RequestBody InventarioEntity inventario) {
        return inventarioService.guardar(inventario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        inventarioService.eliminar(id);
    }
}