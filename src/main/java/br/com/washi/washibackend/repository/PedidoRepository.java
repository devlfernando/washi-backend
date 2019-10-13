package br.com.washi.washibackend.repository;

import br.com.washi.washibackend.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
