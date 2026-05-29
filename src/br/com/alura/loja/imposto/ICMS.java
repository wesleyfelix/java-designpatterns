package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Oracamento;

import java.math.BigDecimal;

public class ICMS implements Imposto{

    public BigDecimal calcular(Oracamento oracamento) {
        return oracamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
