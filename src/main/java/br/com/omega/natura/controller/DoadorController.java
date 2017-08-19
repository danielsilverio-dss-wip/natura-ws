package br.com.omega.natura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.omega.natura.entity.Doador;
import br.com.omega.natura.service.DoadorService;

@RestController
@RequestMapping("/doador")
public class DoadorController {
	
	@Autowired
	private DoadorService service;
	
	@GetMapping
	public List<Doador> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Doador findOne(@PathVariable(name="id") long id){
		return service.findOne(id);
	}
	
	@PostMapping
	public void save(@RequestBody Doador doador){
		service.save(doador);
	}
	
}
