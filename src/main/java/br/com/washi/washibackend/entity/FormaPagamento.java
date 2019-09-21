package br.com.washi.washibackend.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "T_PAGAMENTO_FORMA")
@Entity
public class FormaPagamento {

    @Id
    @Column(name = "PGTFRMCOD")
    private int codigo;
    @Column(name = "PGTFRMDES")
    private String descricao;

    @OneToMany(mappedBy = "formaPagamento")
    private List<Pagamento> pagamentos;

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
