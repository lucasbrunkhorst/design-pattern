package com.lucasbrunkhorst.testes;

import com.lucasbrunkhorst.http.JavaHttpClient;
import com.lucasbrunkhorst.orcamento.ItemOrcamento;
import com.lucasbrunkhorst.orcamento.Orcamento;
import com.lucasbrunkhorst.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TesteAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("300")));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());

        registro.registrar(orcamento);
    }
}
