package br.com.omega.natura.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_doador")
public class Doador {
	
	@Id
	@Column(name="id_doador")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="nm_doador")
	private String nome;
	// private int pontos; -- a fazer
	@OneToMany(mappedBy="doador")
	private List<Compra> compras;
	
	public Doador(){}
	
	public Doador(long id, String nome, List<Compra> compras) {
		super();
		this.id = id;
		this.nome = nome;
		this.compras = compras;
	}
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
	public List<Compra> getCompras() {
		return compras;
	}
	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}
	
	

}
