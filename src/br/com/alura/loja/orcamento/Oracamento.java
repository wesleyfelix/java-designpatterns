package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Oracamento {

    private BigDecimal valor;

    public Oracamento(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

}
