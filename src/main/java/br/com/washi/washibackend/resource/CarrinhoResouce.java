package br.com.washi.washibackend.resource;

import br.com.washi.washibackend.entity.Carrinho;
import br.com.washi.washibackend.entity.Solicitacao;
import br.com.washi.washibackend.repository.CarrinhoRepository;
import br.com.washi.washibackend.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("carrinho")
public class CarrinhoResouce {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    @GetMapping
    public List<Carrinho> listar() {
        return carrinhoRepository.findAll();
    }

    @GetMapping("{id}")
    public Carrinho findByCode(@PathVariable("id") int codigo){
        return carrinhoRepository.findById(codigo).get();
    }

    @GetMapping("carrinhoBySolicitacao/{id}/{id}")
    public List<Carrinho> findCarrinhoByExcludePerson(@PathVariable("id") int carrinho, @PathVariable("id") int pessoa){
        return carrinhoRepository.findCarrinhoByCarrinhoStatusCodigoGreaterThanAndPessoaCodigoIsNot(carrinho, pessoa);
    }

    @GetMapping("carrinhoByPessoa/{id}")
    public List<Carrinho> findCarrinhoByPessoa(@PathVariable int id) {
        return carrinhoRepository.findCarrinhoByPessoaCodigoEquals(id);
    }
}
