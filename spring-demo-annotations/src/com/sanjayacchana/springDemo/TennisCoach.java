package com.sanjayacchana.springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// using di via constructor
	
	/*
	 * @Autowired public TennisCoach(FortuneService thefortuneService) {
	 * fortuneService = thefortuneService; }
	 */
	
	public TennisCoach() {
		System.out.println("inside default constructor: TennisCoach");
	}
	
	
	//define my init method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("DO my Startup stuff: inside TennisCoach");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("DO my CleanUp Stuff: inside TennisCaoch");
	}
	
	
	
	
	// define the setter method
	// using di via setter method
	/*
	 * @Autowired public void setFortuneService(FortuneService thefortuneService) {
	 * System.out.println("inside setter method: TennisCoach"); fortuneService =
	 * thefortuneService; }
	 */
	
	

	@Override
	public String getDailyWorkOut() {
		return "Pratice same backhand valley ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
