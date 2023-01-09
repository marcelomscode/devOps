package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quadros")
public class Quadros {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private int diaFechamento;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDiaFechamento() {
		return diaFechamento;
	}
	public void setDiaFechamento(int diaFechamento) {
		this.diaFechamento = diaFechamento;
	}
	
}
