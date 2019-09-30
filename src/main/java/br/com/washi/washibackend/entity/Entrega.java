package br.com.washi.washibackend.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "T_ENTREGA")
@Entity
public class Entrega {

    @Id
    @Column(name = "ENTCOD")
    private int codigo;

    @Column(name = "STTFLG")
    private String status;

    @Column(name = "ENTTME")
    private Date entregaTME;

    @Column(name = "CLTDAT")
    private Date coleta;

    @Column(name = "ENTDAT")
    private Date entrega;

    @ManyToOne
    private Pessoa pessoa;

    @ManyToOne
    private Carrinho carrinho;

    public int getCodigo() {
        return codigo;
    }

    public String getStatus() {
        return status;
    }

    public Date getEntregaTME() {
        return entregaTME;
    }

    public Date getColeta() {
        return coleta;
    }

    public Date getEntrega() {
        return entrega;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEntregaTME(Date entregaTME) {
        this.entregaTME = entregaTME;
    }

    public void setColeta(Date coleta) {
        this.coleta = coleta;
    }

    public void setEntrega(Date entrega) {
        this.entrega = entrega;
    }
}
