package br.com.washi.washibackend.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_SERVICO_DETALHE")
public class ServicoDetalhe {

    @Id
    @Column(name = "SVCDTLCOD")
    private int codigo;

    @Column(name = "SVCDTLDES")
    private String descricaoItem;

    @Column(name = "SVCDTLVLR")
    private double valor;

    @Column(name = "SVCDTLIOFVLR")
    private double iof;

   // @OneToMany(mappedBy = "servicoDetalhe")
    //private List<Solicitacao> solicitacoes;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getIof() {
        return iof;
    }

    public void setIof(double iof) {
        this.iof = iof;
    }
}
