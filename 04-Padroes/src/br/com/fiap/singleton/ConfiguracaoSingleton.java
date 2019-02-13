package br.com.fiap.singleton;

import java.io.IOException;
import java.util.Properties;

public class ConfiguracaoSingleton {

	//1- Atributo estatico que armazena um unico Objeto
	private static Properties props;
	
	//2- Método que retorna o único objeto
	public static Properties getInstance() {
		if(props == null) {
			props = new Properties();	
			
		//carregar o objeto com as configuações do arquivo
			try {
				
				props.load(ConfiguracaoSingleton.class.
						getResourceAsStream("/app.properties"));
			} catch (IOException e) {				
				e.printStackTrace();
			}
			
			
		}
		return props;
	}
	
	// 3 - Construtor Privado
	private ConfiguracaoSingleton() {}
	
}
