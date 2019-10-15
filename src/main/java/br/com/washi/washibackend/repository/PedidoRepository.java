package br.com.washi.washibackend.repository;

import br.com.washi.washibackend.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    List<Pedido> findPedidoByCarrinhoCodigoEquals(int carrinho);

    List<Pedido> findPedidoByCarrinho_CarrinhoStatusCodigoEqualsAndSolicitacao_PessoaCodigoIsNot(int carrinhoStatus, int pessoa);

    List<Pedido> findPedidoByCarrinho_CarrinhoStatusCodigoEqualsAndSolicitacao_PessoaCodigoEquals(int carrinhoStatus, int pessoa);

    List<Pedido> findPedidoByCarrinho_CarrinhoStatusCodigoGreaterThanAndSolicitacao_PessoaCodigoEquals(int carrinhoStatus, int pessoa);

    //@Modifying
    //@Query(value = "update Carrinho c set c.carrinhoStatus = 2 where c.codigo in (select a.codigo from Carrinho A, Pedido B, Solicitacao C where A.codigo = B.carrinho and B.solicitacao = c.codigo and A.carrinhoStatus = 1 and c.pessoa= : codigoPessoa", nativeQuery = true)
    //int update(Integer codigoPessoa);
}



