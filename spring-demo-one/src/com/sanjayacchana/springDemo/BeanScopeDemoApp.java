package com.sanjayacchana.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationcontext.xml");
		
		//retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are same
		boolean result = (theCoach == alphaCoach);
		
		//print the result
		System.out.println("\nPointing to same object:  "+result);
		System.out.println("\n Memory location for theCoach: "+ theCoach);
		System.out.println("\n Memory location for alphaCoach: "+ alphaCoach);
		
		
		// lets call the methods 
		
		//close 
		context.close();

	}

}
