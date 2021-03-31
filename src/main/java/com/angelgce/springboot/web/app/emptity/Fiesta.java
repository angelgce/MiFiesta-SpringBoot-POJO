package com.angelgce.springboot.web.app.emptity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component //Declaro que esta clase sera un componente de spring
public class Fiesta {//Creo mi clase para administrar La Fiesta

	@Autowired //inyecto los datos desde el controlador
	List<Persona> items;

	public Fiesta() {

	}
	public Fiesta(List<Persona> items) {
		this.items = items;
	}

	public List<Persona> getItems() {
		return items;
	}

	public void setItems(List<Persona> items) {
		this.items = items;
	}



	

}
