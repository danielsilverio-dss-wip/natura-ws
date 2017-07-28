package br.com.omega.natura.entity;

import java.io.Serializable;

public class ProdutosPorProjetoPK implements Serializable{
	
	private int produto;
	private int projeto;
	
	public ProdutosPorProjetoPK() {
		super();
	}

	public ProdutosPorProjetoPK(int produto, int projeto) {
		super();
		this.produto = produto;
		this.projeto = projeto;
	}

	public int getProduto() {
		return produto;
	}

	public void setProduto(int produto) {
		this.produto = produto;
	}

	public int getProjeto() {
		return projeto;
	}

	public void setProjeto(int projeto) {
		this.projeto = projeto;
	}
	
}
