package br.com.bigsupermercados.api.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bigsupermercados.api.controller.form.PedidoItemForm;
import br.com.bigsupermercados.api.modelo.ZanPedido;
import br.com.bigsupermercados.api.modelo.ZanPedidoItem;
import br.com.bigsupermercados.api.modelo.ZanPedidoItemPK;
import br.com.bigsupermercados.api.modelo.ZanPedidoNumeracao;
import br.com.bigsupermercados.api.repository.TabMercadoriaRepository;
import br.com.bigsupermercados.api.repository.TabMercadoriaTipoVendaRepository;
import br.com.bigsupermercados.api.repository.ZanPedidoItemRepository;
import br.com.bigsupermercados.api.repository.ZanPedidoNumeracaoRepository;
import br.com.bigsupermercados.api.repository.ZanPedidoRepository;
import br.com.bigsupermercados.api.util.Util;

@Service
public class PedidoService {

	@Autowired
	ZanPedidoRepository zanPedidoRepository;

	@Autowired
	TabMercadoriaRepository tabMercadoriaRepository;

	@Autowired
	ZanPedidoItemRepository zanPedidoItemRepository;

	@Autowired
	TabMercadoriaTipoVendaRepository tabMercadoriaTipoVendaRepository;

	@Autowired
	ZanPedidoNumeracaoRepository zanPedidoNumeracaoRepository;

	public void salvar(ZanPedido pedido, List<PedidoItemForm> itens) {
		pedido.setValorPedido(calculaTotal(itens));
		zanPedidoRepository.save(pedido);
	}

	public void salvarItens(ZanPedidoNumeracao numeroPedido, List<PedidoItemForm> itens) {

		List<ZanPedidoItem> pedidoItem = itens.stream().map(item -> {
			BigDecimal precoUnitario = buscaPrecoUnitario(2, Util.converteCodigo(item.getCodMercadoria()), 1);

			ZanPedidoItem itemPedido = new ZanPedidoItem(
					new ZanPedidoItemPK(numeroPedido.getNumeroPedido(), item.getCodPedidoItem(), item.getCodLoja()),
					Util.converteCodigo(item.getCodMercadoria()), precoUnitario, item.getQuantidade(),
					item.getValorDesconto());
			return itemPedido;
		}).collect(Collectors.toList());

		zanPedidoItemRepository.saveAll(pedidoItem);
	}

	public List<ZanPedido> listarTodos() {
		return zanPedidoRepository.findByZanPedidoPKCodLojaOrderByZanPedidoPKCodPedidoDesc(2);
	}

	private BigDecimal buscaPrecoUnitario(Integer codLoja, String codMercadoria, Integer codTipoVenda) {
		return tabMercadoriaTipoVendaRepository
				.findByTabMercadoriaTipoVendaPKCodLojaAndTabMercadoriaTipoVendaPKCodMercadoriaAndTabMercadoriaTipoVendaPKCodTipoVenda(
						2, Util.converteCodigo(codMercadoria), 1)
				.getPrecoUnitario();
	}

	private BigDecimal calculaTotal(List<PedidoItemForm> itens) {
		return itens.stream().map(item -> buscaPrecoUnitario(2, Util.converteCodigo(item.getCodMercadoria()), 1)
				.multiply(item.getQuantidade())).reduce(BigDecimal.ZERO, BigDecimal::add);
	}

	public ZanPedidoNumeracao numeroPedido() {
		return zanPedidoNumeracaoRepository.findById(1).get();
	}

	public void atualizarNumeroPedido(ZanPedidoNumeracao numeroPedido) {
		Integer numeroPedidoAtualizado = numeroPedido.getNumeroPedido() + 1;
		numeroPedido.setNumeroPedido(numeroPedidoAtualizado);
		zanPedidoNumeracaoRepository.save(numeroPedido);
	}

//	public String converteCodigo(String codMercadoria) {
//		return String.format("%017d", Long.parseLong(codMercadoria));
//	}
}