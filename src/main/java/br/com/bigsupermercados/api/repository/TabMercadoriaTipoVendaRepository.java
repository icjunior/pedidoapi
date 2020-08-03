package br.com.bigsupermercados.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bigsupermercados.api.modelo.TabMercadoriaTipoVenda;
import br.com.bigsupermercados.api.modelo.TabMercadoriaTipoVendaPK;

public interface TabMercadoriaTipoVendaRepository
		extends JpaRepository<TabMercadoriaTipoVenda, TabMercadoriaTipoVendaPK> {

	TabMercadoriaTipoVenda findByTabMercadoriaTipoVendaPKCodLojaAndTabMercadoriaTipoVendaPKCodMercadoriaAndTabMercadoriaTipoVendaPKCodTipoVenda(
			int codLoja, String codMercadoria, int codTipoVenda);

}
