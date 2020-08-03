package br.com.bigsupermercados.api.controller.dto;

import java.math.BigDecimal;

import br.com.bigsupermercados.api.modelo.ZanPedidoItem;

public class PedidoItemDTO {

	private Integer codLoja;
	private Integer codPedido;
	private Integer codPedidoItem;
	private String codMercadoria;
	private BigDecimal precoUnitario;
	private BigDecimal quantidade;
	private BigDecimal valorDesconto;

	public PedidoItemDTO(ZanPedidoItem pedidoItem) {
		super();
		this.codLoja = pedidoItem.getZanPedidoItemPK().getCodLoja();
		this.codPedido = pedidoItem.getZanPedidoItemPK().getCodPedido();
		this.codPedidoItem = pedidoItem.getZanPedidoItemPK().getCodPedidoItem();
		this.codMercadoria = pedidoItem.getCodMercadoria();
		this.precoUnitario = pedidoItem.getPrecoUnitario();
		this.quantidade = pedidoItem.getQuantidade();
		this.valorDesconto = pedidoItem.getValorDesconto();
	}

	public Integer getCodLoja() {
		return codLoja;
	}

	public Integer getCodPedido() {
		return codPedido;
	}

	public Integer getCodPedidoItem() {
		return codPedidoItem;
	}

	public String getCodMercadoria() {
		return codMercadoria;
	}

	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}
}
