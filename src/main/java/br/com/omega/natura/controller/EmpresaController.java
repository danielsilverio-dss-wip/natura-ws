package br.com.omega.natura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.omega.natura.entity.Empresa;
import br.com.omega.natura.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
	
	@Autowired
	private EmpresaService service;
	
	@GetMapping
	private List<Empresa> findAll(){
		return service.findAll();
	}
	
	@PostMapping
	private void save(@RequestBody Empresa empresa){
		service.save(empresa);
	}
	
	@GetMapping("/{id}")
	private Empresa findOne(@PathVariable(name="id") long id){
		return service.findOne(id);
	}

}
