package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadorDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		//chain of responsability
		
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()
						)
				);
		
		return desconto.calcular(orcamento); //chama o metodo da classe pai, as classes filhas (ex: DescontoParaOrcamentoComMaisDeCincoItens) nao tem a logica de chamar o proximo desconto
	}
}
