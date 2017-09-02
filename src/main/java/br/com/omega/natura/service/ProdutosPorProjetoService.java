package br.com.omega.natura.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.omega.natura.entity.ProdutosPorProjeto;

@Service
public interface ProdutosPorProjetoService {

	public void save(ProdutosPorProjeto produtosPorProjeto);
	public List<ProdutosPorProjeto> findAll();
	public ProdutosPorProjeto findOne(long id);
	
}
