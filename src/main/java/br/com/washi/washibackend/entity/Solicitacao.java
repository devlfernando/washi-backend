package br.com.washi.washibackend.entity;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Table(name = "T_SOLICITACAO")
@Entity
public class Solicitacao {
    @Id
    @Column(name = "SLTCOD")
    private int codigo;

    @Column(name="SLTQTD", nullable = false)
    private int quantidade;

//    @Column(name = "SLTLQDVLR")
//    private double valorServico;

//    @Column(name = "IOFLQDVLR")
//    private double iof;

    @ManyToOne
    @JoinColumn(name = "PESCOD")
    private Pessoa pessoa;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SVCCOD")
    private Servico servico;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SVCDTLCOD")
    private ServicoDetalhe servicoDetalhe;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PDTCOD")
    private Produto produto;

    @OneToMany(mappedBy = "solicitacao")
    private List<Pedido> pedidos;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public ServicoDetalhe getServicoDetalhe() {
        return servicoDetalhe;
    }

    public void setServicoDetalhe(ServicoDetalhe servicoDetalhe) {
        this.servicoDetalhe = servicoDetalhe;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
