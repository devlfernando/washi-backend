package br.com.washi.washibackend.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "T_CARRINHO")
@Entity
public class Carrinho {

    @Id
    @Column(name = "CARCOD")
    private int codigo;

    @Column(name = "CARDSC")
    private double desconto;

    @Column(name = "CARTOTVLR")
    private double valor;

    @OneToOne(mappedBy = "carrinho")
    private Pagamento pagamento;

    @OneToMany(mappedBy = "carrinho")
    private List<Entrega> entregas;

    @ManyToOne
    private Pessoa pessoa;

    @ManyToOne
    private CarrinhoStatus carrinhoStatus;

//    @ManyToMany(mappedBy = "carrinhos")
//    private List<Solicitacao> solicitacoes;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public List<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(List<Entrega> entregas) {
        this.entregas = entregas;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
