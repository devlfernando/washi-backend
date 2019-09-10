package br.com.washi.washibackend.resource;

import br.com.washi.washibackend.entity.Pessoa;
import br.com.washi.washibackend.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pessoa")
public class PessoaResource {

    @Autowired
    private PessoaRepository rep;

    @GetMapping
    public List<Pessoa> listar(){
        return rep.findAll();
    }

    @GetMapping("{id}")
    public Pessoa buscar(@PathVariable int id){
        return rep.findById(id).get();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Pessoa cadastrar(@RequestBody Pessoa pessoa){
        return rep.save(pessoa);
    }

    @PutMapping("{id}")
    public Pessoa atualizar(@RequestBody Pessoa pessoa,
                           @PathVariable int id){
        pessoa.setCodigo(id);
        return rep.save(pessoa);
    }

    @DeleteMapping("{codigo}")
    public void remover(@PathVariable int codigo){
        rep.deleteById(codigo);
    }

}

