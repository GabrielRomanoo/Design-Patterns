package br.com.alura.loja.orcamento;

import java.io.IOException;
import java.util.Map;

import br.com.alura.loja.util.exceptions.DomainException;
import br.com.alura.loja.util.http.HttpAdapter;
import br.com.alura.loja.util.http.JavaHttpClient;

public class RegistroDeOrcamento {
	
	public final String url = "http://api.externa/orcamento";
	public Map<String, Object> dados;
	
	public HttpAdapter http;
	
	public RegistroDeOrcamento(JavaHttpClient javaHttpClient) {
		this.http = javaHttpClient;
	}

	public void registrar(Orcamento orcamento) throws IOException {
		if (!orcamento.isFinalizado()) {
			throw new DomainException("Orcamento nao finalizado");
		}
		
		dados.put("valor", orcamento.getValor());
		dados.put("quantiadeItens", orcamento.getQuantidadeItens());
		
		http.post(url, dados);
	}

}
