package br.com.bigsupermercados.api.controller.form;

import java.math.BigDecimal;

public class PedidoItemForm {

	private Integer codLoja;
	private Integer codPedido;
	private Integer codPedidoItem;
	private String codMercadoria;
	private BigDecimal precoUnitario;
	private BigDecimal quantidade;
	private BigDecimal valorDesconto;

	public Integer getCodLoja() {
		return codLoja;
	}

	public void setCodLoja(Integer codLoja) {
		this.codLoja = codLoja;
	}

	public Integer getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(Integer codPedido) {
		this.codPedido = codPedido;
	}

	public Integer getCodPedidoItem() {
		return codPedidoItem;
	}

	public void setCodPedidoItem(Integer codPedidoItem) {
		this.codPedidoItem = codPedidoItem;
	}

	public String getCodMercadoria() {
		return codMercadoria;
	}

	public void setCodMercadoria(String codMercadoria) {
		this.codMercadoria = codMercadoria;
	}

	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(BigDecimal precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

//	public List<ZanPedidoItem> converter() {
//		return new ZanPedidoItem(new ZanPedidoItemPK(codPedido, codPedidoItem, codLoja), codMercadoria, precoUnitario,
//				quantidade, valorDesconto);
//	}
}
