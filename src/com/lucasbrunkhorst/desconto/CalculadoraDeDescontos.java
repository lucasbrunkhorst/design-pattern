package com.lucasbrunkhorst.desconto;

import com.lucasbrunkhorst.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoAcimaDeCincoItens(new DescontoAcimaDeQuinhentos(new SemDesconto()));
        return cadeiaDeDescontos.calcular(orcamento);
    }

}
