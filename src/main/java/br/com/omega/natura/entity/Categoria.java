package br.com.omega.natura.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_categoria")
public class Categoria {
	
	@Id
	@Column(name="id_categoria")
	private long id;
	@Column(name="nm_categoria")
	private String nome;
	/*
	@OneToMany(mappedBy="categoria")
	private List<Produto> produtos;
	*/
	public Categoria(){};
	
	public Categoria(long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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
	
}
