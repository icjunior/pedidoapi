package br.com.bigsupermercados.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bigsupermercados.api.modelo.TabMercadoriaTipoVenda;
import br.com.bigsupermercados.api.repository.TabMercadoriaTipoVendaRepository;
import br.com.bigsupermercados.api.util.Util;

@Service
public class TabMercadoriaTipoVendaService {

	@Autowired
	private TabMercadoriaTipoVendaRepository repository;

	public TabMercadoriaTipoVenda buscarPorMaterialELoja(Integer codLoja, String codMercadoria) {
		return repository
				.findByTabMercadoriaTipoVendaPKCodLojaAndTabMercadoriaTipoVendaPKCodMercadoriaAndTabMercadoriaTipoVendaPKCodTipoVenda(
						codLoja, Util.converteCodigo(codMercadoria), 1);
	}

	public List<TabMercadoriaTipoVenda> buscarTodos(Integer codLoja) {
		return repository.findByTabMercadoriaTipoVendaPKCodLojaAndTabMercadoriaTipoVendaPKCodTipoVenda(codLoja, 1);
	}
}
