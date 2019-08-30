package br.com.washi.washibackend.entity;

import javax.persistence.*;

@Entity
@Table(name="T_SOLICITACAO")
@SequenceGenerator(name="solicitacao", sequenceName = "SQ_T_SOLICITACAO", allocationSize = 1)
public class Solicitacao {

    @Id
    @GeneratedValue(generator = "solicitacao", strategy = GenerationType.SEQUENCE)
    @Column(name="SLTCOD")
    private int codigo;

    @Column(name="PESCOD", length = 38)
    private Pessoa pessoa;

    @Column(name="SVCCOD", length = 38)
    private Servico servico;

    @Column(name="SVCITMCOD", length = 38)
    private ServicoItem item;

    @Column(name="PDTCOD", length = 38)
    private Produto produto;

    @Column(name="CARCOD", length = 38)
    private Carrinho carrinho;

    @Column(name="SLTQTD", length = 38)
    private int quantidade;

    @Column(name="PTDPESCOD", length = 38)
    private int codigoPrestador;

    @Column(name="SLTLQDVLR") // falta terminar
    private double valorLiquido;

}
