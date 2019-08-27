package br.com.washi.washibackend.entity;


import javax.persistence.*;

@Entity
@Table(name="T_PAGAMENTO")
@SequenceGenerator(name="pagamento", sequenceName = "SQ_T_PAGAMENTO", allocationSize = 1)
public class Pagamento {

    @Id
    @Column(name="PGTCOD", length = 38)
    @GeneratedValue(generator = "pagamento", strategy = GenerationType.SEQUENCE)
    private int codigo;

    @Column(name="CARCOD", length = 38)
    private Carrinho carrinho;

    @Column(name="PGTFRMCOD", length = 38)
    private FormaPagamento forma;

    @Column(name="PGTLQDVLR")
    private double valorLiquido;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public void setForma(FormaPagamento forma) {
        this.forma = forma;
    }

    public void setValorLiquido(double valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public int getCodigo() {
        return codigo;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public FormaPagamento getForma() {
        return forma;
    }

    public double getValorLiquido() {
        return valorLiquido;
    }
}
