package br.com.bigsupermercados.api.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ZanPedidoItemPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "cod_pedido")
	private Integer codPedido;

	@Column(name = "cod_pedido_item")
	private Integer codPedidoItem;

	@Column(name = "cod_loja")
	private Integer codLoja;

	public ZanPedidoItemPK() {

	}

	public ZanPedidoItemPK(Integer codPedido, Integer codPedidoItem, Integer codLoja) {
		super();
		this.codPedido = codPedido;
		this.codPedidoItem = codPedidoItem;
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

	public Integer getCodLoja() {
		return codLoja;
	}

	public void setCodLoja(Integer codLoja) {
		this.codLoja = codLoja;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codLoja == null) ? 0 : codLoja.hashCode());
		result = prime * result + ((codPedido == null) ? 0 : codPedido.hashCode());
		result = prime * result + ((codPedidoItem == null) ? 0 : codPedidoItem.hashCode());
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
		ZanPedidoItemPK other = (ZanPedidoItemPK) obj;
		if (codLoja == null) {
			if (other.codLoja != null)
				return false;
		} else if (!codLoja.equals(other.codLoja))
			return false;
		if (codPedido == null) {
			if (other.codPedido != null)
				return false;
		} else if (!codPedido.equals(other.codPedido))
			return false;
		if (codPedidoItem == null) {
			if (other.codPedidoItem != null)
				return false;
		} else if (!codPedidoItem.equals(other.codPedidoItem))
			return false;
		return true;
	}
}
