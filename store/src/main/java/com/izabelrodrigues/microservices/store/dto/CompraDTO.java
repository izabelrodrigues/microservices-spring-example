package com.izabelrodrigues.microservices.store.dto;

import java.util.List;

public class CompraDTO {

	private List<ItemCompraDTO> itens;

	private EnderecoDTO endereco;

	/**
	 * @return the itens
	 */
	public List<ItemCompraDTO> getItens() {
		return itens;
	}

	/**
	 * @param itens the itens to set
	 */
	public void setItens(List<ItemCompraDTO> itens) {
		this.itens = itens;
	}

	/**
	 * @return the endereco
	 */
	public EnderecoDTO getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

}
