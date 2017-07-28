package br.com.omega.natura.service;

import java.util.List;

import br.com.omega.natura.entity.Produto;

public interface ProdutosService {
	
	public void save(Produto produto);
	public Produto findOne(long id);
	public List<Produto> findAll();

}
