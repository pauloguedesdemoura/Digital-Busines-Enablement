package br.com.fiap.teste;

import javax.swing.plaf.synth.SynthSeparatorUI;

import br.com.fiap.singleton.ConfiguracaoSingleton;

public class Teste {

	public static void main(String[] args) {
		
		//Recuperar o Idioma 
		System.out.println(ConfiguracaoSingleton.getInstance().getProperty("idioma"));

	}

}
