package br.com.washi.washibackend.repository;

import br.com.washi.washibackend.entity.Carrinho;
import br.com.washi.washibackend.entity.Pessoa;
import br.com.washi.washibackend.entity.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Integer> {

}
