package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	public Desconto (Desconto desconto) {
		this.proximo = desconto;
	}
	
	//Template Method
	public BigDecimal calcular(Orcamento orcamento) {
		if (deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	}
	
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento); //metodo abstrato obriga os filhos a implementarem o metodo
	protected abstract boolean deveAplicar(Orcamento orcamento);

}
