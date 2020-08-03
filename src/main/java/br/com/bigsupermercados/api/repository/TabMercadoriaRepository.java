package br.com.bigsupermercados.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bigsupermercados.api.modelo.TabMercadoria;
import br.com.bigsupermercados.api.modelo.TabMercadoriaPK;

public interface TabMercadoriaRepository extends JpaRepository<TabMercadoria, TabMercadoriaPK> {

}
