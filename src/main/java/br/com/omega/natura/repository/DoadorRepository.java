package br.com.omega.natura.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import br.com.omega.natura.entity.Doador;

public interface DoadorRepository extends CrudRepository<Doador, Long>{
	
}
