package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.QuadrosValores;
import com.example.demo.repositories.QuadrosRepository;
import com.example.demo.repositories.QuadrosValoresRepository;


@RestController
@RequestMapping(value ="/api")
public class HelloControllerTeste {
	
    @Autowired QuadrosRepository quadrosRepository;
    @Autowired QuadrosValoresRepository quadrosV;
	
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

    @GetMapping
	  public List<QuadrosValores> hello() {
		  List<QuadrosValores> v = quadrosV.findAll();
	  return v; 
	  }
	
}
