package br.com.omega.natura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.omega.natura.entity.Categoria;
import br.com.omega.natura.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping
	public List<Categoria> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Categoria findOne(@PathVariable(name="id") long id){
		return service.findOne(id);
	}
	
	@PostMapping
	public void save(@RequestBody Categoria categoria){
		service.save(categoria);
	}

}
