package com.lucasbrunkhorst;

import com.lucasbrunkhorst.desconto.CalculadoraDeDescontos;
import com.lucasbrunkhorst.imposto.CalculadoraDeImpostos;
import com.lucasbrunkhorst.imposto.ISS;
import com.lucasbrunkhorst.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}
