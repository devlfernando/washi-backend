package br.com.washi.washibackend.resource;

import br.com.washi.washibackend.entity.Pessoa;
import br.com.washi.washibackend.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pessoa")
public class PessoaResource {

    @Autowired
    private PessoaRepository repository;

    @GetMapping
    public List<Pessoa> listar() {
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Pessoa buscar(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Pessoa cadastrar(@RequestBody Pessoa pessoa) {
        return repository.save(pessoa);
    }

    @PutMapping("{id}")
    public Pessoa atualizar(@RequestBody Pessoa pessoa,
                            @PathVariable int id) {
        pessoa.setCodigo(id);
        return repository.save(pessoa);
    }

    @DeleteMapping("{codigo}")
    public void remover(@PathVariable int codigo) {
        repository.deleteById(codigo);
    }

    @GetMapping("auth")
    public ResponseEntity auth(@RequestBody Pessoa pessoa) {
        Pessoa washiPessoa = repository.findByEmailAndSenha(pessoa.getEmail(), pessoa.getEmail());

        if (washiPessoa == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        } else {
            return ResponseEntity.ok(washiPessoa);
        }
    }

}

