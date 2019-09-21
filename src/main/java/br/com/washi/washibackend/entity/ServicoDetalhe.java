package br.com.washi.washibackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "T_SERVICO_DETALHE")
@Entity
public class ServicoDetalhe {

    @Id
    @Column(name = "SVCDTLCOD")
    private int codigo;

    @Column(name = "SVCDTLDES", length = 100)
    private String descricaoItem;

    @Column(name = "SVCDTLVLR")
    private double valor;

    @Column(name = "SVCDTLIOFVLR")
    private double iof;

    public int getCodigo() {
        return codigo;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public double getValor() {
        return valor;
    }

    public double getIof() {
        return iof;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setIof(double iof) {
        this.iof = iof;
    }
}
