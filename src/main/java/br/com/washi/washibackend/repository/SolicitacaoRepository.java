package br.com.washi.washibackend.repository;

import br.com.washi.washibackend.entity.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Integer> {

    //Lista de solicitação excluindo a pessoa logada
    //List<Solicitacao> findSolicitacaoByPessoa_CodigoNotContaining(int id);
    List<Solicitacao> findSolicitacaoByPessoaCodigoIsNotLike(int codigo);

    //Lista de solicitação incluindo a pessoa logada
    List<Solicitacao> findSolicitacaoByPessoaCodigoIsLike(int codigo);

    //Retornar detalhes de uma solicitação (Por código)
    Solicitacao findSolicitacaoByCodigo(int codigo);

}
