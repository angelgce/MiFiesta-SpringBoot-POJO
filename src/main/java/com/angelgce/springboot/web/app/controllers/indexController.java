package com.angelgce.springboot.web.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.angelgce.springboot.web.app.emptity.Fiesta;

@Controller //Le indico a Spring que esto sera un control
public class indexController {
	
	@Autowired//inyecto la lista desde el controlador
	Fiesta invitados; //Creo la llamada a mi objeto
	
	@GetMapping({"/","index","","home"}) //mapeo la url
	public String index(Model model) {
		model.addAttribute("lista",invitados);//le paso el objeto a la vista
		model.addAttribute("titulo","Invitados a mi fiesta"); // un titulo bonito
		return "index";
	}
	


}
