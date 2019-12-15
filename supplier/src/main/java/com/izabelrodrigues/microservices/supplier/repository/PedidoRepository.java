package com.izabelrodrigues.microservices.supplier.repository;

import org.springframework.data.repository.CrudRepository;

import com.izabelrodrigues.microservices.supplier.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
