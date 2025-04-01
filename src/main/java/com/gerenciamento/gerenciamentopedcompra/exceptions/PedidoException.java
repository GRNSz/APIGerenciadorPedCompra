package com.gerenciamento.gerenciamentopedcompra.exceptions;

import com.gerenciamento.gerenciamentopedcompra.model.Pedido;

public class PedidoException extends RuntimeException {

    public PedidoException() {super("Erro ao cadastrar pedido");}

    public PedidoException(String message) {super(message);}
}
