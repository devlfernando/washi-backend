package br.com.washi.washibackend.entity;


import javax.persistence.*;

@Entity
@Table (name="T_CARRINHO")
@SequenceGenerator(name = "carrinho", sequenceName = "SQ_T_CARRINHO", allocationSize = 1)
public class Carrinho {

    @Id
    @Column(name="CARCOD", length = 38)
    @GeneratedValue(generator = "carrinho", strategy = GenerationType.SEQUENCE)
    private int codigo;

    @Column(name="ENTCOD", length = 38)
    private Entrega entrega;

    @Column(name="PGTCOD", length = 38)
    private Pagamento pagamento;

    @Column(name="CARDSC")
    private double descricao;

    @Column(name="CARTOTVLR")
    private double totalValor;

    @Column(name="CARSST", length = 20)
    private String status;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void setDescricao(double descricao) {
        this.descricao = descricao;
    }

    public void setTotalValor(double totalValor) {
        this.totalValor = totalValor;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCodigo() {
        return codigo;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public double getDescricao() {
        return descricao;
    }

    public double getTotalValor() {
        return totalValor;
    }

    public String getStatus() {
        return status;
    }
}
