package br.com.washi.washibackend.resource;

import br.com.washi.washibackend.entity.Solicitacao;
import br.com.washi.washibackend.repository.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("solicitacao")
public class SolicitacaoResource {

    @Autowired
    private SolicitacaoRepository rep;

    @GetMapping
    public List<Solicitacao> listar(){
        return rep.findAll();
    }

    @GetMapping("{id}")
    public Solicitacao buscar(@PathVariable int id){
        return rep.findById(id).get();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Solicitacao cadastrar(@RequestBody Solicitacao solicitacao){
        return rep.save(solicitacao);
    }

    @PutMapping("{id}")
    public Solicitacao atualizar(@RequestBody Solicitacao solicitacao,
                            @PathVariable int id){
        solicitacao.setCodigo(id);
        return rep.save(solicitacao);
    }

    @DeleteMapping("{codigo}")
    public void remover(@PathVariable int codigo){
        rep.deleteById(codigo);
    }

    @GetMapping("searchById/{codigo}")
    public Solicitacao buscarPorCodigo(@PathVariable int codigo){
        return rep.findSolicitacaoByCodigo(codigo);
    }

    @GetMapping("excludeById/{codigo}")
    public List<Solicitacao> buscarSolicitacoesExcluindoId(@PathVariable int codigo){
        return rep.findSolicitacaoByPessoaCodigoIsNot(codigo);
    }
    @GetMapping("includeById/{codigo}")
    public List<Solicitacao> buscarSolicitacoesIncluindoId(@PathVariable int codigo){
        return rep.findSolicitacaoByPessoaCodigoEquals(codigo);
    }
}



