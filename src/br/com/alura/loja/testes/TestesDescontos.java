package br.com.alura.loja.testes;
import java.math.BigDecimal;

import br.com.alura.loja.descontos.CalculadorDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
		
		CalculadorDeDescontos calculadora = new CalculadorDeDescontos();
		
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));
	}

}