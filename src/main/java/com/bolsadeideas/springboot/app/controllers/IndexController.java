package com.bolsadeideas.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@Value("${application.controllers.mensaje}")
	private String hola;
	
	@GetMapping("/")
	public String hola(Model model) {
		model.addAttribute("hola", hola);
		
		return "hola";
	}
}
