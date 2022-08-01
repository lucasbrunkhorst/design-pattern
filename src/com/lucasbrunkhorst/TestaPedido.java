package com.lucasbrunkhorst;

import com.lucasbrunkhorst.pedido.GerarPedidos;
import com.lucasbrunkhorst.pedido.GerarPedidosHandler;
import com.lucasbrunkhorst.pedido.acao.EnviarEmailPedido;
import com.lucasbrunkhorst.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestaPedido {
    public static void main(String[] args) {
        String cliente = "Lucas";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("3");

        GerarPedidos gerador = new GerarPedidos(cliente, valorOrcamento, quantidadeItens);
        GerarPedidosHandler handler = new GerarPedidosHandler(Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido()));
        handler.executa(gerador);

    }
}
