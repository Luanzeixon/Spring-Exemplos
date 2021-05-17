package br.edu.ifrn.helloword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class inicioController {
	
	@GetMapping("/helloworld") // quando a url for chamada(getmapping), o metodo "home" sera chamado e caregara a pagina retornada(helloWorld.html). 
	public String home(ModelMap model) { //adiciona texto na pagina html
		model.addAttribute("texto","Olá, mundo ");
		return "helloWorld";
	}

}
