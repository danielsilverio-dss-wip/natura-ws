package br.com.omega.natura.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_produto_projeto")
@IdClass(ProdutosPorProjetoPK.class)
public class ProdutosPorProjeto {
	
	@Id
	@JoinColumn(name="id_produto")
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Produto produto;
	
	@Id
	@JoinColumn(name="id_projeto")
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Projeto projeto;
	
	@Column(name="vl_quantidade")
	private int quantidade;

	public ProdutosPorProjeto() {
		super();
	}
	
	public ProdutosPorProjeto(Produto produto, Projeto projeto, int quantidade) {
		super();
		this.produto = produto;
		this.projeto = projeto;
		this.quantidade = quantidade;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
