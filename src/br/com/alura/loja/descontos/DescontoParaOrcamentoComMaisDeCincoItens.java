package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto desconto) {
		super(desconto);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		//regras de negocio abaixo
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	protected boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}
	
}
