package br.com.omega.natura.entity;

import java.io.Serializable;

public class ProdutosPorProjetoPK implements Serializable{
	
	private long produto;
	private long projeto;
	
	public ProdutosPorProjetoPK() {
		super();
	}

	public ProdutosPorProjetoPK(int produto, int projeto) {
		super();
		this.produto = produto;
		this.projeto = projeto;
	}

	public long getProduto() {
		return produto;
	}

	public void setProduto(long produto) {
		this.produto = produto;
	}

	public long getProjeto() {
		return projeto;
	}

	public void setProjeto(long projeto) {
		this.projeto = projeto;
	}

	
	
}
