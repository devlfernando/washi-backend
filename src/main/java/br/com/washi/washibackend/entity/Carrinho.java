package br.com.washi.washibackend.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "T_CARRINHO")
@Entity
public class Carrinho {

    @Id
    @Column(name = "CARCOD")
    private int codigo;

    @ManyToOne
    @JoinColumn(name = "PTDPESCOD")
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "CARSTTCOD")
    private CarrinhoStatus carrinhoStatus;

    @Column(name = "CARDSC")
    private double desconto;

    @Column(name = "CARTOTVLR")
    private double valor;

    @OneToMany(mappedBy = "carrinho")
    private List<Pedido> pedidos;

    @OneToMany(mappedBy = "carrinho")
    private List<Entrega> entregas;

    public CarrinhoStatus getCarrinhoStatus() {
        return carrinhoStatus;
    }

    public void setCarrinhoStatus(CarrinhoStatus carrinhoStatus) {
        this.carrinhoStatus = carrinhoStatus;
    }

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
