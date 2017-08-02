package br.com.omega.natura.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.omega.natura.entity.Produto;

@Service
public interface ProdutosService {
	
	public void save(Produto produto);
	public Produto findOne(long id);
	public List<Produto> findAll();

}
