package com.izabelrodrigues.microservices.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.izabelrodrigues.microservices.model.Compra;
import com.izabelrodrigues.microservices.store.dto.CompraDTO;
import com.izabelrodrigues.microservices.store.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {

	@Autowired
	private CompraService compraService;

	@RequestMapping(method = RequestMethod.POST)
	public Compra realizaCompra(@RequestBody CompraDTO compra) {

		return compraService.processar(compra);
	}
}
