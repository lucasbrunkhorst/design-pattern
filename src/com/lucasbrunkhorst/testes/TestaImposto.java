package com.lucasbrunkhorst.testes;

import com.lucasbrunkhorst.imposto.CalculadoraDeImpostos;
import com.lucasbrunkhorst.imposto.ICMS;
import com.lucasbrunkhorst.imposto.ISS;
import com.lucasbrunkhorst.orcamento.ItemOrcamento;
import com.lucasbrunkhorst.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestaImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("3")));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
    }
}
