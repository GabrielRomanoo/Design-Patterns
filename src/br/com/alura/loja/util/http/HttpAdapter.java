package br.com.alura.loja.util.http;

import java.io.IOException;
import java.util.Map;

public interface HttpAdapter {

	void post(String url, Map<String, Object> dado) throws IOException;
}
