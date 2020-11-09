package com.sanjayacchana.springDemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run hard daily 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "today is your lucky day...";
	}
	
	// add an init method
	
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	
	//add a destroy method
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach: inside method doMyCleanUpStuff");
	}

}
