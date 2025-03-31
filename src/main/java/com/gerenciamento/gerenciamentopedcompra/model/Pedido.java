package com.gerenciamento.gerenciamentopedcompra.model;

import ch.qos.logback.core.testUtil.TeeOutputStream;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pedido {

    @NotNull (message = "O id o Pedido não pode ser nulo.")
    private Integer id;

    @NotBlank (message = "O produto não pode estar em branco.")
    public String produto;

    // O Spring precisa de uma declaração em branco para funcionar.
    public Pedido(){
    }

    public Pedido(Integer id, String produto){
        this.id = id;
        this.produto = produto;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
