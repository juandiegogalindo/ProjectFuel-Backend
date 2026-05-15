package com.projectfuel.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projectfuel.backend.entity.CombustibleEntity;
import com.projectfuel.backend.service.CombustibleService;

@RestController
@RequestMapping("/combustibles")
@CrossOrigin("*")
public class CombustibleController {

    @Autowired
    private CombustibleService combustibleService;

    @GetMapping
    public List<CombustibleEntity> obtenerTodos() {
        return combustibleService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public CombustibleEntity obtenerPorId(@PathVariable Integer id) {
        return combustibleService.obtenerPorId(id);
    }

    @PostMapping
    public CombustibleEntity guardar(@RequestBody CombustibleEntity combustible) {
        return combustibleService.guardar(combustible);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        combustibleService.eliminar(id);
    }
}