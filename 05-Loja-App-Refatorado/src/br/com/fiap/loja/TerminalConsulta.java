package br.com.fiap.loja;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import br.com.fiap.loja.bo.EstoqueBO;
import br.com.fiap.loja.exception.ProdutoNaoEncontradoException;
import br.com.fiap.loja.to.produtoTO;

public class TerminalConsulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		EstoqueBO bo = new EstoqueBO();
		Calendar data = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("LojaFiap" + sdf.format(data.getTime()));
		System.out.println("Diite o codigo: ");
		int codigo = sc.nextInt();
		
		
		try {
			produtoTO produto = bo.consultarProducao(codigo);
			System.out.println(produto.getDescricao());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("Quantidade: " + produto.getQuantidade());			
			
		} catch (ProdutoNaoEncontradoException e) {
			System.out.println("produto nao encontrado!!!!");
		}

		sc.close();
		

	}

}
