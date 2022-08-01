package com.lucasbrunkhorst;

import com.lucasbrunkhorst.http.JavaHttpClient;
import com.lucasbrunkhorst.orcamento.Orcamento;
import com.lucasbrunkhorst.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TesteAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("500"), 5);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());

        registro.registrar(orcamento);
    }
}
