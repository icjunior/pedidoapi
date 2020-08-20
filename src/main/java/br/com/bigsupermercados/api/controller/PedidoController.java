package br.com.bigsupermercados.api.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.bigsupermercados.api.controller.dto.PedidoDTO;
import br.com.bigsupermercados.api.controller.form.PedidoForm;
import br.com.bigsupermercados.api.modelo.ZanPedido;
import br.com.bigsupermercados.api.modelo.ZanPedidoNumeracao;
import br.com.bigsupermercados.api.services.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;

	@GetMapping
	public List<PedidoDTO> listar() {
		List<ZanPedido> pedidos = pedidoService.listarTodos();
		return PedidoDTO.converter(pedidos);
	}

	@PostMapping
	public ResponseEntity<?> cadastrar(@RequestBody @Valid PedidoForm form, UriComponentsBuilder uriBuilder) {
		
		System.out.println("Requisição para criação de pedido");
		
		ZanPedidoNumeracao numeroPedido = pedidoService.numeroPedido();
		ZanPedido pedido = form.converter(numeroPedido);

		pedidoService.salvar(pedido, form.getItens());

		pedidoService.salvarItens(numeroPedido, form.getItens());
		pedidoService.atualizarNumeroPedido(numeroPedido);

		System.out.println("Pedido " + pedido.getZanPedidoPK().getCodPedido() + " criado com sucesso.");
		
		URI uri = uriBuilder.path("/pedido/{id}").buildAndExpand(pedido.getZanPedidoPK().getCodPedido()).toUri();
		return ResponseEntity.created(uri).body(new PedidoDTO(pedido));
	}
}