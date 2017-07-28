package br.com.omega.natura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.omega.natura.entity.Produto;
import br.com.omega.natura.service.ProdutosService;

@RestController
@RequestMapping("/produto")
public class ProdutosController {
	
	@Autowired
	private ProdutosService service;
	
	public void save(Produto produto){
		service.save(produto);
	}
	
	public Produto findOne(long id){
		return service.findOne(id);
	}
	
	public List<Produto> findAll(){
		return service.findAll();
	}
	
}
