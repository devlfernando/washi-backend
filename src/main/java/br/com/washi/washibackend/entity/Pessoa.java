package br.com.washi.washibackend.entity;

import br.com.washi.washibackend.entity.enums.Bairro;
import br.com.washi.washibackend.entity.enums.Cidade;
import br.com.washi.washibackend.entity.enums.Estado;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_PESSOA")
public class Pessoa {

    @Id
    @Column(name = "PESCOD")
    private int codigo;

    @Column(name = "PESNOM")
    private String nome;

    @Column(name = "PESEML")
    private String email;

    @Column(name = "PESSEN")
    private String senha;

    @Column(name = "CPFCPJ")
    private String documento;

    @Column(name = "TELNUM")
    private String telefone;

    @Column(name = "ENDCEP")
    private String endCep;

    @Column(name = "ENDDES")
    private String endDescricao;

    @Column(name = "ENDNUM")
    private String endNumero;

    @Column(name = "ENDBAI")
    @Enumerated(EnumType.STRING)
    private Bairro endBairro;

    @Column(name = "ENDCID")
    @Enumerated(EnumType.STRING)
    private Cidade endCidade;

    @Column(name = "ENDEST")
    @Enumerated(EnumType.STRING)
    private Estado endEstado;

    //@OneToMany(mappedBy = "pessoa")
    //private List<Solicitacao> solicitacoes;

    //@OneToMany(mappedBy = "pessoa")
    //private List<Carrinho> carrinhos;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndCep() {
        return endCep;
    }

    public void setEndCep(String endCep) {
        this.endCep = endCep;
    }

    public String getEndDescricao() {
        return endDescricao;
    }

    public void setEndDescricao(String endDescricao) {
        this.endDescricao = endDescricao;
    }

    public String getEndNumero() {
        return endNumero;
    }

    public void setEndNumero(String endNumero) {
        this.endNumero = endNumero;
    }

    public Bairro getEndBairro() {
        return endBairro;
    }

    public void setEndBairro(Bairro endBairro) {
        this.endBairro = endBairro;
    }

    public Cidade getEndCidade() {
        return endCidade;
    }

    public void setEndCidade(Cidade endCidade) {
        this.endCidade = endCidade;
    }

    public Estado getEndEstado() {
        return endEstado;
    }

    public void setEndEstado(Estado endEstado) {
        this.endEstado = endEstado;
    }
}