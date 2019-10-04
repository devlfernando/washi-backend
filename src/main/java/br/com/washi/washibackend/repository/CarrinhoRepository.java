package br.com.washi.washibackend.repository;

import br.com.washi.washibackend.entity.Carrinho;
import br.com.washi.washibackend.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Integer> {

    //@Query("from Produto where nome like ?1 and novo = ?2")

    //@Query("select a.carcod, D.CARSTTDES, E.SVCDES, C.SLTQTD, A.CARTOTVLR from T_CARRINHO A, T_PEDIDO B, T_SOLICITACAO C, T_CARRINHO_STATUS D, T_SERVICO E where A.CARCOD = B.CARCOD and B.SLTCOD = C.sltcod and D.CARSTTCOD = A.CARSTTCOD and E.SVCCOD = C.SVCCOD and C.PESCOD <> ?1 and E.SVCCOD = 1")
    //    @Query("select a.codigo, D.descricao, E.descricao, C.quantidade, A.valor from Carrinho A, Pedido B, Solicitacao C, CarrinhoStatus D, Servico E where A.codigo = B.carrinho and B.solicitacao = C.codigo and D.codigo = A.codigo and E.codigo = C.servico and C.pessoa <> ?1 and E.SVCCOD = 1")
    //    List<Carrinho> getCarrinhoExcludingPersonId(int id);

    List<Carrinho> findCarrinhoByPessoaNot(Pessoa pessoa);

    List<Carrinho> findCarrinhoByPessoaCodigoEquals(int codigo);

//    List<Solicitacao> findSolicitacaoByPessoaCodigoIsNot(int codigo);

}
