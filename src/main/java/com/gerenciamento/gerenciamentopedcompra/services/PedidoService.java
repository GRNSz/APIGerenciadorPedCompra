package com.gerenciamento.gerenciamentopedcompra.services;

import com.gerenciamento.gerenciamentopedcompra.model.Pedido;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import jakarta.validation.Validator;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidoService {

    @Autowired
    private Validator validator;

    private final List<Pedido> pedidos = new ArrayList<>();

    @GetMapping("/listar")
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    @PostMapping("/inserirped")
    public Pedido inserirPedido(@Valid @RequestBody Pedido pedido) {
        Set<ConstraintViolation<Pedido>> validate = validator.validate(pedido);
        if (!validate.isEmpty()) {
            throw new IllegalArgumentException("Erro ao inserir pedido");
        }
        // validator.validate(pedido);
        pedidos.add(pedido);
        System.out.println("Pedido inserido com sucesso");
        return pedido;
    }

    

}
