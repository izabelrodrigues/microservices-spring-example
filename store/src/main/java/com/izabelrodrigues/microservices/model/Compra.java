package com.izabelrodrigues.microservices.model;

import com.izabelrodrigues.microservices.store.dto.InfoPedidoDTO;

public class Compra {

	private Long pedidoId;
	
	private Integer tempoProcessamento;
	
	private String enderecoDestino;

	/**
	 * @return the pedidoId
	 */
	public Long getPedidoId() {
		return pedidoId;
	}

	/**
	 * @param pedidoId the pedidoId to set
	 */
	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}

	/**
	 * @return the tempoProcessamento
	 */
	public Integer getTempoProcessamento() {
		return tempoProcessamento;
	}

	/**
	 * @param tempoProcessamento the tempoProcessamento to set
	 */
	public void setTempoProcessamento(Integer tempoProcessamento) {
		this.tempoProcessamento = tempoProcessamento;
	}

	/**
	 * @return the enderecoDestino
	 */
	public String getEnderecoDestino() {
		return enderecoDestino;
	}

	/**
	 * @param enderecoDestino the enderecoDestino to set
	 */
	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}
	
	
	public Compra infoPedidoTOCompra(InfoPedidoDTO pedido, String enderecoDestino) {
		this.setPedidoId(pedido.getId());
		this.setTempoProcessamento(pedido.getTempoDePreparo());
		this.setEnderecoDestino(enderecoDestino);
		return this;
	}
}
