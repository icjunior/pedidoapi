package br.com.bigsupermercados.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bigsupermercados.api.modelo.TabMercadoria;
import br.com.bigsupermercados.api.modelo.TabMercadoriaPK;

public interface TabMercadoriaRepository extends JpaRepository<TabMercadoria, TabMercadoriaPK> {

	List<TabMercadoria> findByTabMercadoriaPK_CodLoja(Integer codLoja);

	Optional<TabMercadoria> findByTabMercadoriaPK_CodLojaAndTabMercadoriaPK_CodMercadoria(Integer codLoja, String codMercadoria);
}
