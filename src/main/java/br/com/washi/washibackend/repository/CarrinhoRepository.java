package br.com.washi.washibackend.repository;

import br.com.washi.washibackend.entity.Carrinho;
import br.com.washi.washibackend.entity.Pessoa;
import br.com.washi.washibackend.entity.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Integer> {

    //Query Alvin
    //@Query ("select a.carcod, D.CARSTTDES, E.SVCDES, C.SLTQTD, A.CARTOTVLR from T_CARRINHO A, T_PEDIDO B, T_SOLICITACAO C, T_CARRINHO_STATUS D, T_SERVICO E where A.CARCOD = B.CARCOD and B.SLTCOD = C.sltcod and D.CARSTTCOD = A.CARSTTCOD and E.SVCCOD = C.SVCCOD and C.PESCOD <> ?1 and E.SVCCOD = 1")

    List<Carrinho> findCarrinhoByCarrinhoStatusCodigoGreaterThanAndPessoaCodigoIsNot(int carrinho, int pessoa);

}
