package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("objetivos-semana")

public class ObjetivosSemanaController {
	@GetMapping
	public String ObjetivosSemana() {
		return	"\nMeus Objetivos de Aprendizagem Nesta Semana São:"
				+ "\n"
				+ "\n\t*Me dedicar profundamente aos códigos de Banco de Dados e Spring;"
				+ "\n\t*Revisar Lógica de Programação;";
				
	}

}
