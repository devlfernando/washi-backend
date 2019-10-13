package br.com.washi.washibackend.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_PEDIDO")
@IdClass(PedidoPK.class)
public class Pedido {

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="CARCOD")
    private Carrinho carrinho;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="SLTCOD")
    private Solicitacao solicitacao;

    @Column(name="PDDDAT")
    private Date data;

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public Solicitacao getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
