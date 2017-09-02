package br.com.omega.natura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.omega.natura.entity.ProdutosPorProjeto;
import br.com.omega.natura.service.ProdutosPorProjetoService;

@RestController
@RequestMapping("/produtosPorProjeto")
public class ProdutosPorProjetoController {
	
	@Autowired
	private ProdutosPorProjetoService service;
	
	@PostMapping
	public void save(@RequestBody ProdutosPorProjeto produtosPorProjeto){
		service.save(produtosPorProjeto);
	}
	
	@GetMapping
	public List<ProdutosPorProjeto> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public ProdutosPorProjeto findOne(@PathVariable(name="id") long id){
		return service.findOne(id);
	}
	
	

}
