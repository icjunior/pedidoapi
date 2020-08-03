package br.com.bigsupermercados.api.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TabMercadoriaPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "cod_mercadoria")
	private String codMercadoria;

	@Column(name = "cod_loja")
	private Integer codLoja;

	public TabMercadoriaPK() {

	}

	public TabMercadoriaPK(String codMercadoria, Integer codLoja) {
		this.codMercadoria = codMercadoria;
		this.codLoja = codLoja;
	}

	public String getCodMercadoria() {
		return codMercadoria;
	}

	public void setCodMercadoria(String codMercadoria) {
		this.codMercadoria = codMercadoria;
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
		result = prime * result + ((codMercadoria == null) ? 0 : codMercadoria.hashCode());
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
		TabMercadoriaPK other = (TabMercadoriaPK) obj;
		if (codLoja == null) {
			if (other.codLoja != null)
				return false;
		} else if (!codLoja.equals(other.codLoja))
			return false;
		if (codMercadoria == null) {
			if (other.codMercadoria != null)
				return false;
		} else if (!codMercadoria.equals(other.codMercadoria))
			return false;
		return true;
	}
}
