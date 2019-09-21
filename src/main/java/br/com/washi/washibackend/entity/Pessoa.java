package br.com.washi.washibackend.entity;

import br.com.washi.washibackend.entity.enums.Bairro;
import br.com.washi.washibackend.entity.enums.Cidade;
import br.com.washi.washibackend.entity.enums.Estado;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="T_PESSOA")
public class Pessoa {

    @Id
    @Column(name="PESCOD")
    private int codigo;

    @Column(name="PESNOM", length = 100)
    private String nome;

    @Column(name="PESEML", length = 100)
    private String email;

    @Column(name="PESSEN", length = 25)
    private String senha;

    @Column(name="CPFCPJ", length = 12)
    private String documento;

    @Column(name="TELNUM", length = 12)
    private String telefone;

    @Column(name="ENDCEP", length = 40)
    private String endCep;

    @Column(name="ENDDES", length = 50)
    private String endDescricao;

    @Column(name="ENDNUM", length = 8)
    private String endNumero;

    @Column(name="ENDBAI", length = 50)
    private Bairro endBairro;

    @Column(name="ENDCID", length = 50)
    private Cidade endCidade;

    @Column(name="ENDEST", length = 2)
    private Estado endEstado;

    @OneToMany(mappedBy = "pessoa")
    private List<Solicitacao> solicitacoes;

    @OneToMany(mappedBy = "pessoa")
    private List<Entrega> entregas;

    @OneToMany(mappedBy = "pessoa")
    private List<Carrinho> carrinhos;

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
