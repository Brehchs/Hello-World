package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/bsm")

public class BsmController {
	@GetMapping
	public String Bsm() {
		return	"\n\tAs BSM's da Generation Brasil são:"
				+"\n___________________________________________"
				+ "\n"
				+"\n\t-Mentalidade de Cresimento;\"\r\n"
				+"\n\t-Persistência;\"\r\n"
				+"\n\t-Responsabilidade Pessoal;\"\r\n"
				+"\n\t-Orientação ao Futuro;\"\r\n"
				+"\n\t-Comunicação;\"\r\n"
				+"\n\t-Orientação ao Detalhe;\"\r\n"
				+"\n\t-Proatividade\"\r\n"
				+"\n\t-Trabalho em Equipe;\"\r\n";

	}
}
