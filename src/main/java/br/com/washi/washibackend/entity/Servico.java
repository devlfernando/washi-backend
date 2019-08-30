package br.com.washi.washibackend.entity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_SERVICO")
@SequenceGenerator(name="servico" )
public class Servico {

}
