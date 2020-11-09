package com.sanjayacchana.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		// retrieve the bean spring container
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//check if they  both are same
		
		boolean result = (theCoach == alphaCoach);
		
		//print the results
		System.out.println("\nPointing to same object: "+ result);
		System.out.println("\nMemory Location of theCoach: "+ theCoach);
		System.out.println("\nMemory Location of alphaCoach: " + alphaCoach);
		
		//close context
		context.close();
		

	}

}
