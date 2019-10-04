package br.com.washi.washibackend.resource;

import br.com.washi.washibackend.entity.Carrinho;
import br.com.washi.washibackend.entity.Pessoa;
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

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<Carrinho> listar() {
        return carrinhoRepository.findAll();
    }

    @GetMapping("carrinhoNotPessoa/{id}")
    public List<Carrinho> findCarrinhoExcludingPessoa(@PathVariable int id) {
        Pessoa pessoa = pessoaRepository.findById(id).get();
        return carrinhoRepository.findCarrinhoByPessoaNot(pessoa);
    }

    @GetMapping("carrinhoByPessoa/{id}")
    public List<Carrinho> findCarrinhoByPessoa(@PathVariable int id) {
        return carrinhoRepository.findCarrinhoByPessoaCodigoEquals(id);
    }
}
