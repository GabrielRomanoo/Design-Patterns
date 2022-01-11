package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	public Desconto (Desconto desconto) {
		this.proximo = desconto;
	}
	
	public abstract BigDecimal calcular(Orcamento orcamento);

}
