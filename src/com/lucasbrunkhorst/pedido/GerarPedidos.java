package com.lucasbrunkhorst.pedido;

import com.lucasbrunkhorst.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GerarPedidos {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GerarPedidos(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

}
