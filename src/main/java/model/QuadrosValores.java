package model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="valores")
public class QuadrosValores {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String descricao;
	private Date vencimento;
	private Date data;
	private BigDecimal valor;
	private boolean pago;
	
	@ManyToOne
	@JoinColumn(name="quadrosValores_id")
	private Quadros quadros;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public Quadros getQuadros() {
		return quadros;
	}

	public void setQuadros(Quadros quadros) {
		this.quadros = quadros;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	
}
