package br.com.omega.natura.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.omega.natura.entity.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

}
