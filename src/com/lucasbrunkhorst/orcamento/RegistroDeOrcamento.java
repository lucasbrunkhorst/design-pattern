package com.lucasbrunkhorst.orcamento;

import com.lucasbrunkhorst.DomainException;
import com.lucasbrunkhorst.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        if(!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento nao finalizado!");
        }
        String url = "https://api.externa.com";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidade", orcamento.getQuantidadeItens()
            );
        http.post(url, dados);

    }
}
