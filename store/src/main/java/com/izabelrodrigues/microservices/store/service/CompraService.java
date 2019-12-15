package com.izabelrodrigues.microservices.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import com.izabelrodrigues.microservices.store.dto.CompraDTO;
import com.izabelrodrigues.microservices.store.dto.InfoFornecedorDTO;
import com.izabelrodrigues.microservices.store.feign.SupllierClient;

@Service
public class CompraService {

	/*
	 * Implementação com RestTemplate
	 *
	 * @Autowired private RestTemplate client;
	 *
	 *
	 * public void processar(CompraDTO compra) {
	 *
	 * String estado = compra.getEndereco().getEstado();
	 *
	 * ResponseEntity<InfoFornecedorDTO> exchange = client.exchange(
	 * Constants.IntegrationServices.URL_SERVICE_SUPPLIER + estado, HttpMethod.GET,
	 * null, InfoFornecedorDTO.class);
	 *
	 * System.out.println(exchange.getBody().getEndereco());
	 *
	 * }
	 */

	/**
	 * Implementação utilizando Feing (
	 */

	@Autowired
	private SupllierClient supplierClient;

	@Autowired
	private DiscoveryClient discoveryClient;

	public void processar(CompraDTO compra) {
		String estado = compra.getEndereco().getEstado();
		InfoFornecedorDTO infoPorEstado = supplierClient.getInfoPorEstado(estado);
		System.out.println(infoPorEstado.getEndereco());

		discoveryClient.getInstances("supllier").stream()
				.forEach(supplier -> System.out.println("localhost:" + supplier.getPort()));
	}
}
