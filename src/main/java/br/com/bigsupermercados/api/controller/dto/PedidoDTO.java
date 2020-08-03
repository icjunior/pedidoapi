package br.com.bigsupermercados.api.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.bigsupermercados.api.modelo.ZanPedido;

public class PedidoDTO {

	private Integer codPedido;
	private LocalDate dataEntrega;
	private Integer numItensPedido;
	private BigDecimal valorAcrescimo;
	private Integer codLoja;
	private BigDecimal valorPedido;
	private LocalDate dataPedido;
	private LocalDate dataCadastro;
	private LocalDate dataUltimaAlteracao;
	private Integer codLojaSaidaMercadoria;
	private Integer codFuncionarioLiberador;
	private Integer situacao;
	private Integer codVendedor;
	private Integer flgTipoCobrancaFrete;

	public PedidoDTO(ZanPedido pedido) {
		super();
		this.codPedido = pedido.getZanPedidoPK().getCodPedido();
		this.dataEntrega = pedido.getDataEntrega();
		this.numItensPedido = pedido.getNumItensPedido();
		this.valorAcrescimo = pedido.getValorAcrescimo();
		this.codLoja = pedido.getZanPedidoPK().getCodLoja();
		this.valorPedido = pedido.getValorPedido();
		this.dataPedido = pedido.getDataPedido();
		this.dataCadastro = pedido.getDataCadastro();
		this.dataUltimaAlteracao = pedido.getDataUltimaAlteracao();
		this.codLojaSaidaMercadoria = pedido.getCodLojaSaidaMercadoria();
		this.codFuncionarioLiberador = pedido.getCodFuncionarioLiberador();
		this.situacao = pedido.getSituacao();
		this.codVendedor = pedido.getCodVendedor();
		this.flgTipoCobrancaFrete = pedido.getFlgTipoCobrancaFrete();
	}

	public Integer getCodPedido() {
		return codPedido;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public Integer getNumItensPedido() {
		return numItensPedido;
	}

	public BigDecimal getValorAcrescimo() {
		return valorAcrescimo;
	}

	public Integer getCodLoja() {
		return codLoja;
	}

	public BigDecimal getValorPedido() {
		return valorPedido;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public LocalDate getDataUltimaAlteracao() {
		return dataUltimaAlteracao;
	}

	public Integer getCodLojaSaidaMercadoria() {
		return codLojaSaidaMercadoria;
	}

	public Integer getCodFuncionarioLiberador() {
		return codFuncionarioLiberador;
	}

	public Integer getSituacao() {
		return situacao;
	}

	public Integer getCodVendedor() {
		return codVendedor;
	}

	public Integer getFlgTipoCobrancaFrete() {
		return flgTipoCobrancaFrete;
	}

	public static List<PedidoDTO> converter(List<ZanPedido> pedidos) {
		return pedidos.stream().map(PedidoDTO::new).collect(Collectors.toList());
	}
}
