package com.sanjayacchana.springDemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is not great day for me";
	}

}
