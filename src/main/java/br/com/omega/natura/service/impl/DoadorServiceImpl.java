package br.com.omega.natura.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.omega.natura.entity.Doador;
import br.com.omega.natura.repository.DoadorRepository;
import br.com.omega.natura.service.DoadorService;

@Component
public class DoadorServiceImpl implements DoadorService{

	@Autowired
	private DoadorRepository repository; 
	
	@Override
	public void save(Doador doador) {
		repository.save(doador);
	}

	@Override
	public Doador findOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doador> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
