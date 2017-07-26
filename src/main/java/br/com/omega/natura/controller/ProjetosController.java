package br.com.omega.natura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.omega.natura.entity.Projeto;
import br.com.omega.natura.service.ProjetoService;

@RestController
public class ProjetosController {
	
	@Autowired
	private ProjetoService service;
	
	public void save(Projeto projeto){
		service.save(projeto);
	}

}
