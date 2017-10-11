package br.com.omega.natura.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import br.com.omega.natura.entity.Produto;
import br.com.omega.natura.entity.Projeto;
import br.com.omega.natura.repository.ProjetosRepository;
import br.com.omega.natura.service.ProjetosService;

@Component
public class ProjetosServiceImpl implements ProjetosService{
	
	@Autowired
	private ProjetosRepository repository;
	
	@Override
	public Projeto save(Projeto projeto) {
		return repository.save(projeto);
	}

	@Override
	public Projeto findOne(long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Projeto> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public List<Projeto> findByOngId(long id) {
		return repository.findByOngId(id);
	}

}
