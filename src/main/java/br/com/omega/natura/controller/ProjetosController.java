package br.com.omega.natura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.omega.natura.entity.Projeto;
import br.com.omega.natura.service.ProjetosService;

@RestController
@RequestMapping("/projeto")
public class ProjetosController{
	
	@Autowired
	private ProjetosService service;
	
	@PostMapping
	public void save(@RequestBody Projeto projeto){
		System.out.println("-------------save-------------");
		System.out.println("nome: " + projeto.getNome());
		System.out.println("descricao: " + projeto.getDescricao());
		service.save(projeto);
	}

	@GetMapping("/{id}")
	public Projeto findOne(@PathVariable(name="id") long id) {
		return service.findOne(id);
	}

	@GetMapping
	public List<Projeto> findAll() {
		return service.findAll();
	}
	

}
