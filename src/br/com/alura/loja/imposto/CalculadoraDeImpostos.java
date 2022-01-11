package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto tipoImposto) {
		//regra de negocio
		return tipoImposto.calcular(orcamento);
	}
}
