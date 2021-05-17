package br.edu.ifrn.helloword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifrn.helloword.dominio.Texto;

@Controller
@RequestMapping("/tornarMaiuscula") //essa classe vai responder por essa url
public class maiusculaController {
	
	@GetMapping("/")
	public String entrar(Texto texto) {
		return "maiuscula";
		
	}
	@PostMapping("/transformar") //PostMapping mais recomendado para form, pois é mais seguro
	public String transformar(Texto texto, ModelMap model) {
		String maiuscula = texto.getConteudo().toUpperCase();
		model.addAttribute("textoMaiusculo", maiuscula); 
		return "maiuscula";
	}
	
}
