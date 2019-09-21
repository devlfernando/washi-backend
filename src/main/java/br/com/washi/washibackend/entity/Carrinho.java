package br.com.washi.washibackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "T_CARRINHO")
@Entity
public class Carrinho {

    @Id
    @Column(name = "CARCOD")
    private int codigo;

    @Column(name = "PTDPESCOD")
    private Pessoa pessoa;

    @Column(name = "CARSTT")
    private String status;

    @Column(name = "CARDSC")
    private double desconto;

    @Column(name = "CARTOTVLR")
    private double valor;

    public int getCodigo() {
        return codigo;
    }

    public Pessoa getPessoa() {
        return pessoa;
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

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
