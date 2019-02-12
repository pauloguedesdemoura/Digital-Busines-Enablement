package br.com.fiap.loja.bean;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class TerminalConsulta {

	public static void main(String[] args) {
		
		boolean sair = false; 
		
		Calendar dataAtual = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");		
		
		do {
			
			String Codigo = JOptionPane.showInputDialog("Lojas Fiap:   " 
			+ sdf.format(dataAtual.getTime()));
			
			switch (Codigo) {
			case "401":
				System.out.println("Camisa Branca");
				break;
			case "402":
				System.out.println("Camisa Azul");	
				break;
			case "403":
				System.out.println("Camisa rosa");	
				break;
			default:			
				System.out.println("Produto não encontrado");
			}			
		
			
		}while(sair == false);
			
	}

}
