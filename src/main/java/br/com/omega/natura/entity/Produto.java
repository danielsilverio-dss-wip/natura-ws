package br.com.omega.natura.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_produto")
public class Produto {
	
	@Id
	@Column(name="id_produto")
	private long id;
	@Column(name="nm_produto")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria categoria;
	
	@ManyToMany
	@JoinTable(name="tb_produto_empresa",
			joinColumns=@JoinColumn(name="id_produto"),
			inverseJoinColumns=@JoinColumn(name="id_empresa"))
	private List<Empresa> empresas;
	
	public Produto(){}

	public Produto(long id, String nome, Categoria categoria, List<Empresa> empresas) {
		super();
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.empresas = empresas;
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	};
		
}
