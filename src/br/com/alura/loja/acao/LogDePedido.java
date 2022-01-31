package br.com.alura.loja.acao;

import br.com.alura.loja.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Pedido gravado: " + pedido);
	}
}
