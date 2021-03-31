package com.angelgce.springboot.web.app;

import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.angelgce.springboot.web.app.emptity.Persona;

@Configuration // Declaro como configuracion mi clase
public class appConfig { 
	//Controladores
	
	@Bean("listaPersonas") //Declaro la etiqueta Bean
	@Primary // La declaro como primaria
	public List<Persona> lista_invitados(){ //Relleno mi Lista de invitados
		Persona persona1 = new Persona("Pedro","Jimenez","pedro@mail.com","9933660202");
		Persona persona2 = new Persona("Yami","Sanchez","yami@mail.com","5445121561");
		Persona persona3 = new Persona("Asta","Malaga","Asta@mail.com","3423423234");
		Persona persona4 = new Persona("Yuno","Perez","Yuno@mail.com","3676234243");
		return Arrays.asList(persona1,persona2,persona3,persona4); 
	}

}
