package br.com.omega.natura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.omega.natura.entity.Ong;
import br.com.omega.natura.entity.Projeto;
import br.com.omega.natura.service.OngsService;

@RestController
@RequestMapping("/ong")
public class OngController {

	@Autowired
	private OngsService service;

	@PostMapping
	public void save(Ong ong){
		service.save(ong);
	}

	@GetMapping("/{id}")
	public Ong findOne(@PathVariable(name="id")long id){
		return service.findOne(id);	
	}

}
