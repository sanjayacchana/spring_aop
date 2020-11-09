package com.sanjayacchana.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		
		// retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean 
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		System.out.println(" just do this "+theCoach.getDailyFortune());
		
		//close the context
		
		context.close();

	}

}
