package br.com.washi.washibackend.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_ENTREGA_G")
@SequenceGenerator(name = "entrega", sequenceName = "T_SQ_ENTREGA", allocationSize = 1)
public class Entrega {

    @Id
    @Column(name = "CODIGO")
    @GeneratedValue(generator = "entrega", strategy = GenerationType.SEQUENCE)
    private int codigo;

    @Column(name = "CEP")
    private String cep;

    @Column(name = "LOGRADOURO")
    private String logradouro;

    @Column(name = "NUMERO")
    private String numero;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
