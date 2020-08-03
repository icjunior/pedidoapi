package br.com.bigsupermercados.api.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "zan_pedido_item")
public class ZanPedidoItem {

	@EmbeddedId
	private ZanPedidoItemPK zanPedidoItemPK;

	@Column(name = "cod_mercadoria")
	private String codMercadoria;

	@Column(name = "preco_unitario")
	private BigDecimal precoUnitario;

	@Column(name = "quantidade")
	private BigDecimal quantidade;

	@Column(name = "valor_desconto")
	private BigDecimal valorDesconto;

	public ZanPedidoItem() {

	}

	public ZanPedidoItem(ZanPedidoItemPK zanPedidoItemPK, String codMercadoria, BigDecimal precoUnitario,
			BigDecimal quantidade, BigDecimal valorDesconto) {
		super();
		this.zanPedidoItemPK = zanPedidoItemPK;
		this.codMercadoria = codMercadoria;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
		this.valorDesconto = valorDesconto;
	}

	public ZanPedidoItemPK getZanPedidoItemPK() {
		return zanPedidoItemPK;
	}

	public void setZanPedidoItemPK(ZanPedidoItemPK zanPedidoItemPK) {
		this.zanPedidoItemPK = zanPedidoItemPK;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((zanPedidoItemPK == null) ? 0 : zanPedidoItemPK.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ZanPedidoItem other = (ZanPedidoItem) obj;
		if (zanPedidoItemPK == null) {
			if (other.zanPedidoItemPK != null)
				return false;
		} else if (!zanPedidoItemPK.equals(other.zanPedidoItemPK))
			return false;
		return true;
	}
}
