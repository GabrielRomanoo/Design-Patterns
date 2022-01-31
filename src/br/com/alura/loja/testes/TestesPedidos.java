package br.com.alura.loja.testes;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.acao.EnviarEmailPedido;
import br.com.alura.loja.acao.LogDePedido;
import br.com.alura.loja.acao.SalvarPedidoNoBancoDeDados;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Gabriel";
		BigDecimal valorOrcamento = new BigDecimal("600");
		int quantidadeItens = Integer.parseInt("4");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(
						new EnviarEmailPedido(),
						new SalvarPedidoNoBancoDeDados(),
						new LogDePedido()
						)
				);
		handler.execute(gerador);
	}

}
