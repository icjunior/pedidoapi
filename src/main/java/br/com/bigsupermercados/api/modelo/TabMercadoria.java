package br.com.bigsupermercados.api.modelo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tab_mercadoria")
public class TabMercadoria {

	@EmbeddedId
	private TabMercadoriaPK tabMercadoriaPK;

	private String descricao;

	public TabMercadoria() {

	}

	public TabMercadoria(TabMercadoriaPK tabMercadoriaPK, String descricao) {
		super();
		this.tabMercadoriaPK = tabMercadoriaPK;
		this.descricao = descricao;
	}

	public TabMercadoriaPK getTabMercadoriaPK() {
		return tabMercadoriaPK;
	}

	public void setTabMercadoriaPK(TabMercadoriaPK tabMercadoriaPK) {
		this.tabMercadoriaPK = tabMercadoriaPK;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tabMercadoriaPK == null) ? 0 : tabMercadoriaPK.hashCode());
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
		TabMercadoria other = (TabMercadoria) obj;
		if (tabMercadoriaPK == null) {
			if (other.tabMercadoriaPK != null)
				return false;
		} else if (!tabMercadoriaPK.equals(other.tabMercadoriaPK))
			return false;
		return true;
	}
}
