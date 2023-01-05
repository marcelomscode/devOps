package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import model.Feedback;
import model.Moeda;
import model.Propriedades;
import util.SendEmailCotacao;


@RestController
@RequestMapping(value ="/hello")
public class HelloControllerTeste {
	
	
	
	@GetMapping
	public Moeda teste(@RequestParam("moeda") String moeda, @RequestParam("emailPara") String emailPara) throws JsonMappingException, JsonProcessingException {
		
		SendEmailCotacao send = new SendEmailCotacao();
		
		Moeda m = send.sendMailSend(moeda, emailPara);
		
	 return m;
		
	}

	@GetMapping
	public String hello() {
    	return "Hello world HOSTINGER YOUR SUCK, Again, and, one more thing !";
	}
	
	
}
