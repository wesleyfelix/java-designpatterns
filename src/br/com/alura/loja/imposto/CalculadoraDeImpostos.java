package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Oracamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Oracamento oracamento, Imposto imposto) {
        return imposto.calcular(oracamento);
    }
}
