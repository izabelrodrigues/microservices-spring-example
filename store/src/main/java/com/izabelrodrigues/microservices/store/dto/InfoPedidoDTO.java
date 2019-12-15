package com.izabelrodrigues.microservices.store.dto;

public class InfoPedidoDTO {
	
	private Long id;
	
	private Integer tempoDePreparo;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the tempoDePreparo
	 */
	public Integer getTempoDePreparo() {
		return tempoDePreparo;
	}

	/**
	 * @param tempoDePreparo the tempoDePreparo to set
	 */
	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	

}
