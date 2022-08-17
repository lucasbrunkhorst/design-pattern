package com.lucasbrunkhorst.testes;

import com.lucasbrunkhorst.desconto.CalculadoraDeDescontos;
import com.lucasbrunkhorst.imposto.CalculadoraDeImpostos;
import com.lucasbrunkhorst.imposto.ISS;
import com.lucasbrunkhorst.orcamento.ItemOrcamento;
import com.lucasbrunkhorst.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("3")));
        Orcamento segundo = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("1")));

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}
