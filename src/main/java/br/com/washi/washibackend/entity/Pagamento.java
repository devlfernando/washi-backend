package br.com.washi.washibackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "T_PAGAMENTO")
@Entity
public class Pagamento {

    @Id
    @Column(name = "PGTCOD")
    private int codigo;

    private FormaPagamento formaPagamento;

    private Carrinho carrinho;

    @Column(name = "PGTVLR")
    private double valor;

    @Column(name = "PGTDAT")
    private Date dataPagamento;

    public int getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
