package br.com.omega.natura.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import br.com.omega.natura.entity.Empresa;
import br.com.omega.natura.service.EmpresaService;

@Component
public class EmpresaServiceImpl implements EmpresaService{

	@Autowired
	private EmpresaRepository repository;
	
	@Override
	public void save(Empresa empresa) {
		repository.save(empresa);
	}

	@Override
	public Empresa findOne(long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Empresa> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

}
