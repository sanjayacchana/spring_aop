package com.sanjayacchana.springDemo;

public class BaseballCoach implements Coach{
	
	// define the private field for the depenency
	
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	
	public  BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes of batting pratice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneservice to get a fortune
		return fortuneService.getFortune();
	}

}
