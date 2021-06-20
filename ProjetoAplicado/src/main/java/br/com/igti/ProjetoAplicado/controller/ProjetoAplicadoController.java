package br.com.igti.ProjetoAplicado.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjetoAplicadoController {

	@GetMapping("/")
	public String helloWorld() {
		return "Hello World! Version 1.0!";
	}

}
