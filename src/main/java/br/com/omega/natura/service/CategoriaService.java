package br.com.omega.natura.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.omega.natura.entity.Categoria;

@Service
public interface CategoriaService {
	
	public void save(Categoria categoria);
	public Categoria findOne(long id);
	public List<Categoria> findAll();

}
