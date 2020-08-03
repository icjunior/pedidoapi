package br.com.bigsupermercados.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bigsupermercados.api.controller.dto.TabMercadoriaTipoVendaDTO;
import br.com.bigsupermercados.api.modelo.TabMercadoriaTipoVenda;
import br.com.bigsupermercados.api.services.TabMercadoriaTipoVendaService;

@RestController
@RequestMapping("/venda")
public class VendaController {

	@Autowired
	private TabMercadoriaTipoVendaService service;

	@GetMapping("/{codLoja}/{codMercadoria}")
	public TabMercadoriaTipoVendaDTO pesquisarPorMaterial(@PathVariable Integer codLoja,
			@PathVariable String codMercadoria) {
		TabMercadoriaTipoVenda tabMercadoriaTipoVenda = service.buscarPorMaterialELoja(codLoja, codMercadoria);
		return TabMercadoriaTipoVendaDTO.converter(tabMercadoriaTipoVenda);
	}
}
