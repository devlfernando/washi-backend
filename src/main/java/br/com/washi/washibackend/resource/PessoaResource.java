package br.com.washi.washibackend.resource;


import br.com.washi.washibackend.entity.Pessoa;
import br.com.washi.washibackend.repository.PessoaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping("{codigo}")
    public Pessoa buscar(@PathVariable int codigo) {
        return repository.findById(codigo).get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Pessoa cadastrar(@RequestBody Pessoa pessoa) {
        return repository.save(pessoa);
    }

    @PutMapping("{codigo}")
    public ResponseEntity<Pessoa> atualizar(@PathVariable int codigo, @Valid @RequestBody Pessoa pessoa) {
        Pessoa existente = repository.getOne(codigo); // vai verificar a pessoa que está no banco
        if (existente == null) {
            return ResponseEntity.notFound().build(); // equivalente ao 404
        }

        BeanUtils.copyProperties(pessoa, existente, "codigo"); // copiar as propriedades existentes, menos o código.

        existente = repository.save(existente); // salvando a alteração

        return ResponseEntity.ok(existente); // retornar o registro
    }

    @DeleteMapping("{codigo}")
    public void remover(@PathVariable int codigo){
        repository.deleteById(codigo);
    }

}
