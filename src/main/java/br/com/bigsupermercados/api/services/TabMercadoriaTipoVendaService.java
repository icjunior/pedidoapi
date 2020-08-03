package br.com.bigsupermercados.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bigsupermercados.api.modelo.TabMercadoriaTipoVenda;
import br.com.bigsupermercados.api.repository.TabMercadoriaTipoVendaRepository;

@Service
public class TabMercadoriaTipoVendaService {

	@Autowired
	private TabMercadoriaTipoVendaRepository repository;

	public TabMercadoriaTipoVenda buscarPorMaterialELoja(Integer codLoja, String codMercadoria) {
		return repository
				.findByTabMercadoriaTipoVendaPKCodLojaAndTabMercadoriaTipoVendaPKCodMercadoriaAndTabMercadoriaTipoVendaPKCodTipoVenda(
						codLoja, codMercadoria, 1);
	}
}
