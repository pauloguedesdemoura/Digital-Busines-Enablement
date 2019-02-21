package br.com.fiap.teste;








import org.apache.log4j.Logger;

import br.com.fiap.singleton.ConfiguracaoSingleton;

public class Teste {

	//Criar o objeto para realizar o log
	
	private static Logger log = Logger.getLogger(Teste.class);
	
	public static void main(String[] args) {
		
		log.trace("guardando as informaões");
		//Recuperar o Idioma 
		System.out.println(ConfiguracaoSingleton.getInstance().getProperty("desenvolvimento"));
			

	}

}
