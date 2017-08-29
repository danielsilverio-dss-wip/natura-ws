package br.com.omega.natura.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_empresa")
public class Empresa {
	
	@Id
	@Column(name="id_empresa")
	private long id;
	@Column(name="nm_empresa")
	private String nome;
	@Column(name="ds_cnpj")
	private String cnpj;
	/*
	@ManyToMany(mappedBy="empresas")
	private List<Produto> produtos;
	*/
	public Empresa(){};
	
	public Empresa(long id, String nome, String cnpj) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
