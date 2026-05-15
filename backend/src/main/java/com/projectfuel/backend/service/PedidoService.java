package com.projectfuel.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectfuel.backend.entity.PedidoEntity;
import com.projectfuel.backend.repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoEntity crearPedido(PedidoEntity pedido) {

        pedido.setEstado("PENDIENTE");

        return pedidoRepository.save(pedido);
    }

    public List<PedidoEntity> obtenerTodos() {
        return pedidoRepository.findAll();
    }

    public PedidoEntity actualizarEstado(
            Integer id,
            String estado) {

        PedidoEntity pedido = pedidoRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Pedido no encontrado"));

        pedido.setEstado(estado);

        return pedidoRepository.save(pedido);
    }

    public PedidoEntity guardar(PedidoEntity pedido) {
        return pedidoRepository.save(pedido);
    }

    public void eliminar(Integer id) {
        pedidoRepository.deleteById(id);
    }
    
    public PedidoEntity obtenerPorId(Integer id) {
        return pedidoRepository.findById(id).orElse(null);
    }
}