package br.com.washi.washibackend.entity;

import javax.persistence.*;

@Entity
@Table(name="T_ENDERECO")
@SequenceGenerator(name="endereco", sequenceName = "SQ_T_ENDERECO", allocationSize = 1)
public class Endereco {

    @Id
    @GeneratedValue(generator = "endereco", strategy = GenerationType.SEQUENCE)
    @Column(name="ENDCOD", length = 38)
    private int codigo;

    @Column(name="LOGDES", length = 50)
    private String descricao;

    @Column(name="LOGNUM", length = 8)
    private int numero;

    @Column(name="LOGCPM", length = 50)
    private String complemento;

    @Column(name="ENDTIPFLG", length = 20)
    private String flagTipo;

    public void setFlagTipo(String flagTipo) {
        this.flagTipo = flagTipo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getDescricao() {
        return descricao;
    }
    public String getFlagTipo() {
        return flagTipo;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public int getCodigo() {
        return codigo;
    }
}
