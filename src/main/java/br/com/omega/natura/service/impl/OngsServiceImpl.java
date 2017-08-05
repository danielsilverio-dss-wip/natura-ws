package br.com.omega.natura.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import br.com.omega.natura.entity.Ong;
import br.com.omega.natura.repository.OngRepository;
import br.com.omega.natura.service.OngsService;

@Component
public class OngsServiceImpl implements OngsService {

	@Autowired
	private OngRepository repository;
	
	
	@Override
	public void save(Ong ong) {
		repository.save(ong);
		
	}

	@Override
	public Ong findOne(long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Ong> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public boolean login(String email, String senha) {
		return false;
	}

}
