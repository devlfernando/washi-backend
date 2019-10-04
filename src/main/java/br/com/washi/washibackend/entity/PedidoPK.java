package br.com.washi.washibackend.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class PedidoPK implements Serializable {

    private int carrinho;

    private int solicitacao;

    private Date data;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PedidoPK pedidoPK = (PedidoPK) o;
        return carrinho == pedidoPK.carrinho &&
                solicitacao == pedidoPK.solicitacao &&
                Objects.equals(data, pedidoPK.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrinho, solicitacao, data);
    }

    public int getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(int carrinho) {
        this.carrinho = carrinho;
    }

    public int getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(int solicitacao) {
        this.solicitacao = solicitacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
