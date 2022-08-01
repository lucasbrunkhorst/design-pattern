package com.lucasbrunkhorst;

import com.lucasbrunkhorst.imposto.CalculadoraDeImpostos;
import com.lucasbrunkhorst.imposto.ISS;
import com.lucasbrunkhorst.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestaImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(100), 3);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS()));
    }
}
