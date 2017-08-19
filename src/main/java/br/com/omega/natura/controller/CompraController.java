package br.com.omega.natura.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.omega.natura.entity.Compra;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@GetMapping
	public List<Compra> findAll(){
		return null;
		//return service.findAll();
	}

}
