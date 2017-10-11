package br.com.omega.natura.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.omega.natura.entity.Projeto;

public interface ProjetosRepository extends CrudRepository<Projeto, Long>{

	List<Projeto> findByOngId(long id);	
}
