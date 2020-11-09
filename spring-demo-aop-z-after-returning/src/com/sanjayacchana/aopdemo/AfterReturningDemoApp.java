package com.sanjayacchana.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sanjayacchana.aopdemo.dao.AccountDao;

public class AfterReturningDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDao theAccountDao = context.getBean("accountDao", AccountDao.class);
		
		
		//call methods to find the accounts
		List<Account> theAccounts = theAccountDao.findAccounts();
		
		//display the accounts
		System.out.println("\n\nMain Program : AfterReturningDemoApp");
		System.out.println("------");
		System.out.println(theAccounts);
		System.out.println("\n");
		
		//close the context
		context.close();
	}

}
