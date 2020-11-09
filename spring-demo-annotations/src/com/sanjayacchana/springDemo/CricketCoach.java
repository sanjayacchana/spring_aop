package com.sanjayacchana.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService theFortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.email}")
	private String team;
	
	
	 public CricketCoach() {
		 System.out.println("inside default constructor: CricketCoach");
	}
	 
	
	@Override
	public String getDailyWorkOut() {
		System.out.println("Eami: " + email);
		return "Pratice huge hiting ";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("Team: "+ team);
		return theFortuneService.getFortune();
	}
	
}
