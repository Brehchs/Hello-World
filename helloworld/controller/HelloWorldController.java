package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica que vai conter uma classe controllador
@RequestMapping ("/hello-world") // define o nome do endpoint
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "\n______________________________________________"
				+ "SALVE FAMÍLIA!!"
				+ "\n______________________________________________";
	}

}
