package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadorDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		//regras de negocio abaixo
		
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()
						)
				);
		
		return desconto.calcular(orcamento);
		
	}

}
