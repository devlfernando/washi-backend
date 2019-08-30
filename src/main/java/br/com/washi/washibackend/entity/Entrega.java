package br.com.washi.washibackend.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Date;


//REVER ESSA ENTIDADE!!!!!
@Entity
@Table(name="T_ENTREGA")
@SequenceGenerator(name="entrega", sequenceName = "SQ_T_ENTREGA", allocationSize = 1)
public class Entrega {

    private int codigo;

    private Carrinho carrinho;

    private String status;

    private Date tempo;



}
