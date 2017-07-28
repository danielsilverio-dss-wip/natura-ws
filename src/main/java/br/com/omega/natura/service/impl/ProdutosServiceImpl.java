package br.com.omega.natura.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.collect.Lists;

import br.com.omega.natura.entity.Produto;
import br.com.omega.natura.repository.ProdutoRepository;
import br.com.omega.natura.service.ProdutosService;

public class ProdutosServiceImpl implements ProdutosService{

	@Autowired
	private ProdutoRepository repository;
	
	@Override
	public void save(Produto produto) {
		repository.save(produto);
	}

	@Override
	public Produto findOne(long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Produto> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

}
