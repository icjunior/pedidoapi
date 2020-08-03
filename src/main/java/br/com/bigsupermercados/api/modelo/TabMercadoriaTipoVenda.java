package br.com.bigsupermercados.api.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tab_mercadoria_tipo_venda")
public class TabMercadoriaTipoVenda {

	@EmbeddedId
	private TabMercadoriaTipoVendaPK tabMercadoriaTipoVendaPK;

	@Column(name = "preco_unitario")
	private BigDecimal precoUnitario;

	public TabMercadoriaTipoVenda() {

	}

	public TabMercadoriaTipoVenda(TabMercadoriaTipoVendaPK tabMercadoriaTipoVendaPK, BigDecimal precoUnitario) {
		this.tabMercadoriaTipoVendaPK = tabMercadoriaTipoVendaPK;
		this.precoUnitario = precoUnitario;
	}

	public TabMercadoriaTipoVendaPK getTabMercadoriaTipoVendaPK() {
		return tabMercadoriaTipoVendaPK;
	}

	public void setTabMercadoriaTipoVendaPK(TabMercadoriaTipoVendaPK tabMercadoriaTipoVendaPK) {
		this.tabMercadoriaTipoVendaPK = tabMercadoriaTipoVendaPK;
	}

	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(BigDecimal precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tabMercadoriaTipoVendaPK == null) ? 0 : tabMercadoriaTipoVendaPK.hashCode());
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
		TabMercadoriaTipoVenda other = (TabMercadoriaTipoVenda) obj;
		if (tabMercadoriaTipoVendaPK == null) {
			if (other.tabMercadoriaTipoVendaPK != null)
				return false;
		} else if (!tabMercadoriaTipoVendaPK.equals(other.tabMercadoriaTipoVendaPK))
			return false;
		return true;
	}
}
