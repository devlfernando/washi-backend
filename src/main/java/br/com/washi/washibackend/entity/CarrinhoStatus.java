package br.com.washi.washibackend.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "T_CARRINHO_STATUS")
@Entity
public class CarrinhoStatus {

    @Id
    @Column(name = "CARSTTCOD")
    private int codigo;

    @Column(name = "CARSTTDES")
    private String descricao;

    //@OneToMany(mappedBy = "carrinhoStatus")
    //private List<Carrinho> carrinhos;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
