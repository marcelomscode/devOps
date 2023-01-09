package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Moeda;
import com.example.demo.model.Quadros;
import com.example.demo.repositories.QuadrosRepository;
import com.example.demo.util.SendEmailCotacao;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;


@RestController
@RequestMapping(value ="/hello")
public class HelloControllerTeste {
	
    @Autowired QuadrosRepository quadrosRepository;
	
//	@GetMapping("/pegar")
//	public Moeda teste(@RequestParam("moeda") String moeda, @RequestParam("emailPara") String emailPara) throws JsonMappingException, JsonProcessingException {
//		
//		SendEmailCotacao send = new SendEmailCotacao();
//		
//		Moeda m = send.sendMailSend(moeda, emailPara);
//		
//	 return m;
//		
//	}

	@GetMapping()
	public String hello() {
		List<Quadros> q = quadrosRepository.findAll();
		
    	return q.get(0).getNome();
	}
	
}
