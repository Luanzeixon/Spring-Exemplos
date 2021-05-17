package br.edu.ifrn.helloword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/tornarMaiuscula2")
public class maiusculaController2 {
	@GetMapping("/")
	public String entrar() {
		return "maiuscula2";
	}
	@GetMapping("/tranformar2")
	public String tranformar2(
			@RequestParam("texto") String texto, ModelMap model
			) {
		String maiusculo = texto.toUpperCase();
		model.addAttribute("textoMaiusculo", maiusculo);
		
		return "maiuscula2" ;
	}
}
