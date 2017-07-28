package br.com.omega.natura.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.omega.natura.entity.Ong;
import br.com.omega.natura.entity.Projeto;

@Service
public interface OngsService {
	public void save(Ong ong);
	public Ong findOne(long id);
//  public List<Projeto>findAll();
	

}
