package br.com.washi.washibackend.entity;

import javax.persistence.*;

@Entity
@Table(name="T_SERVICO_ITEM")
@SequenceGenerator(name="item", sequenceName = "SQ_T_SERVICO_ITEM", allocationSize = 1)
public class ServicoItem {

    @Id
    @Column(name="SVCITMCOD", length = 38)
    @GeneratedValue(generator = "item", strategy = GenerationType.SEQUENCE)
    private int codigo;

    @Column(name="SVCITMDES", length = 100)
    private String descricao;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
