package com.sanjayacchana.springDemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create an array of strings
	private String[] teams = {
			"Mumbai Indains",
			"Delhil Capitals",
			"Royal Challengers Banglore",
			"Other Teams"
	};
	
	// create  a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(teams.length);
		
		String myTeam = teams[index];
		if(myTeam != null) {
			return myTeam;
		}
		
		return "Other team";
		
	}

}
