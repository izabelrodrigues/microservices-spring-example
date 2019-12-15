package com.izabelrodrigues.microservices.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.izabelrodrigues.microservices.store.Constants;
import com.izabelrodrigues.microservices.store.dto.CompraDTO;
import com.izabelrodrigues.microservices.store.dto.InfoFornecedorDTO;

@Service
public class CompraService {

	@Autowired
	private RestTemplate client;

	public void processar(CompraDTO compra) {

		String estado = compra.getEndereco().getEstado();

		ResponseEntity<InfoFornecedorDTO> exchange = client.exchange(
				Constants.IntegrationServices.URL_SERVICE_SUPPLIER + estado, HttpMethod.GET, null,
				InfoFornecedorDTO.class);

		System.out.println(exchange.getBody().getEndereco());

	}

}
