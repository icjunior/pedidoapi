package br.com.bigsupermercados.api.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ZanPedidoPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "cod_pedido")
	private Integer codPedido;
	@Column(name = "cod_loja")
	private Integer codLoja;
	
	public ZanPedidoPK() {
	}

	public ZanPedidoPK(Integer codPedido, Integer codLoja) {
		this.codPedido = codPedido;
		this.codLoja = codLoja;
	}

	public Integer getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(Integer codPedido) {
		this.codPedido = codPedido;
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
		ZanPedidoPK other = (ZanPedidoPK) obj;
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
		return true;
	}
}
