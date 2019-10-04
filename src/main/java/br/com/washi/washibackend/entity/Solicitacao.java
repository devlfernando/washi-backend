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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PESCOD")
    private Pessoa pessoa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SVCCOD")
    private Servico servico;

    @ManyToOne(fetch = FetchType.LAZY)
    @LazyCollection(LazyCollectionOption.TRUE)
    @JoinColumn(name = "SVCDTLCOD")
    private ServicoDetalhe servicoDetalhe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PDTCOD")
    private Produto produto;

//    @ManyToMany()
//    @JoinTable(name = "T_SOLICITACAO", joinColumns = {@JoinColumn(name = "SLTCOD")},
//            inverseJoinColumns = {@JoinColumn(name = "CARCOD")})
//    private List<Carrinho> carrinhos;

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }


//    public double getValorServico() {
//        return valorServico;
//    }

//    public double getIof() {
//        return iof;
//    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

//    public void setValorServico(double valorServico) {
//        this.valorServico = valorServico;
//    }

//    public void setIof(double iof) {
//        this.iof = iof;
//    }
}
