package br.com.bigsupermercados.api.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TabMercadoriaTipoVendaPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "cod_loja")
	private Integer codLoja;

	@Column(name = "cod_mercadoria")
	private String codMercadoria;

	@Column(name = "cod_tipo_venda")
	private Integer codTipoVenda;

	public TabMercadoriaTipoVendaPK() {

	}

	public TabMercadoriaTipoVendaPK(Integer codLoja, String codMercadoria, Integer codTipoVenda) {
		super();
		this.codLoja = codLoja;
		this.codMercadoria = codMercadoria;
		this.codTipoVenda = codTipoVenda;
	}

	public Integer getCodLoja() {
		return codLoja;
	}

	public void setCodLoja(Integer codLoja) {
		this.codLoja = codLoja;
	}

	public String getCodMercadoria() {
		return codMercadoria;
	}

	public void setCodMercadoria(String codMercadoria) {
		this.codMercadoria = codMercadoria;
	}

	public Integer getCodTipoVenda() {
		return codTipoVenda;
	}

	public void setCodTipoVenda(Integer codTipoVenda) {
		this.codTipoVenda = codTipoVenda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codLoja == null) ? 0 : codLoja.hashCode());
		result = prime * result + ((codMercadoria == null) ? 0 : codMercadoria.hashCode());
		result = prime * result + ((codTipoVenda == null) ? 0 : codTipoVenda.hashCode());
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
		TabMercadoriaTipoVendaPK other = (TabMercadoriaTipoVendaPK) obj;
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
		if (codTipoVenda == null) {
			if (other.codTipoVenda != null)
				return false;
		} else if (!codTipoVenda.equals(other.codTipoVenda))
			return false;
		return true;
	}

}
