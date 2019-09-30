package br.com.washi.washibackend.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "T_CARRINHO")
@Entity
public class Carrinho {

    @Id
    @Column(name = "CARCOD")
    private int codigo;

    @Column(name = "CARSTT")
    private String status;

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

//    @ManyToMany(mappedBy = "carrinhos")
//    private List<Solicitacao> solicitacoes;

    public int getCodigo() {
        return codigo;
    }

    public String getStatus() {
        return status;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getValor() {
        return valor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
