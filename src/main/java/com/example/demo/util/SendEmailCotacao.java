package com.example.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.EmailCfg;
import com.example.demo.model.Feedback;
import com.example.demo.model.Moeda;
import com.example.demo.model.Propriedades;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

//@Component
public class SendEmailCotacao {
	
//	@Autowired
//	public EmailCfg emailCfg;
//	
//	@Autowired
//	RestTemplate restTemplate;
//	
//	@Autowired
//	public SendEmailCotacao sendMail;
//	
//	@Autowired
//	public Propriedades prop;
//
//	
//	public void sendEmail(Moeda moeda, Feedback feed, String emailPara) {
//		
//		feed.setEmail("marcelomscode@hotmail.com");
//
//		
//		//Create mail sender
//		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//		mailSender.setHost(this.emailCfg.getHost());
//		mailSender.setPort(this.emailCfg.getPort());
//		mailSender.setUsername(this.emailCfg.getUsername());
//		mailSender.setPassword(this.emailCfg.getPassword());
//		
//		
//		//Create a mail sender
//		SimpleMailMessage mailMessage = new SimpleMailMessage();
//		mailMessage.setFrom(feed.getEmail());
//		mailMessage.setTo(emailPara);
//		mailMessage.setSubject("Cotação de " + moeda.getEURBRL().getCode());
//		mailMessage.setText("A cotação da Moeda "+ moeda.getEURBRL().getCode() + " está no valor de: " + moeda.getEURBRL().getBid());
//		
//		//Send email
//		mailSender.send(mailMessage);
//		
//	}
//	
//	public Moeda sendMailSend(String moeda, String emailPara) throws JsonMappingException, JsonProcessingException {
//		Moeda m = getCurrency(moeda);
//		
//		Feedback feed = new Feedback();
//		feed.setEmail("marcelomscode@gmail.com");
//		sendMail.sendEmail(m,feed, emailPara);
//		return m;
//	}
//	
//	private Moeda getCurrency(String currency) throws JsonMappingException, JsonProcessingException {
//		
//		  ResponseEntity<Moeda> entity = restTemplate.getForEntity(prop.getUrl() + currency, Moeda.class); 
//		  
//		  return entity.getBody();
//		}
//	
//	
	
	
}
