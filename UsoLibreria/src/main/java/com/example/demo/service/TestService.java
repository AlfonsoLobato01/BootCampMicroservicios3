package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.saludo;

@Service
public class TestService {
	
	public String usoSaludo(String idioma) {
		saludo claseSaludo = new saludo(idioma);
		return claseSaludo.mensajeSaludo();
	}

}
