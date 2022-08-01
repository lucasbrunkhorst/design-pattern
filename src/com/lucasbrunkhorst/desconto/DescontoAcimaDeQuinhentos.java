package com.lucasbrunkhorst.desconto;

import com.lucasbrunkhorst.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoAcimaDeQuinhentos extends Desconto {

    public DescontoAcimaDeQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(0.05));
    }
    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }


}
