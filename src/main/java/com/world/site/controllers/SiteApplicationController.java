package com.world.site.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteApplicationController {

	@RequestMapping("/")
	public String index(){
		System.out.println("Carregando os produtos");
		return "helloworld";
	}
	

	@RequestMapping("/home")
	public void home() {
		// aqui ainda vamos carregar os produtos.
		System.out.println("Carregando os produtos");
	}



}
