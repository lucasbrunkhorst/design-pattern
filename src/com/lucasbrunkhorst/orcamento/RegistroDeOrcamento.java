package com.lucasbrunkhorst.orcamento;

import com.lucasbrunkhorst.http.HttpAdapter;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
    /*    if(!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento nao finalizado!");
        }
        String url = "";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidade", orcamento.getQuantidadeItens()
            );
        http.post(url, dados);*/

    }
}
