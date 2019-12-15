package com.izabelrodrigues.microservices.store.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.izabelrodrigues.microservices.store.dto.InfoFornecedorDTO;
import com.izabelrodrigues.microservices.store.dto.InfoPedidoDTO;
import com.izabelrodrigues.microservices.store.dto.ItemCompraDTO;
import com.netflix.ribbon.proxy.annotation.Http.HttpMethod;

/**
 * Interface responsável por conter os métodos de serviços utilizando o Feign
 * @author Izabel Rodrigues
 *
 */
@FeignClient("supplier")
public interface SupllierClient {

	/**
	 * Implementar apenas os métodos dos serviços que vamos acessar
	 */

	@RequestMapping("/info/{estado}")
	InfoFornecedorDTO getInfoPorEstado(@PathVariable String estado);

	@RequestMapping(method = RequestMethod.POST, value = "/pedido")
	InfoPedidoDTO realizaPedido(List<ItemCompraDTO> itens);
}
