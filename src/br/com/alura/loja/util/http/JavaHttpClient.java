package br.com.alura.loja.util.http;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

	@Override
	public void post(String url, Map<String, Object> dado) throws IOException {
		URL urlDaApi = new URL(url);
		URLConnection connection = urlDaApi.openConnection();
		connection.connect();
	}

}
