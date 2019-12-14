package com.izabelrodrigues.microservices.supplier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izabelrodrigues.microservices.supplier.model.InfoFornecedor;
import com.izabelrodrigues.microservices.supplier.repository.InfoRepository;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;

	public InfoFornecedor getInfoPorEstado(String estado) {
		return infoRepository.findByEstado(estado);
	}
}
