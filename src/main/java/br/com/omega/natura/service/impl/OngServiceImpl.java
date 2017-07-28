package br.com.omega.natura.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.omega.natura.entity.Ong;
import br.com.omega.natura.repository.OngRepository;
import br.com.omega.natura.service.OngsService;

@Component
public class OngServiceImpl implements OngsService {

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

}
