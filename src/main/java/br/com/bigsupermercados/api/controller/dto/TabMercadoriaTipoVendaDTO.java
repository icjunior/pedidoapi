package br.com.bigsupermercados.api.controller.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import br.com.bigsupermercados.api.modelo.TabMercadoriaTipoVenda;

public class TabMercadoriaTipoVendaDTO {

	private Integer codLoja;
	private String codMercadoria;
	private Integer codTipoVenda;
	private BigDecimal precoUnitario;

	public TabMercadoriaTipoVendaDTO(TabMercadoriaTipoVenda tabMercadoriaTipoVenda) {
		super();
		this.codLoja = tabMercadoriaTipoVenda.getTabMercadoriaTipoVendaPK().getCodLoja();
		this.codMercadoria = tabMercadoriaTipoVenda.getTabMercadoriaTipoVendaPK().getCodMercadoria();
		this.codTipoVenda = tabMercadoriaTipoVenda.getTabMercadoriaTipoVendaPK().getCodTipoVenda();
		this.precoUnitario = tabMercadoriaTipoVenda.getPrecoUnitario();
	}

	public Integer getCodLoja() {
		return codLoja;
	}

	public String getCodMercadoria() {
		return codMercadoria;
	}

	public Integer getCodTipoVenda() {
		return codTipoVenda;
	}

	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}

	public static TabMercadoriaTipoVendaDTO converter(TabMercadoriaTipoVenda tabMercadoriaTipoVenda) {
		return new TabMercadoriaTipoVendaDTO(tabMercadoriaTipoVenda);
	}

	public static List<TabMercadoriaTipoVendaDTO> converter(List<TabMercadoriaTipoVenda> itens) {
		return itens.stream().map(TabMercadoriaTipoVendaDTO::new).collect(Collectors.toList());
	}
}
