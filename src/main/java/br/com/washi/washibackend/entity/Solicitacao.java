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

    @Column(name = "SLTLQDVLR")
    private double valorServico;

    @Column(name = "IOFLQDVLR")
    private double iof;

    @ManyToOne()
    private Pessoa pessoa;

    @ManyToOne()
    private Servico servico;

    @ManyToOne()
    private ServicoDetalhe servicoDetalhe;

    @ManyToOne()
    private Produto produto;

    //FAZER RELACIONAMENTO ENTRE SOLICITAÇÃO E CARRINHO (ManyTOMany)

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
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

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public void setIof(double iof) {
        this.iof = iof;
    }
}
