package br.com.omega.natura.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_projeto")
public class Projeto {
	
	@Id
	@Column(name="id_projeto")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="nm_projeto")
	private String nome;
	@Column(name="ds_descricao")
	private String descricao;
	
	public Projeto(){}
	
	public Projeto(int id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
	
	

}
