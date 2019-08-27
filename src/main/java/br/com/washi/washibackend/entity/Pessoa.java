package br.com.washi.washibackend.entity;

import javax.persistence.*;

@Entity
@Table(name="T_PESSOA")
@SequenceGenerator(name="pessoa", sequenceName = "SQ_T_PESSOA", allocationSize = 1)
public class Pessoa {

    @Id
    @GeneratedValue(generator = "pessoa", strategy = GenerationType.SEQUENCE)
    @Column(name="PESCOD", length = 10)
    private int codigo;

    @Column(name="ENDCOD", length = 10, nullable = false)
    private Endereco endereco;

    @Column(name="CPFCPJ", length = 12, nullable = false)
    private String cpfcnpj;

    @Column(name = "PESEML", length = 100, nullable = false)
    private String email;

    @Column(name = "PESNOM", length = 100, nullable = false)
    private String nome;

    @Column(name = "PESSEN", length = 12, nullable = false)
    private String senha;

    @Column(name = "TELNUM", length = 10, nullable = false)
    private int telefone;

    @Column(name="PESROL", length = 30, nullable = false) // ver com o Alvin o que é PESROL
    private String pesrol;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }



    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public int getTelefone() {
        return telefone;
    }
}
