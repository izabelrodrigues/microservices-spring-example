package com.izabelrodrigues.microservices.supplier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izabelrodrigues.microservices.supplier.model.InfoFornecedor;
import com.izabelrodrigues.microservices.supplier.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {

	@Autowired
	private InfoService infoService;

	@RequestMapping("/{estado}")
	public InfoFornecedor getInfoPorEstado(@PathVariable String estado) {

		return infoService.getInfoPorEstado(estado);

	}
}
