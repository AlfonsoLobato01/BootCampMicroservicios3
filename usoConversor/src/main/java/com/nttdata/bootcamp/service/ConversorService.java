package com.nttdata.bootcamp.service;

import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.conversionTemperatura;

@Service
public class ConversorService {
	
	public double usoConversor(double temperatura, char tipo) {
		conversionTemperatura claseTemperatura = new conversionTemperatura(temperatura, tipo);
		return claseTemperatura.convertirTemperatura();
	}

}
