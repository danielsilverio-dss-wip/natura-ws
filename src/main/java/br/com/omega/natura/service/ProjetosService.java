package br.com.omega.natura.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.omega.natura.entity.Projeto;

@Service
public interface ProjetosService {
	
	public Projeto save(Projeto projeto);
	public Projeto findOne(long id);
	public List<Projeto> findAll();

}
