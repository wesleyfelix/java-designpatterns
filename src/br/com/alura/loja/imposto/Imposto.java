package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Oracamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Oracamento oracamento);
}
