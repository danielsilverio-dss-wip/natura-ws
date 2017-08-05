package br.com.omega.natura.service.impl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.omega.natura.entity.Empresa;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Long>{

}
