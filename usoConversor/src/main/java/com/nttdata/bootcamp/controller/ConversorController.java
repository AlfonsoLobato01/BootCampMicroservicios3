package com.nttdata.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.service.ConversorService;

@RequestMapping("/api")
@RestController
public class ConversorController {
	
	@Autowired
	ConversorService conversorService;
	
	@GetMapping("/conversor/{temperatura}/{tipo}")
	public double saludo(@PathVariable("temperatura") double temperatura, @PathVariable("tipo") char tipo) {
		double conversor = conversorService.usoConversor(temperatura, tipo);
		return conversor;
		
	}

}
