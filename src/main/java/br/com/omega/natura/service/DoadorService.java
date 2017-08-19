package br.com.omega.natura.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.omega.natura.entity.Doador;

@Service
public interface DoadorService {
	
	public void save(Doador doador);
	public Doador findOne(long id);
	public List<Doador> findAll();

}
