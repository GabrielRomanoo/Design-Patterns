package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto{

	public SemDesconto() {
		super(null);
		// TODO Auto-generated constructor stub
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		//regras de negocio abaixo
		
		return BigDecimal.ZERO;
	}

	@Override
	protected boolean deveAplicar(Orcamento orcamento) {
		return true;
	}
	
}
