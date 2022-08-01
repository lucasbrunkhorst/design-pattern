package com.lucasbrunkhorst.imposto;

import com.lucasbrunkhorst.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}
