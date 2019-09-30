package br.com.washi.washibackend.repository;

import br.com.washi.washibackend.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
    Pessoa findByEmailEqualsAndSenhaEquals(String email, String senha);

    //Serviço que retorne o total faturado por pessoa e o total de custo também

}
