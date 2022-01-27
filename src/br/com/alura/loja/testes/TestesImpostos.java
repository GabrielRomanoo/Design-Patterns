package br.com.alura.loja.testes;
import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		BigDecimal valor = calculadora.calcular(orcamento, new ISS(new ICMS(null)));
		System.out.println(valor);
	}

}
