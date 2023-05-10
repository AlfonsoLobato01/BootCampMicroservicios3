package com.nttdata.bootcamp.estados;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="estados")
public class Estados {
	
	private List<String> listaEstado = new ArrayList<>();
	
	@ReadOperation
	public List<String> listEstados(){
		return listaEstado;
	}
	
	@WriteOperation
	public void saveEstado(@Selector String estadoNuevo) {
		
		listaEstado.add(estadoNuevo);
	}
	
	@DeleteOperation
	public void deleteEstado(@Selector String estadoBorrar) {
		listaEstado.remove(estadoBorrar);
	}
	
	
	

}
