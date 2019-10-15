package br.com.washi.washibackend.repository;

import br.com.washi.washibackend.entity.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import java.util.List;

public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Integer> {

}
