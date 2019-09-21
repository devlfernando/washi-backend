package br.com.washi.washibackend.entity;
import javax.persistence.*;

@Table(name = "T_SOLICITACAO")
@Entity
public class Solicitacao {

    @Id
    @Column(name = "SLTCOD")
    private int codigo;

    @Column(name="SLTQTD", nullable = false)
    private int quantidade;

    private Pessoa pessoa;

    private Servico servico;

    private ServicoDetalhe servicoDetalhe;

    private Produto produto;

    @Column(name = "SLTLQDVLR")
    private double valorServico;

    @Column(name = "IOFLQDVLR")
    private double iof;

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Servico getServico() {
        return servico;
    }

    public ServicoDetalhe getServicoDetalhe() {
        return servicoDetalhe;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getValorServico() {
        return valorServico;
    }

    public double getIof() {
        return iof;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public void setServicoDetalhe(ServicoDetalhe servicoDetalhe) {
        this.servicoDetalhe = servicoDetalhe;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public void setIof(double iof) {
        this.iof = iof;
    }
}
