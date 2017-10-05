package br.com.omega.natura.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_projeto")
public class Projeto {
	
	@Id
	@Column(name="id_projeto")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="nm_projeto")
	private String nome;
	@Column(name="ds_descricao")
	private String descricao;
	@Column(name="ds_imagem")
	private byte[] imagem;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_ong")
	private Ong ong;
	
	@JsonIgnore
	@OneToMany(mappedBy="projeto", fetch=FetchType.EAGER)
	private List<ProdutosPorProjeto> produtosPorProjeto;
	/*
	@OneToMany(mappedBy="projeto")
	private List<Compra> compras;
	*/
	public Projeto(){}

	public Projeto(long id, String nome, String descricao, byte[] imagem, Ong ong, List<ProdutosPorProjeto> produtosPorProjeto) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.imagem = imagem;
		this.ong = ong;
		this.produtosPorProjeto = produtosPorProjeto;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public Ong getOng() {
		return ong;
	}

	public void setOng(Ong ong) {
		this.ong = ong;
	}

	public List<ProdutosPorProjeto> getProdutosPorProjeto() {
		return produtosPorProjeto;
	}

	public void setProdutosPorProjeto(List<ProdutosPorProjeto> produtosPorProjeto) {
		this.produtosPorProjeto = produtosPorProjeto;
	}

}
