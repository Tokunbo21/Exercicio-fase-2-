package com.Exerciciostring.boot.conytolle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 
public class Springexercicio {
	
	@GetMapping("/Boot")
	public String Exercicio () {
		return "Exercico 1 feito quase lá";
	}
	
	@GetMapping("/Boot2")
	public String Exercicio2 () {
		return "Exercico 2 ja posso chorar de felicidade";
	}

}
