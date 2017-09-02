package br.com.omega.natura.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_produto_projeto")
public class ProdutosPorProjeto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_produto_projeto")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="id_produto")
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name="id_projeto")
	private Projeto projeto;
	
	@Column(name="vl_quantidade_final")
	private int quantidadeFinal;
	
	@Column(name="vl_quantidade_arrecadada")
	private int quantidadeArrecadada;

	public ProdutosPorProjeto(){}
	
	public ProdutosPorProjeto(Produto produto, Projeto projeto, int quantidadeFinal, int quantidadeArrecadada) {
		super();
		this.produto = produto;
		this.projeto = projeto;
		this.quantidadeFinal = quantidadeFinal;
		this.quantidadeArrecadada = quantidadeArrecadada;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public int getQuantidadeFinal() {
		return quantidadeFinal;
	}

	public void setQuantidadeFinal(int quantidadeFinal) {
		this.quantidadeFinal = quantidadeFinal;
	}

	public int getQuantidadeArrecadada() {
		return quantidadeArrecadada;
	}

	public void setQuantidadeArrecadada(int quantidadeArrecadada) {
		this.quantidadeArrecadada = quantidadeArrecadada;
	}
	
	
	
}
