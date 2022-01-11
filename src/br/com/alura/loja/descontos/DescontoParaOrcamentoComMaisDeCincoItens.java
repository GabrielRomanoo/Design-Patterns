package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto{

	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto desconto) {
		super(desconto);
		// TODO Auto-generated constructor stub
	}

	public BigDecimal calcular(Orcamento orcamento) {
		//regras de negocio abaixo
		
		if (orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return proximo.calcular(orcamento);
		
	}
	
}
