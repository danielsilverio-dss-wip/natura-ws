package br.com.omega.natura.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_produto")
	private long id;
	@Column(name="nm_produto")
	private String nome;

	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria categoria;

	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="tb_produto_empresa",
			joinColumns=@JoinColumn(name="id_produto"),
			inverseJoinColumns=@JoinColumn(name="id_empresa"))
	private List<Empresa> empresas;

	public Produto(){}

	public Produto(long id, String nome) {
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
