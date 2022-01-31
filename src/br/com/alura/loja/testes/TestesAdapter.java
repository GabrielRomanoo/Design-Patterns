package br.com.alura.loja.testes;

import java.io.IOException;
import java.math.BigDecimal;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;
import br.com.alura.loja.util.http.JavaHttpClient;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
		orcamento.aprovar();
		orcamento.finalizar();
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		try {
			registro.registrar(orcamento);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
