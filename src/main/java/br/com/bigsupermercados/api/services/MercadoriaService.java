package br.com.bigsupermercados.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bigsupermercados.api.modelo.TabMercadoria;
import br.com.bigsupermercados.api.repository.TabMercadoriaRepository;
import br.com.bigsupermercados.api.util.Util;

@Service
public class MercadoriaService {

	@Autowired
	private TabMercadoriaRepository repository;

	public List<TabMercadoria> listarPorLoja(Integer codLoja) {
		return repository.findByTabMercadoriaPK_CodLoja(codLoja);
	}

	public Optional<TabMercadoria> buscarMaterial(Integer codLoja, String codMercadoria) {
		return repository.findByTabMercadoriaPK_CodLojaAndTabMercadoriaPK_CodMercadoria(codLoja,
				Util.converteCodigo(codMercadoria));
	}

}
