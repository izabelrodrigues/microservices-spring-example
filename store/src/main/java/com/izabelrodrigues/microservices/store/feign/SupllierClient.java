package com.izabelrodrigues.microservices.store.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.izabelrodrigues.microservices.store.dto.InfoFornecedorDTO;

@FeignClient("supplier")
public interface SupllierClient {

	/**
	 * Implementar apenas os métodos dos serviços que vamos acessar
	 */

	@RequestMapping("/info/{estado}")
	InfoFornecedorDTO getInfoPorEstado(@PathVariable String estado);
}
