package br.com.omega.natura.service;

import java.util.List;

import br.com.omega.natura.entity.Empresa;

public interface EmpresaService {
	
	public void save(Empresa empresa);
	public Empresa findOne(long id);
	public List<Empresa> findAll();

}
