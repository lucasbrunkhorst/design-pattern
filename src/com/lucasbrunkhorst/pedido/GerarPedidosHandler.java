package com.lucasbrunkhorst.pedido;

import com.lucasbrunkhorst.orcamento.ItemOrcamento;
import com.lucasbrunkhorst.orcamento.Orcamento;
import com.lucasbrunkhorst.pedido.acao.AcaoAposGerarPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GerarPedidosHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GerarPedidosHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GerarPedidos dados){
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("300")));
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));

    }
}
