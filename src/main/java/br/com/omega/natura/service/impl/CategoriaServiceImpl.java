package br.com.omega.natura.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import br.com.omega.natura.entity.Categoria;
import br.com.omega.natura.repository.CategoriaRepository;
import br.com.omega.natura.service.CategoriaService;

@Component
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	private CategoriaRepository repository;
	
	@Override
	public void save(Categoria categoria) {
		repository.save(categoria);
	}

	@Override
	public Categoria findOne(long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Categoria> findAll() {
		return Lists.newArrayList(repository.findAll());
	}
	
	

}
