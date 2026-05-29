package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Oracamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Oracamento oracamento = new Oracamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(oracamento, new ICMS()));
    }
}
