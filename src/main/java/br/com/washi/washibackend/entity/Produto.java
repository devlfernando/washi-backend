package br.com.washi.washibackend.entity;

import javax.persistence.*;

@Entity
@Table (name="T_PRODUTO")
@SequenceGenerator(name = "produto", sequenceName = "SQ_T_PRODUTO",allocationSize = 1)
public class Produto {

    @Id
    @GeneratedValue(generator = "produto", strategy = GenerationType.SEQUENCE)
    @Column(name="PDTCOD", length = 38)
    private int codigo;

    @Column(name="PDTDES", length= 100)
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
