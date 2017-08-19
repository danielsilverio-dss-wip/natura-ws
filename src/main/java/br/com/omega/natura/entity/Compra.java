package br.com.omega.natura.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_compra")
public class Compra {
	
	@Id
	@Column(name="id_compra")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@ManyToOne
	@JoinColumn(name="id_projeto")
	private Projeto projeto;
	@ManyToOne
	@JoinColumn(name="id_produto")
	private Produto produto;
	@ManyToOne
	@JoinColumn(name="id_doador")
	private Doador doador;
	@Column(name="nr_quantidade")
	private int quantidade;
	
	public Compra(){}
	
	public Compra(long id, Projeto projeto, Produto produto, Doador doador, int quantidade) {
		super();
		this.id = id;
		this.projeto = projeto;
		this.produto = produto;
		this.doador = doador;
		this.quantidade = quantidade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Doador getDoador() {
		return doador;
	}

	public void setDoador(Doador doador) {
		this.doador = doador;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
