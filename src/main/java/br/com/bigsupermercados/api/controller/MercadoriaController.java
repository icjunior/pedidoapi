package br.com.bigsupermercados.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bigsupermercados.api.controller.dto.TabMercadoriaDTO;
import br.com.bigsupermercados.api.modelo.TabMercadoria;
import br.com.bigsupermercados.api.services.MercadoriaService;

@RestController
@RequestMapping("/mercadoria")
public class MercadoriaController {

	@Autowired
	private MercadoriaService mercadoriaService;

	@GetMapping("/{codLoja}/{codMercadoria}")
	private ResponseEntity<TabMercadoriaDTO> buscarPorLoja(@PathVariable Integer codLoja,
			@PathVariable String codMercadoria) {
		Optional<TabMercadoria> mercadoria = mercadoriaService.buscarMaterial(codLoja, codMercadoria);
		if (mercadoria.isPresent()) {
			return ResponseEntity.ok(TabMercadoriaDTO.converter(mercadoria.get()));
		}
		return ResponseEntity.badRequest().build();
	}
}
