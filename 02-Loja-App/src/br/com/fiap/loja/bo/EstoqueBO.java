package br.com.fiap.loja.bo;

import br.com.fiap.loja.dto.EstoqueDTO;

public class EstoqueBO {

	//EstoqueDTO dto = new EstoqueDTO(codigo, preco, quantidade, descricao);
	
	 public EstoqueDTO ConsultaProduto(String codigo){
		 String retorno;		
		switch (codigo) {
		case "401":
			new EstoqueDTO(401, 10.0f, 10, "Camisa Branca");
			break;
		case "402":
			new EstoqueDTO(401, 10.0f, 10, "Camisa Branca");
			break;
		case "403":
			new EstoqueDTO(401, 10.0f, 10, "Camisa Branca");
			break;
		default:			
			new EstoqueDTO(0, 00.0f, 0, "Nenhum Produto com esse codigo");
		}	
		
		//EstoqueDTO dto = EstoqueDTO
		
		return dto;
	
	}
	
	
}
