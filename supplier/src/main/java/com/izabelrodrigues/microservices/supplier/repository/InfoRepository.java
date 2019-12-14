package com.izabelrodrigues.microservices.supplier.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.izabelrodrigues.microservices.supplier.model.InfoFornecedor;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {

	InfoFornecedor findByEstado(String estado);

}
