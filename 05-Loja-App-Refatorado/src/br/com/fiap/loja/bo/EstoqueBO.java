package br.com.fiap.loja.bo;

import br.com.fiap.loja.exception.ProdutoNaoEncontradoException;
import br.com.fiap.loja.to.produtoTO;

//Camada de negocio
public class EstoqueBO {
	
	
	public produtoTO consultarProducao(int codigo) throws ProdutoNaoEncontradoException {
		produtoTO produto;
		
		switch (codigo) {
		case 401:
			produto = new produtoTO(401, 10, 100, "Camiseta Branca");
			break;
		case 402:
			produto = new produtoTO(402, 20, 50, "Camiseta azul");		
			break;
		case 403:
			produto = new produtoTO(403, 200, 500, "Camiseta Rosa");								
			break;
		default:
			throw new ProdutoNaoEncontradoException();		
		}
		
		return produto;
	} 
}
