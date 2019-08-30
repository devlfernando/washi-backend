package br.com.washi.washibackend.entity;


import javax.persistence.*;

@Entity
@Table(name="T_FORMA_PAGAMENTO")
@SequenceGenerator(name="formaPagamento", sequenceName = "SQ_T_FORMA_PAGAMENTO")
public class FormaPagamento {

    @Id
    @Column(name="PGTFRMCOD", length = 38)
    @GeneratedValue(generator = "formaPagamento", strategy = GenerationType.SEQUENCE)
    private int codigo;

    @Column(name="PGTCOD", length = 38)
    private Pagamento pagamento;

    @Column(name="PGTFRMCOD", length = 100)
    private TipoPagamento tipo;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void setForma(TipoPagamento tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public TipoPagamento getForma() {
        return tipo;
    }
}
