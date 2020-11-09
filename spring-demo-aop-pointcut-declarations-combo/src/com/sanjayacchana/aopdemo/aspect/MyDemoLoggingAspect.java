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
	
	//create a pointcut for setter methods
	@Pointcut("execution(* com.sanjayacchana.aopdemo.dao.*.set*(..))")
	private void setter() {}
	
	//create a pointcut for getter methods
	@Pointcut("execution(* com.sanjayacchana.aopdemo.dao.*.get*(..))")
	private void getter() {}
	
	//create pointcut: include forDaoPackage() , exclude setter() and getter()
	@Pointcut("forDaoPackage() && !(setter() || getter())")
	private void forDaoPackageNoSetterGetter() {}
	
	//this is where we add all of our related advices for logging
	
	//let's start with @Before() advice
	
	@Before("forDaoPackageNoSetterGetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n\n======> Executing @Before Advice on "+getClass().getName());
	}
	
	@Before("forDaoPackageNoSetterGetter()")
	public void performingApiAnalytics() {
		System.out.println("======> Performing API Analytics here");
	}

}
