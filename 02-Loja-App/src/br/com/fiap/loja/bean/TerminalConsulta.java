package br.com.fiap.loja.bean;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

import javax.swing.JOptionPane;

import br.com.fiap.loja.bo.EstoqueBO;

public class TerminalConsulta {

	public static void main(String[] args) {
		
		
		
		Calendar dataAtual = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");		
		EstoqueBO eb = new EstoqueBO();
		
		System.out.println(eb.ConsultaProduto(JOptionPane.showInputDialog("Lojas Fiap:   " 
				+ sdf.format(dataAtual.getTime()))));
		
		
		
		
			
	}

}
