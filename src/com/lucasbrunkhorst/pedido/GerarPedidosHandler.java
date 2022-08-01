package com.lucasbrunkhorst.pedido;

import com.lucasbrunkhorst.orcamento.Orcamento;
import com.lucasbrunkhorst.pedido.acao.AcaoAposGerarPedido;
import com.lucasbrunkhorst.pedido.acao.EnviarEmailPedido;
import com.lucasbrunkhorst.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GerarPedidosHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GerarPedidosHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GerarPedidos dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));

    }
}
