package br.com.omega.natura.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import br.com.omega.natura.entity.Projeto;
import br.com.omega.natura.repository.ProjetoRepository;
import br.com.omega.natura.service.ProjetosService;

@Component
public class ProjetoServiceImpl implements ProjetosService{

	@Autowired
	private ProjetoRepository repository;
	
	@Override
	public void save(Projeto projeto) {
		repository.save(projeto);
	}

	@Override
	public Projeto findOne(long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Projeto> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	
	
}
