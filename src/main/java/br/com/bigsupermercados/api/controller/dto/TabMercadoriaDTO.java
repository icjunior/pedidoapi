package br.com.bigsupermercados.api.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.bigsupermercados.api.modelo.TabMercadoria;

public class TabMercadoriaDTO {

	private Integer codLoja;
	private String codMercadoria;
	private String descricao;

	public TabMercadoriaDTO(TabMercadoria tabMercadoria) {
		super();
		this.codLoja = tabMercadoria.getTabMercadoriaPK().getCodLoja();
		this.codMercadoria = tabMercadoria.getTabMercadoriaPK().getCodMercadoria();
		this.descricao = tabMercadoria.getDescricao();
	}

	public Integer getCodLoja() {
		return codLoja;
	}

	public String getCodMercadoria() {
		return codMercadoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public static List<TabMercadoriaDTO> converter(List<TabMercadoria> mercadorias) {
		return mercadorias.stream().map(TabMercadoriaDTO::new).collect(Collectors.toList());
	}

	public static TabMercadoriaDTO converter(TabMercadoria mercadoria) {
		return new TabMercadoriaDTO(mercadoria);
	}
}
