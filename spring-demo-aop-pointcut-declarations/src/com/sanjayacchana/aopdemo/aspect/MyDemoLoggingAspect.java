package com.sanjayacchana.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	//decalre pointcut expression which enables us to use in multiple places
	@Pointcut("execution(* com.sanjayacchana.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	//this is where we add all of our related advices for logging
	
	//let's start with @Before() advice
	
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n\n======> Executing @Before Advice on "+getClass().getName());
	}
	
	@Before("forDaoPackage()")
	public void performingApiAnalytics() {
		System.out.println("\n\n======> Performing API Analytics here");
	}

}
