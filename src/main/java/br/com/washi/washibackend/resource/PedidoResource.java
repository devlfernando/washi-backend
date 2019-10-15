package br.com.washi.washibackend.resource;

import br.com.washi.washibackend.entity.Pedido;
import br.com.washi.washibackend.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pedido")
public class PedidoResource {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public List<Pedido> list() {
        return pedidoRepository.findAll();
    }

    @GetMapping("/findPedidoByCarrinhoStatusAndPessoaExcludeId/{id}/{id}")
    public List<Pedido> findPedidoByCarrinhoStatusAndPessoaExcludeId(@PathVariable("id") int carrinho, @PathVariable("id") int pessoa){
        return pedidoRepository.findPedidoByCarrinho_CarrinhoStatusCodigoEqualsAndSolicitacao_PessoaCodigoIsNot(carrinho,pessoa);
    }

    @GetMapping("/findPedidoByCarrinhoStatusAndPessoaLogged/{id}/{id}")
    public List<Pedido> findPedidoByCarrinhoStatusAndPessoaLogged(@PathVariable("id") int carrinho, @PathVariable("id") int pessoa){
        return pedidoRepository.findPedidoByCarrinho_CarrinhoStatusCodigoEqualsAndSolicitacao_PessoaCodigoEquals(carrinho,pessoa);
    }

    @GetMapping("/findPedidoByCarrinhoStatusGreaterThanAndPessoaLogged/{id}/{id}")
    public List<Pedido> findPedidoByCarrinhoStatusGreaterThanAndPessoaLogged(@PathVariable("id") int carrinhoStatus, @PathVariable("id") int pessoa) {
        return pedidoRepository.findPedidoByCarrinho_CarrinhoStatusCodigoGreaterThanAndSolicitacao_PessoaCodigoEquals(carrinhoStatus, pessoa);
    }

    @GetMapping("/findByCarrinho/{id}")
    public List<Pedido> findByCarrinho(@PathVariable("id") int carrinho) {
        return pedidoRepository.findPedidoByCarrinhoCodigoEquals(carrinho);
    }
}
