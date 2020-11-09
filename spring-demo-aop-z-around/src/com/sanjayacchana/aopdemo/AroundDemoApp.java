package com.sanjayacchana.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sanjayacchana.aopdemo.service.TrafficFortuneService;

public class AroundDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		TrafficFortuneService trafficFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		System.out.println("\nMain method: AroundDemoApp");
		
		System.out.println("Calling fortune service");
		
		String data = trafficFortuneService.getFortune();
		
		System.out.println("\n My fortune is : "+data);
		
		System.out.println("finished");
		
		
		//close the context
		context.close();
	}

}
