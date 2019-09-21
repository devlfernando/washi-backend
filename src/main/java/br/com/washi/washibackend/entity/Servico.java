package br.com.washi.washibackend.entity;

import javax.persistence.*;

@Table (name="T_SERVICO")
@Entity
public class Servico {

    @Id
    @Column(name = "SVCCOD")
    private int SVCCOD;

    @Column(name = "SVCDES")
    private String descricao;

    @Column(name = "SVCVLR")
    private double valor;

    @Column(name = "SVCIOFVLR")
    private double iof;

    public int getSVCCOD() {
        return SVCCOD;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public double getIof() {
        return iof;
    }

    public void setSVCCOD(int SVCCOD) {
        this.SVCCOD = SVCCOD;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setIof(double iof) {
        this.iof = iof;
    }
}
