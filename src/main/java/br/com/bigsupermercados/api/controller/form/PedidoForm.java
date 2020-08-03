package br.com.bigsupermercados.api.controller.form;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.com.bigsupermercados.api.modelo.ZanPedido;
import br.com.bigsupermercados.api.modelo.ZanPedidoNumeracao;
import br.com.bigsupermercados.api.modelo.ZanPedidoPK;

public class PedidoForm {

	private LocalDate dataEntrega = LocalDate.now();
	private Integer numItensPedido;
	private BigDecimal valorAcrescimo;
	private Integer codLoja;
	private BigDecimal valorPedido;
	private LocalDate dataPedido = LocalDate.now();
	private LocalDate dataCadastro = LocalDate.now();;
	private LocalDate dataUltimaAlteracao = LocalDate.now();
	private Integer codLojaSaidaMercadoria;
	private Integer codFuncionarioLiberador = 60;
	private Integer situacao = 2;
	private Integer codVendedor = 60;
	private Integer flgTipoCobrancaFrete = 0;
	private List<PedidoItemForm> itens;

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Integer getNumItensPedido() {
		return numItensPedido;
	}

	public void setNumItensPedido(Integer numItensPedido) {
		this.numItensPedido = numItensPedido;
	}

	public BigDecimal getValorAcrescimo() {
		return valorAcrescimo;
	}

	public void setValorAcrescimo(BigDecimal valorAcrescimo) {
		this.valorAcrescimo = valorAcrescimo;
	}

	public Integer getCodLoja() {
		return codLoja;
	}

	public void setCodLoja(Integer codLoja) {
		this.codLoja = codLoja;
	}

	public BigDecimal getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(BigDecimal valorPedido) {
		this.valorPedido = valorPedido;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDate getDataUltimaAlteracao() {
		return dataUltimaAlteracao;
	}

	public void setDataUltimaAlteracao(LocalDate dataUltimaAlteracao) {
		this.dataUltimaAlteracao = dataUltimaAlteracao;
	}

	public Integer getCodLojaSaidaMercadoria() {
		return codLojaSaidaMercadoria;
	}

	public void setCodLojaSaidaMercadoria(Integer codLojaSaidaMercadoria) {
		this.codLojaSaidaMercadoria = codLojaSaidaMercadoria;
	}

	public Integer getCodFuncionarioLiberador() {
		return codFuncionarioLiberador;
	}

	public void setCodFuncionarioLiberador(Integer codFuncionarioLiberador) {
		this.codFuncionarioLiberador = codFuncionarioLiberador;
	}

	public Integer getSituacao() {
		return situacao;
	}

	public void setSituacao(Integer situacao) {
		this.situacao = situacao;
	}

	public Integer getCodVendedor() {
		return codVendedor;
	}

	public void setCodVendedor(Integer codVendedor) {
		this.codVendedor = codVendedor;
	}

	public Integer getFlgTipoCobrancaFrete() {
		return flgTipoCobrancaFrete;
	}

	public void setFlgTipoCobrancaFrete(Integer flgTipoCobrancaFrete) {
		this.flgTipoCobrancaFrete = flgTipoCobrancaFrete;
	}

	public List<PedidoItemForm> getItens() {
		return itens;
	}

	public void setItens(List<PedidoItemForm> itens) {
		this.itens = itens;
	}

	public ZanPedido converter(ZanPedidoNumeracao numeroPedido) {
		return new ZanPedido(new ZanPedidoPK(numeroPedido.getNumeroPedido(), codLoja), dataEntrega, numItensPedido,
				valorAcrescimo, codLoja, valorPedido, dataPedido, dataCadastro, dataUltimaAlteracao,
				codLojaSaidaMercadoria, codFuncionarioLiberador, situacao, codVendedor, flgTipoCobrancaFrete);
	}
}
