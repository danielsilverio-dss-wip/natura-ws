package br.com.omega.natura.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import br.com.omega.natura.entity.ProdutosPorProjeto;
import br.com.omega.natura.repository.ProdutosPorProjetoRepository;
import br.com.omega.natura.service.ProdutosPorProjetoService;

@Component
public class ProdutosPorProjetoServiceImpl implements ProdutosPorProjetoService{

	@Autowired
	private ProdutosPorProjetoRepository repository;
	
	@Override
	public void save(ProdutosPorProjeto produtosPorProjeto) {
		repository.save(produtosPorProjeto);
	}

	@Override
	public List<ProdutosPorProjeto> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public ProdutosPorProjeto findOne(long id) {
		return repository.findOne(id);
	}

}
