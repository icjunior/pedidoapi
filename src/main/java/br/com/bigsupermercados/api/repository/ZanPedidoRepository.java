package br.com.bigsupermercados.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bigsupermercados.api.modelo.ZanPedido;
import br.com.bigsupermercados.api.modelo.ZanPedidoPK;

public interface ZanPedidoRepository extends JpaRepository<ZanPedido, ZanPedidoPK> {

	List<ZanPedido> findByZanPedidoPKCodLojaOrderByZanPedidoPKCodPedidoDesc(Integer codigoLoja);

}
