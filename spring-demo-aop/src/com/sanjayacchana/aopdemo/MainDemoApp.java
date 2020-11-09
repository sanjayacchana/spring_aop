package com.sanjayacchana.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sanjayacchana.aopdemo.dao.AccountDao;
import com.sanjayacchana.aopdemo.dao.MembershipDao;

public class MainDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDao theAccountDao = context.getBean("accountDao", AccountDao.class);
		
		//get the bean from spring container
		MembershipDao theMembershipDao = context.getBean("membershipDao", MembershipDao.class);
		
		//call the business method
		theAccountDao.addAccount();
		theMembershipDao.addMembershipAccount();
		
		//close the context
		context.close();
	}

}
