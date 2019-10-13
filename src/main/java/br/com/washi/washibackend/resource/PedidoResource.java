package br.com.washi.washibackend.resource;

import br.com.washi.washibackend.entity.Pedido;
import br.com.washi.washibackend.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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


}
