package com.proyecto.clientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	//Creamos un metodo en el cual vamos a poder hacer el llamado a la pagina home
	//Todos los metodos dentro de un Controller deben mapearse a una url en especifico
	
	@GetMapping("/index")
	public String index() {
		return "home";
	}

}
