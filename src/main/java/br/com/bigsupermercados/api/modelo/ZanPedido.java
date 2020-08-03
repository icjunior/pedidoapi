package br.com.bigsupermercados.api.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "zan_pedido")
public class ZanPedido {

	@EmbeddedId
	private ZanPedidoPK zanPedidoPK;

	@Column(name = "data_entrega")
	private LocalDate dataEntrega;

	@Column(name = "num_itens_pedido")
	private Integer numItensPedido;

	@Column(name = "valor_acrescimo")
	private BigDecimal valorAcrescimo;

	@Column(name = "valor_pedido")
	private BigDecimal valorPedido;

	@Column(name = "data_pedido")
	private LocalDate dataPedido;

	@Column(name = "data_cadastro")
	private LocalDate dataCadastro;

	@Column(name = "data_ultima_alteracao")
	private LocalDate dataUltimaAlteracao;

	@Column(name = "cod_loja_saida_mercadoria")
	private Integer codLojaSaidaMercadoria;

	@Column(name = "cod_funcionario_liberador")
	private Integer codFuncionarioLiberador;

	@Column(name = "situacao")
	private Integer situacao;

	@Column(name = "cod_vendedor")
	private Integer codVendedor;

	@Column(name = "flg_tipo_cobranca_frete")
	private Integer flgTipoCobrancaFrete;

	public ZanPedido() {
	}

	public ZanPedido(ZanPedidoPK zanPedidoPK, LocalDate dataEntrega, Integer numItensPedido,
			BigDecimal valorAcrescimo, Integer codLoja, BigDecimal valorPedido, LocalDate dataPedido,
			LocalDate dataCadastro, LocalDate dataUltimaAlteracao, Integer codLojaSaidaMercadoria,
			Integer codFuncionarioLiberador, Integer situacao, Integer codVendedor, Integer flgTipoCobrancaFrete) {
		super();
		this.zanPedidoPK = zanPedidoPK;
		this.dataEntrega = dataEntrega;
		this.numItensPedido = numItensPedido;
		this.valorAcrescimo = valorAcrescimo;
		this.valorPedido = valorPedido;
		this.dataPedido = dataPedido;
		this.dataCadastro = dataCadastro;
		this.dataUltimaAlteracao = dataUltimaAlteracao;
		this.codLojaSaidaMercadoria = codLojaSaidaMercadoria;
		this.codFuncionarioLiberador = codFuncionarioLiberador;
		this.situacao = situacao;
		this.codVendedor = codVendedor;
		this.flgTipoCobrancaFrete = flgTipoCobrancaFrete;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((zanPedidoPK == null) ? 0 : zanPedidoPK.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ZanPedido other = (ZanPedido) obj;
		if (zanPedidoPK == null) {
			if (other.zanPedidoPK != null)
				return false;
		} else if (!zanPedidoPK.equals(other.zanPedidoPK))
			return false;
		return true;
	}

	public ZanPedidoPK getZanPedidoPK() {
		return zanPedidoPK;
	}

	public void setZanPedidoPK(ZanPedidoPK zanPedidoPK) {
		this.zanPedidoPK = zanPedidoPK;
	}

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
}
