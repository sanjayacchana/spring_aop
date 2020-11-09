package com.sanjayacchana.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {
	
	public String getFortune() {
		
		//simulate the dealy
		try {
			TimeUnit.MILLISECONDS.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//return the fortune
		return "Except heavy traffic this morning";
	}

	public String getFortune(boolean tripwire) {
		
		if(tripwire) {
			throw new RuntimeException("High way is closed...");
		}
		
		return getFortune();
	}

}
