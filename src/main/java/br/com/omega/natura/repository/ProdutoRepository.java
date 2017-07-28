package br.com.omega.natura.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.omega.natura.entity.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{
	
}
