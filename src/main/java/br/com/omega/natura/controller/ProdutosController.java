package br.com.omega.natura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.omega.natura.entity.Produto;
import br.com.omega.natura.service.ProdutosService;

@RestController
@RequestMapping("/produto")
public class ProdutosController {
	
	@Autowired
	private ProdutosService service;

	@GetMapping
	public List<Produto> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Produto findOne(@PathVariable(name="id") long id){
		return service.findOne(id);
	}
	
	@PostMapping
	public void save(@RequestBody Produto produto){
		service.save(produto);
	}
		
}
