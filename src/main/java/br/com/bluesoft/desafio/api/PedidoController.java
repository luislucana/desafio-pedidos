package br.com.bluesoft.desafio.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;

	@PostMapping
	public List<Pedido> criar(@RequestBody List<PedidoTO> pedidos) throws Exception {

		// TODO - Chamar a api abaixo
		// https://egf1amcv33.execute-api.us-east-1.amazonaws.com/dev/produto/{{gtin}}

		// O sistema deve selecionar o melhor fornecedor para compra de cada produto,
		// considerando o menor preço que atenda a quantidade mínima de compra.
		// Em seguida, deverá agrupar os produtos de um mesmo fornecedor e criar um pedido para cada um.

		return pedidoService.criar(pedidos);
	}
}
